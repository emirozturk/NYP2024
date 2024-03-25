public class Daire extends Sekil{
    private int yariCap;
    public Daire(int yariCap,String renk){
        this.yariCap = yariCap;
        this.renk = renk;
    }
    public double cevreHesapla(){
        return 2*Math.PI*yariCap;
    }
}
