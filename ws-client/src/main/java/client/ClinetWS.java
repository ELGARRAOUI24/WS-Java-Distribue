package client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClinetWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToMAD(100));
        Compte cp = proxy.getCompte(4);
        System.out.println("---------- getCompte -----------");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        List<Compte> cps = proxy.getComptes();
        cps.forEach(c-> {
            System.out.println("----------------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
        });
    }
}
