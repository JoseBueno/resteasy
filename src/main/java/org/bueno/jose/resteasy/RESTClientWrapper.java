package org.bueno.jose.resteasy;

import org.bueno.jose.resteasy.RESTActionGET;
import org.bueno.jose.resteasy.ResponseWrapper;

import java.lang.Exception;

public interface RESTClientWrapper {
    ResponseWrapper get(RESTActionGET action) throws Exception;
}