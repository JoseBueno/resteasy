package org.bueno.jose.resteasy;

import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.impl.auth.NTLMEngineException;

/**
 * Created by josebueno on 8/10/15.
 */
public class JCIFSEngine implements NTLMEngine {
    @Override
    public String generateType1Msg(String s, String s1) throws NTLMEngineException {
        return null;
    }

    @Override
    public String generateType3Msg(String s, String s1, String s2, String s3, String s4) throws NTLMEngineException {
        return null;
    }
}
