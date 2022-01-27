package com.in28minutes.rest.webservices.restfulwebservices.exeption;

import java.util.Date;

public class ExeptionResponse {
    //timestamp
    private Date timestamp;
    //message
    private String message;
    //detail
    private String details;

    public ExeptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
