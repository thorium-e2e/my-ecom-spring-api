package com.apothuaud.myecom.models;

public class Response {

    public Response(Boolean success, ResponsePayload payload, ResponseError error) {
        this.success = success;
        this.payload = payload;
        this.error = error;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public ResponsePayload getPayload() {
        return payload;
    }

    public void setPayload(ResponsePayload payload) {
        this.payload = payload;
    }

    public ResponseError getError() {
        return error;
    }

    public void setError(ResponseError error) {
        this.error = error;
    }

    public Boolean success;
    public ResponsePayload payload;
    public ResponseError error;
}
