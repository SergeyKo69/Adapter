public class ClientJSON {
    private String jsonText;

    public ClientJSON() {
    }

    public ClientJSON(String jsonText) {
        this.jsonText = jsonText;
    }

    public String getJsonText() {
        return jsonText;
    }

    public String loadJSON(){
        return "load json: " + jsonText;
    }
}
