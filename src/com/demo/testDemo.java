package com.demo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.util.Assert;

/**
 * Created by mave0216 on 9/23/2016.
 */
public class testDemo {

private String message;

    @Required
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "testDemo{" +
                "message='" + message + '\'' +
                '}';
    }
}
