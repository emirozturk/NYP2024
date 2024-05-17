interface Sekil{
    double cevre();
    double alan();
    void ciz();
}
abstract class Dortgen implements Sekil{
    private double a,b;
    public double cevre(){ return a*b;}
    public abstract void ciz();
    public abstract double alan();
}

class Kare extends Dortgen{
    private double a;
    public void setKenar(double a){
        this.a = a;
    }
    public double cevre(){ return 4*a;}
    public void ciz(){
        for(int x=0;x<a;x++) {
            for (int y = 0; y < a; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public double alan(){
        return a*a;
    }

}
public class Main {

    public static void main(String[] args) {

        Kare kare = new Kare();

        kare.setKenar(3.5);
        kare.ciz();

    }
}