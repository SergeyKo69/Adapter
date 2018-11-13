public class AdapterXMLtoJSON extends ClientJSON {
    private String xmlText;

    public AdapterXMLtoJSON(ClientXml textXml) {
        this.xmlText = textXml.getXmlText();
    }

    @Override
    public String loadJSON() {
        //Conver xml to json
        String jsonText = "{Product {id: 1, name: product name}}";
        return "Conver xml to json: " + jsonText;
    }
}
