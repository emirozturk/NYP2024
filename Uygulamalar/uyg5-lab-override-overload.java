class Hesaplama{
    private double toplam;

    public int topla(int a,int b){
        this.toplam=(double)a+b;
        return a+b;
    }
    public double topla(double a, double b){
        this.toplam=(double)a+b;
        return a+b;
    }
    public double topla(double[] a){
        double toplam=0.0;
        for(double s:a){
            toplam+=s;
        }
        return toplam;
    }
    public int topla(int[] a){
        int toplam=0;
        for(int s:a){
            toplam+=s;
        }
        this.toplam=(double)toplam;
        return toplam;
    }
    public void toplamiYaz(){
        System.out.println(this.toplam);
    }

}

class KarmasikSayi{

    public double gercek;
    public double sanal;
    public KarmasikSayi(){
        this.gercek=0.0;
        this.sanal=0.0;
    }
    public KarmasikSayi(double gercek,double sanal){
        this.gercek=gercek;
        this.sanal=sanal;
    }
}

class KarmasikHesaplama extends Hesaplama {
    KarmasikSayi toplam;
    public KarmasikSayi topla(KarmasikSayi a, KarmasikSayi b) {
        KarmasikSayi k = new KarmasikSayi();
        k.gercek = a.gercek + b.gercek;
        k.sanal = a.sanal + b.sanal;
        this.toplam=k;
        return k;
    }
    @Override
    public void toplamiYaz(){
        StringBuilder sb=new StringBuilder();
        sb.append(this.toplam.gercek).append("+");
        sb.append(this.toplam.sanal).append("i");
        System.out.println(sb.toString());
    }
}


public class Main {
    public static void main(String[] args) {
        Hesaplama h=new Hesaplama();
        int a[]={1,2,3,4};
        h.topla(a);
        h.toplamiYaz();
        KarmasikSayi k1=new KarmasikSayi(2.0,3.0);
        KarmasikSayi k2=new KarmasikSayi(2.0,3.0);
        KarmasikHesaplama ks=new KarmasikHesaplama();
        ks.topla(k1,k2);
        ks.toplamiYaz();
    }
}