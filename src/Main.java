
public class Main {
    public static void main(String[] args) {
        ClientJSON clientJSON = new ClientJSON("{Product {id:2 , name: name product 2}}");
        ClientXml clientXml = new ClientXml("<Product><id>1</id><name>name product</name></Product>");
        AdapterXMLtoJSON adapterXMLtoJSON = new AdapterXMLtoJSON(clientXml);

        Server server = new Server();
        server.load(clientJSON);
        server.load(adapterXMLtoJSON);
    }
}
