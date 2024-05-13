import java.lang.invoke.SerializedLambda;
import java.util.ArrayList;
import java.util.List;

//Liste içerisindeki 50den büyük sayıların
// 5. elemandan 10. elemana kadar olanlarını alan ve
// bu sayıların karelerini küçükten büyüğe sıralayıp
// bir liste olarak döndüren metot
public class Main {
    public static ArrayList<Integer> fonksiyon(ArrayList<Integer> liste){
        var ellidenBuyukler = new ArrayList<Integer>();
        for(int i=0;i<liste.size();i++)
            if(liste.get(i)>50)
                ellidenBuyukler.add(liste.get(i));
        var aradakiler = new ArrayList<Integer>();
        for(int i=5;i<10;i++)
            aradakiler.add(ellidenBuyukler.get(i));
        var kareler = new ArrayList<Integer>();
        for(int i=0;i<aradakiler.size();i++)
            kareler.add(aradakiler.get(i)*aradakiler.get(i));
        for(int i=0;i<kareler.size();i++)
            for (int j=0;j<kareler.size();j++)
                if(kareler.get(i)<kareler.get(j)){
                    int temp = kareler.get(i);
                    kareler.set(i, kareler.get(j));
                    kareler.set(j, temp);
                }
        return kareler;
    }
    public static List<Integer> streamApi(ArrayList<Integer> liste){

        return liste.stream()
                .filter(eleman->eleman>50)
                .skip(5)
                .limit(5)
                .map(eleman->eleman*eleman)
                .sorted()
                .toList();
    }
    public static void main(String[] args) {
        var liste = new ArrayList<Integer>();
        liste.add(1);
        liste.add(24);
        liste.add(567);
        liste.add(2587);
        liste.add(350);
        liste.add(497);
        liste.add(1807);
        liste.add(494);
        liste.add(578);
        liste.add(113);
        liste.add(24905);
        liste.add(976);
        liste.add(11);
        liste.add(1305);
        var sonuc = fonksiyon(liste);
        var sonuc2 = streamApi(liste);
        for(var eleman:sonuc) System.out.print(eleman+" ");
        System.out.println("\n----------");
        for(var eleman:sonuc2) System.out.print(eleman+" ");
    }
}