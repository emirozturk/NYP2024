public class Kare extends Dikdortgen{
    public Kare(int kenar,String renk) {
        super(kenar,kenar,renk);
        birinciKenar = kenar;
        ikinciKenar = kenar;
        ucuncuKenar = kenar;
        dorduncuKenar = kenar;
        this.renk = renk;
    }
    public String bilgiVer(){
        return "Kenar: %d".formatted(birinciKenar);
    }
}
