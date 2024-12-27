package presentation;

import entities.Categorie;
import entities.Client;
import service.CategorieService;
import service.ClientService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Client C = new Client("nom","prenom","06000000","gemail");
//        ClientService sc = new ClientService();
//        sc.create(C);
//        Client a=sc.findByID(2);
        CategorieService cs = new CategorieService();
//        Categorie G1 = new Categorie("STD","Chambre Standard");
//        Categorie G2 = new Categorie("DLX","Chambre Deluxe");
//
//        cs.create(G1);
//        cs.create(G2);
        List<Categorie> categorieList = cs.findByAll();
        System.out.println(categorieList);

    }
}