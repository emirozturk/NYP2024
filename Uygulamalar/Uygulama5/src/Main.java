import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var liste = new SiraliListe<Integer>();
        Integer[] dizi = new Integer[3];
        dizi[0]=388;
        dizi[1]=3;
        dizi[2]=1000;
        liste.ekle(dizi);
        liste.ekle(533);
        liste.ekle(876);
        liste.ekle(11);
        var siraliListe = liste.siraliAl();
        for(var eleman:siraliListe)
            System.out.println(eleman);
        var ondalikliListe = new SiraliListe<Float>();
        Float[] ondalikliDizi = new Float[3];
        ondalikliDizi[0]=388.1f;
        ondalikliDizi[1]=3.2f;
        ondalikliDizi[2]=1000.3f;
        ondalikliListe.ekle(ondalikliDizi);
        ondalikliListe.ekle(533.0f);
        ondalikliListe.ekle(876.2f);
        ondalikliListe.ekle(11.1f);
        Object x;
        var siraliOndalikliListe = ondalikliListe.siraliAl();
        for(var eleman:siraliOndalikliListe)
            System.out.println(eleman.toString());
        var doubleListe = new SiraliListe<Double>();
        var x = new ArrayList<String>();
        //var y = new SiraliListe<String>();
    }
}