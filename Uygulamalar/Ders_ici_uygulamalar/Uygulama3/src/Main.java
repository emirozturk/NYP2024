import java.util.ArrayList;

class Kisi{
    private String adSoyad;
    private String nickname;
    private int dogumYili;
    public Kisi(String adSoyad,String nickname,int dogumYili){
        this.adSoyad = adSoyad;
        this.nickname = nickname;
        this.dogumYili = dogumYili;
    }
    public String getAdSoyad(){
        return adSoyad;
    }
    public String getNickname(){
        return nickname;
    }
    public int getDogumYili() {
        return dogumYili;
    }
    private int yasDondur(){
        return 2024-dogumYili;
    }

    public String toString(){
        return "%15s a.k.a. %15s %4d".formatted(adSoyad, nickname, yasDondur());
    }
}

public class Main {
    public static void main(String[] args) {
        var liste = new ArrayList<Kisi>();
        liste.add(new Kisi("Emir Öztürk","emirozturk",1955));
        liste.add(new Kisi("Zehra Yüksel","zera",2002));
        for(var eleman:liste)
            System.out.println(eleman);



        /* -3-
        var liste = new ArrayList<Kisi>();
        var kisi1 = new Kisi("Emir Öztürk","emirozturk",1955);
        var kisi2 = new Kisi("Zehra Yüksel","zera",2002);
        liste.add(kisi1);
        liste.add(kisi2);
        for(var eleman:liste)
            System.out.printf("%20s a.k.a. %15s %4d%n", eleman.getAdSoyad(), eleman.getNickname(), yasDondur(eleman.getDogumYili()));


        /* -2-
        var kisi1 = new Kisi();
        kisi1.adSoyad = "Emir Öztürk";
        kisi1.nickname = "emirozturk";
        kisi1.dogumYili = 1955;
        var kisi2 = new Kisi();
        kisi2.adSoyad = "Zehra Yüksel";
        kisi2.nickname = "zera";
        kisi2.dogumYili = 2002;
        liste.add(kisi1);
        liste.add(kisi2);
        for(var eleman:liste)
            System.out.printf("%20s a.k.a. %15s %4d%n", eleman.adSoyad, eleman.nickname, eleman.dogumYili);

        /* -1-
        var kisi1 = new Kisi();
        kisi1.adSoyad = "Emir Öztürk";
        kisi1.nickname = "emirozturk";
        kisi1.dogumYili = 1955;
        System.out.println(kisi1.adSoyad+" a.k.a. "+kisi1.nickname+" "+ kisi1.dogumYili);
        var kisi2 = new Kisi();
        kisi2.adSoyad = "Zehra Yüksel";
        kisi2.nickname = "zera";
        kisi2.dogumYili = 2002;
        System.out.println(kisi2.adSoyad+ " a.ka. "+ kisi2.nickname+ " "+kisi2.dogumYili);
         */
    }
}