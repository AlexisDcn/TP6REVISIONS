public class Main {
    public static void main(String[] args) {
        
        PosteAuto auto1 = new PosteAuto(1);
        PosteManuel manu1 = new PosteManuel(2);
        PosteManuel manu2 = new PosteManuel(3);

        // System.out.println(auto1);
        // System.out.println(manu1);
        // System.out.println(manu2);

        Achat achat1 = new Achat(1, Carburant.GAZOLE, 20.0, 2.89);

        // System.out.println(achat1);

        Citerne citerne1 = new Citerne(10000.0);

        System.out.println(citerne1);
    }
}
