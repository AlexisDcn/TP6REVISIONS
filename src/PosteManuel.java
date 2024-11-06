public class PosteManuel extends Poste{
    private boolean ouvert;
    public PosteManuel(int numPoste) {
        super(numPoste);
        this.ouvert = false;
    }

    @Override
    public String toString(){
        return super.toString()+"Manuel : "+ (ouvert ? "Ouvert" : "Fermé");
    }

    
}
