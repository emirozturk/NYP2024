import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Markalar implements Siralanabilir<String> {
    List<String> liste;
    public Markalar() {
        liste = new ArrayList<>();
        liste.add("Polo");
        liste.add("Samsung");
        liste.add("LCW");
        liste.add("Mavi");
        liste.add("H&M");
        liste.add("Koton");
        liste.add("Altınyıldız");
    }

    @Override
    public void sirala() {
        Collections.sort(liste);
    }

    @Override
    public List<String> listeAl() {
        return liste;
    }
}
