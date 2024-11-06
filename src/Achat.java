import java.util.*;

public class Achat {
    private Date date;
    private int posteUtilise;
    private Carburant carburant;
    private double quantite;
    private double prix;
    private double prixTot;

    public Achat(int posteUtilise, Carburant carburant, double quantite, double prix){
        this.date = new Date(); //date actuelle
        this.posteUtilise = posteUtilise;
        this.carburant = carburant;
        this.quantite = quantite;
        this.prix = prix;
        this.prixTot = quantite * prix;
    }

    @Override
    public String toString() {
        return "Achat : "+date+" Poste : "+posteUtilise+"\n"+" Carburant : "+carburant+"\n"+" Quantité : "+quantite+"\n"+" Prix au litres : "+prix+"\n"+" Prix total : "+prixTot;
    }
    
}
