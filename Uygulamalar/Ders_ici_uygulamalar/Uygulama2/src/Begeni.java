import java.time.LocalDateTime;

public class Begeni {
    private String adSoyad;
    private String parca;
    private int puan;
    public Begeni(String AdSoyad,String Parca,int Puan){
        adSoyad = AdSoyad;
        parca = Parca;
        puan = Puan;
    }
    public String ekranaYaz(int indis){
        return "%2d%10s%20s%d".formatted(indis,adSoyad, parca, puan);
    }
}
