public class Citerne {
    private double niveauCourant;
    private double niveauAlerte;
    private double niveauMin;
    private Carburant carburant;

    public Citerne(double niveauCourant) {
        this.niveauCourant = niveauCourant;
        this.niveauAlerte = 1000;
        this.niveauMin = 500;
    }

    public Citerne(Carburant carburant, double niveauCourant) {
        this.carburant = carburant;
        this.niveauCourant = niveauCourant;
        this.niveauAlerte = 1000;
        this.niveauMin = 500;
    }



    @Override
    public String toString() {
        return "Citerne : "+niveauCourant+"L"+ " Niveau d'alerte : "+niveauAlerte+"L"+ " Niveau minimal : "+niveauMin+"L";
    }

}
