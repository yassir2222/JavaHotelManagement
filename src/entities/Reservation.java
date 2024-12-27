package entities;

import java.util.Date;

public class Reservation {
    private Date datedebut;
    private Date datefin;
    private Client client;
    private Chambre chambre;

    public Reservation(Date datedebut, Date datefin, Client client, Chambre chambre) {
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.client = client;
        this.chambre = chambre;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "datedebut=" + datedebut +
                ", datefin=" + datefin +
                ", client=" + client +
                ", chambre=" + chambre +
                '}';
    }
}
