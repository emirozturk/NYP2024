import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var liste = new ArrayList<Begeni>();
        System.out.println("Beğeni uygulaması😗");
        for(int i=0;i<3;i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("İsim giriniz");
            var isim = scanner.nextLine();
            System.out.println("Parça giriniz");
            var parca = scanner.nextLine();
            System.out.println("Puan giriniz");
            var puan = scanner.nextInt();
            var yeniBegeni = new Begeni(isim,parca,puan);
            liste.add(yeniBegeni);
        }
        int sayac = 1;
        for(var eleman : liste)
            System.out.println(eleman.ekranaYaz(sayac++));
        /*
        for(int i=0;i<liste.size();i++)
            liste.get(i).ekranaYaz(i+1);
         */
    }
}