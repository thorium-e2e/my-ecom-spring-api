package com.apothuaud.myecom.models;

import org.bson.types.ObjectId;

public class ArrangedPet {

    public String _id;

    public String name;
    public String species;
    public String breed;

    public ResponseLinks links;

    public ArrangedPet(String _id, String name, String species, String breed) {
        this._id = _id;
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.links = new ResponseLinks("/pets/" + _id, null, null);
    }
}
