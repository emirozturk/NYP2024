public class Response {
    boolean basariliMi;
    String mesaj;
    int deger;
    private Response(boolean basariliMi,
                    String mesaj,
                    int deger){
        this.basariliMi = basariliMi;
        this.mesaj = mesaj;
        this.deger = deger;
    }
    public static Response Basarili(int deger){
        return new Response(true,"",deger);
    }
    public static Response Basarisiz(String mesaj){
        return new Response(false,mesaj,0);
    }
}
