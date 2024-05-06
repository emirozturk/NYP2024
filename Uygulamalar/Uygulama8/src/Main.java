import java.util.ArrayList;

public class Main {
    public static void sirala(Siralanabilir arayuz){
        arayuz.sirala();
        var liste = arayuz.listeAl();
        for(var eleman:liste){
            System.out.println(eleman);
        }
    }
    public static int ara(Aranabilir<Integer> arayuz,int n){
        return arayuz.ara(n);
    }

    public static void main(String[] args) {
        Notlar notlar = new Notlar();
        Markalar markalar = new Markalar();
        System.out.println(ara(notlar,100));
        sirala(notlar);
        sirala(markalar);
    }
}