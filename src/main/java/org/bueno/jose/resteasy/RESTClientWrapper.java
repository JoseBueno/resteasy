import java.lang.Exception;

public interface RESTClientWrapper {
    ResponseWrapper get(RESTActionGET action) throws Exception;
}