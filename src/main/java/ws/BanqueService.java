package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")

public class BanqueService {
    @WebMethod
    public double conversionEuroToMAD(@WebParam(name = "montant") double amount) {
        return amount * 11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, 1000+Math.random()*9000, new Date());
    }
    @WebMethod
    public List<Compte> getComptes() {
        return List.of(
                new Compte(1, 1000+Math.random()*9000, new Date()),
                new Compte(2, 1000+Math.random()*9000, new Date()),
                new Compte(3, 1000+Math.random()*9000, new Date())
        );
    }
}
