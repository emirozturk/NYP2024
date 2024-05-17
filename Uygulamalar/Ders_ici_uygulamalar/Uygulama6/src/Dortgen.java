public class Dortgen extends Sekil{
    protected int birinciKenar;
    protected int ikinciKenar;
    protected int ucuncuKenar;
    protected int dorduncuKenar;
    public Dortgen(int birinciKenar,int ikinciKenar,int ucuncuKenar,int dorduncuKenar,String renk){
        this.birinciKenar = birinciKenar;
        this.ikinciKenar=ikinciKenar;
        this.ucuncuKenar = ucuncuKenar;
        this.dorduncuKenar = dorduncuKenar;
        this.renk = renk;
    }
    public int CevreHesapla(){
        return birinciKenar+ikinciKenar+ucuncuKenar+dorduncuKenar;
    }
    public String bilgiVer(){
        return "Kenar 1:%d Kenar 2:%d Kenar 3:%d Kenar 4:%d".formatted(birinciKenar, ikinciKenar, ucuncuKenar, dorduncuKenar);
    }
}
