package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8383/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Server started in : "+url);
    }
}
