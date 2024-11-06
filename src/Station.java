import java.util.ArrayList;
import java.util.EnumMap;

public class Station {
    private boolean ouvert;
    private ArrayList<Poste> postes;

    private ArrayList<Achat> achats;

    private EnumMap<Carburant, Citerne> citernes;

    private EnumMap<Carburant, Double> prix;

    public Station() {
      // créer les 3 citernes vides
      citernes= new EnumMap<Carburant,Citerne>(Carburant.class);
      citernes.put(Carburant.SP95, new Citerne(Carburant.SP95, 0));
      citernes.put(Carburant.SP98, new Citerne(Carburant.SP98, 0));
      citernes.put(Carburant.GAZOLE, new Citerne(Carburant.GAZOLE,0 ));
      // et idem pour les postes, les achats et les prix
      postes=new ArrayList<Poste>();
      achats=new ArrayList<Achat>();
      prix=new EnumMap<Carburant, Double>(Carburant.class);
    }

    
}
