package entities;

import java.util.List;

public class Chambre {
    private int id;
    private String telephone;
    private Categorie categorie;

    public Chambre(int id, String telephone, Categorie categorie) {
        this.id = id;
        this.telephone = telephone;
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
