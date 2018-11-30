package com.apothuaud.myecom.models;

import java.util.List;

public class ResponsePayload {

    public ResponsePayload(ResponseLinks links, List<Object> data) {
        this.links = links;
        this.data = data;
    }

    public ResponseLinks getLinks() {
        return links;
    }

    public void setLinks(ResponseLinks links) {
        this.links = links;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public ResponseLinks links;
    public List data;
}
