import java.util.ArrayList;

public class Kuyruk{
    ArrayList<Integer> liste = new ArrayList<>();
    public int ekle(int eklenecek){
        liste.add(eklenecek);
        return eklenecek;
    }
    public int cikar(){
        var cikarilacak = liste.get(0);
        liste.remove(0);
        return cikarilacak;
    }
    @Override
    public String toString(){
        var cikti = new StringBuilder();
        for(int i=0;i<liste.size();i++)
            cikti.append(liste.get(i)+"-");
        return cikti.toString();
    }
    /*
    private int[] dizi = new int[10];
    private int index;
    public int ekle(int eklenecek){
        if(index>8)
            return -1;
        dizi[index]=eklenecek;
        index++;
        return eklenecek;
    }
    public int cikar(){
        if(index<=0)
            return -1;
        var siradaki = dizi[0];
        for(int i=0;i<index;i++)
            dizi[i]=dizi[i+1];
        index--;
        return siradaki;
    }
    @Override
    public String toString(){
        var cikti = new StringBuilder();
        for(int i=0;i<index;i++)
            cikti.append(dizi[i]+"-");
        return cikti.toString();
    }
    */
}
