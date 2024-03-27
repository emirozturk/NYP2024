class GiyimUrunu{
    private String marka;

    private String renk;
    private double fiyat;

    public GiyimUrunu(String marka, String renk, double fiyat) {
        this.marka = marka;

        this.renk = renk;
        this.fiyat = fiyat;
    }



    @Override
    public String toString() {
        return "Marka: " + marka + "\n"+"\nRenk: " + renk + "\nFiyat: " + fiyat;
    }

}
class Ayakkabi extends GiyimUrunu{
    private int numara;

    public Ayakkabi(String marka, String renk, double fiyat, int numara) {
        super(marka, renk, fiyat);
        this.numara = numara;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumara: " + numara;
    }
}
class Pantolon extends GiyimUrunu {
    private String kumasTuru;
    private int en;
    private int boy;

    public Pantolon(String marka, String renk, double fiyat, String kumas, int en, int boy) {
        super(marka, renk, fiyat);
        this.kumasTuru = kumas;
        this.en=en;
        this.boy = boy;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKumaş Türü: " + kumasTuru + "\nEn:"+en+"\nBoy: " + boy;
    }
}
public class Main {
    public static void main(String[] args) {
        GiyimUrunu giyimUrunu = new GiyimUrunu("Nike", "Siyah", 200);
        System.out.println(giyimUrunu);
        System.out.println("**********");
        Ayakkabi ayakkabi = new Ayakkabi("Adidas", "Beyaz", 300, 42);
        System.out.println(ayakkabi);
        System.out.println("**********");
        Pantolon pantolon = new Pantolon("LC Waikiki", "Mavi", 150, "Kot", 32, 34);
        System.out.println(pantolon);

    }
}