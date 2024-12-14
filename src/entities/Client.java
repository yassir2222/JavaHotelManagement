package entities;

import java.util.List;

public class Client {
    private int id;
    private String nom;
    private  String prenom;
    private  String telephone;
    private  String email;

    public Client( String nom, String prenom, String Telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = Telephone;
        this.email = email;
    }

    public Client( int id,String nome, String prenom, String Telephone, String email) {

        this.nom = nom;
        this.prenom = prenom;
        this.telephone = Telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nom;
    }

    public void setNome(String nome) {
        this.nom = nome;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String Telephone) {
        this.telephone = Telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
