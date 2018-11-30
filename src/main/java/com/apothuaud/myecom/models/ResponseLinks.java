package com.apothuaud.myecom.models;

public class ResponseLinks {

    public ResponseLinks(String self, String next, String last) {
        this.self = self;
        this.next = next;
        this.last = last;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String self;
    public String next;
    public String last;
}
