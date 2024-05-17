public class Dikdortgen extends Dortgen{
    public Dikdortgen(int kisaKenar,int uzunKenar,String renk){
        super(kisaKenar,kisaKenar,uzunKenar,uzunKenar,renk);
        birinciKenar = kisaKenar;
        ikinciKenar = kisaKenar;
        ucuncuKenar = uzunKenar;
        dorduncuKenar = uzunKenar;
        this.renk = renk;
    }
    @Override
    public String bilgiVer(){
        return "Kısa Kenar: %d Uzun Kenar: %d".formatted(birinciKenar, ucuncuKenar);
    }
}
