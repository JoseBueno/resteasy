package org.bueno.jose.resteasy;

import org.bueno.jose.resteasy.RESTAction;

import java.lang.String;

public class RESTActionGET extends RESTAction {

    public RESTActionGET(String endPoint) {
        this(endPoint, new String[]{});
    }

    public RESTActionGET(String endPoint, String[] queryString) {
        this.endpoint = endPoint;
        this.queryString = queryString;
    }

}