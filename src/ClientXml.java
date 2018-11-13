public class ClientXml {
    private String xmlText;

    public ClientXml() {
    }

    public ClientXml(String xmlText) {
        this.xmlText = xmlText;
    }

    public String getXmlText() {
        return xmlText;
    }

    public String loadXml(){
        return "load xml: " + xmlText;
    }
}
