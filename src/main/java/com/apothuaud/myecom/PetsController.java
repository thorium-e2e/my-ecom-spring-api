package com.apothuaud.myecom;

import com.apothuaud.myecom.models.*;
import com.apothuaud.myecom.repositories.PetsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetsController {

    @Autowired
    private PetsRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Response getAllPets() {

        Response response;

        List pets = repository.findAll();
        List arrangedPets = new ArrayList();
        for (int i = 0; i < pets.size(); i++) {
            Pets pet = (Pets) pets.get(i);
            arrangedPets.add(new ArrangedPet(pet.get_id(), pet.getName(), pet.getSpecies(), pet.getBreed()));
        }

        ResponseLinks links = new ResponseLinks("/pets", null, null);

        ResponsePayload payload = new ResponsePayload(links, arrangedPets);

        response = new Response(true, payload, null);

        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pets getPetById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
        pets.set_id(id);
        repository.save(pets);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Pets createPet(@Valid @RequestBody Pets pets) {
        pets.set_id(ObjectId.get());
        repository.save(pets);
        return pets;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletePet(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}