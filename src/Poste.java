public abstract class Poste {
    private int numPoste;
    private Carburant carburant;
    private double quantiteCarburant;
    private double prixCarburant;
    private double prixTot;

    public Poste(int numPoste) {
        this.numPoste = numPoste;
        this.quantiteCarburant = 0;
        this.prixCarburant = 0;
        this.prixTot = quantiteCarburant * prixCarburant;
    }

    public void setCompteurs(double quantiteCarburant, double prixCarburant) {
        this.quantiteCarburant = quantiteCarburant;
        this.prixCarburant = prixCarburant;
        this.prixTot = quantiteCarburant * prixCarburant;
    }

    

    @Override
    public String toString() {
        return "Poste n°"+numPoste+" : ";
    }
}
