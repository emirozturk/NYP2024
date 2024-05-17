public class Main {
    public static void main(String[] args) {
        var dortgen = new Dortgen(3,5,7,9,"Kırmızı");
        System.out.println(dortgen.bilgiVer());
        System.out.println(dortgen.CevreHesapla());
        var dikdortgen = new Dikdortgen(20,30,"Yeşil");
        System.out.println(dikdortgen.bilgiVer());
        System.out.println(dikdortgen.CevreHesapla());
        var kare = new Kare(33,"Mavi");
        System.out.println(kare.bilgiVer());
        System.out.println(kare.CevreHesapla());
        var daire = new Daire(5,"Mor");
        System.out.println(daire.cevreHesapla());
    }
}