import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Notlar implements Aranabilir<Integer>,Siralanabilir<Integer>{
    List<Integer> liste;
    public Notlar(){
        liste = new ArrayList<>();
        liste.add(1);
        liste.add(10);
        liste.add(100);
        liste.add(20);
        liste.add(32);
        liste.add(22);
        liste.add(12);
        liste.add(15);
        liste.add(23);
    }
    @Override
    public Integer ara(Integer deger) {
        for (Integer integer : liste)
            if (Objects.equals(integer, deger))
                return integer;
        return -1;
    }

    @Override
    public void sirala() {
        for (int i = 0; i < liste.size(); i++) {
            for (int j = i + 1; j < liste.size(); j++) {
                if (liste.get(i)<liste.get(j)){
                    int temp = liste.get(i);
                    liste.set(i, liste.get(j));
                    liste.set(j, temp);
                }
            }
        }
    }

    @Override
    public List<Integer> listeAl() {
        return liste;
    }
}
