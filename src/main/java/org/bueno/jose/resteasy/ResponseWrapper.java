package org.bueno.jose.resteasy;

import java.lang.Exception;

public class ResponseWrapper{

    private int statusCode;
    private String ResponseText;
    private Exception exception;

    public ResponseWrapper(){}

    public ResponseWrapper(int statusCode) {
        this.statusCode = statusCode;
    }

    public ResponseWrapper(int statusCode, String responseText) {
        this.statusCode = statusCode;
        ResponseText = responseText;
    }

    public ResponseWrapper(int statusCode, String responseText, Exception exception) {
        this.statusCode = statusCode;
        ResponseText = responseText;
        this.exception = exception;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResponseText() {
        return ResponseText;
    }

    public void setResponseText(String responseText) {
        ResponseText = responseText;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}