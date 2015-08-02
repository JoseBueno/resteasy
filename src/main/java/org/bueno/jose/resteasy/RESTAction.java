public abstract class RESTAction{

    String[] queryString;
    String endpoint;

    public String[] getQueryString() {
        return queryString;
    }

    public void setQueryString(String[] queryString) {
        this.queryString = queryString;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

}