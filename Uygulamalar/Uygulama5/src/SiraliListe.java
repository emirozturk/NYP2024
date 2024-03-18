import java.util.ArrayList;
import java.util.List;

public class SiraliListe<E extends Number>{
    List<E> liste = new ArrayList<>();
    void ekle(E deger){
        liste.add(deger);
    }
    void ekle(E[] dizi){
        for(var eleman:dizi)
            liste.add(eleman);
    }
    List<E> siraliAl(){
        var yeniListe = new ArrayList<>(liste);
        for(int i=0;i<yeniListe.size();i++){
            for(int j=i;j<yeniListe.size();j++){
                if(yeniListe.get(i).intValue()>yeniListe.get(j).intValue()){
                    E temp = yeniListe.get(i);
                    yeniListe.set(i, yeniListe.get(j));
                    yeniListe.set(j,temp);
                }
            }
        }
        return yeniListe;
    }
}
