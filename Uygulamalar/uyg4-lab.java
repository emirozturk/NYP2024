import java.util.ArrayList;
class Hesap{
    private String parabirimi;
    private double bakiye;

    Hesap(String parabirimi){
        this.parabirimi=parabirimi;
        this.bakiye=0.0;
    }
    Hesap(String parabirimi,double bakiye){
        this.parabirimi=parabirimi;
        this.bakiye=bakiye;
    }
    public void paraYatir(double miktar){
        this.bakiye+=miktar;
    }
    public void paraCek(double miktar){
        this.bakiye-=miktar;
    }
    public double bakiyeDondur(){
        return this.bakiye;
    }
    public String paraBirimiDondur(){
        return this.parabirimi;
    }
}
class Musteri{
    private String ad;
    private String soyad;
    private int kimlikNo;
    private ArrayList<Hesap> hesaplar;

    Musteri(String ad, String soyad, int kimlikNo){
        this.ad=ad;
        this.soyad=soyad;
        this.kimlikNo=kimlikNo;
        this.hesaplar=new ArrayList<Hesap>();
    }
    public Hesap hesapBulEkle(String parabirimi){
        for (Hesap hesap : hesaplar) {
            if (hesap.paraBirimiDondur().equals(parabirimi)) {
                return hesap;
            }
        }
            Hesap h = new Hesap(parabirimi);
            this.hesaplar.add(h);
            return h;
    }
    @Override
    public String toString(){
        StringBuilder s=new StringBuilder();
        s.append(this.kimlikNo).append(" ");
        s.append(this.ad).append(" ");
        s.append(this.soyad).append("\n");
        for(Hesap hesap:hesaplar) {
            s.append(hesap.paraBirimiDondur()).append(" - ").append(hesap.bakiyeDondur());
            s.append("\n");
        }
        return s.toString();
    }


}

public class Main {
    public static void main(String[] args) {
    Musteri m1= new Musteri("Oguz","Kirat",1);
    Hesap m1h1=m1.hesapBulEkle("TRY");
    m1h1.paraYatir(100);
    Musteri m2= new Musteri("Emir","Ozturk",2);
    Hesap m2h1=m2.hesapBulEkle("TRY");
    m1h1.paraYatir(100);
    Hesap m2h2=m2.hesapBulEkle("USD");
    m2h2.paraYatir(500);
    m2h2.paraCek(200);
    System.out.println(m1);


    }
}