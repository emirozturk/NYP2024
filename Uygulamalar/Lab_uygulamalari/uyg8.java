// Arac arabirimi
interface Arac {
    void setMaksHiz(int maksHiz);
    void setFrenKapasitesi(int frenKapasitesi);
    void setHizlanmaKapasitesi(int hizlanmaKapasitesi);
    void calistir();
    void hizlandir();
    void fren();
    void dur();
    int mevcutHiz();
}

// Bisiklet sınıfı
class Bisiklet implements Arac {
    private int mevcutHiz;
    private int maksHiz;
    private int frenKapasitesi;
    private int hizlanmaKapasitesi;

    public void setMaksHiz(int maksHiz) {
        this.maksHiz = maksHiz;
    }

    public void setFrenKapasitesi(int frenKapasitesi) {
        this.frenKapasitesi = frenKapasitesi;
    }

    public void setHizlanmaKapasitesi(int hizlanmaKapasitesi) {
        this.hizlanmaKapasitesi = hizlanmaKapasitesi;
    }

    public void calistir() {
        System.out.println("Bisiklet çalıştırıldı.");
    }

    public void hizlandir() {
        if (mevcutHiz + hizlanmaKapasitesi <= maksHiz) {
            mevcutHiz += hizlanmaKapasitesi;
            System.out.println("Hızlandırıldı. Mevcut hız: " + mevcutHiz);
        } else {
            System.out.println("Maksimum hıza ulaşıldı.");
            mevcutHiz = maksHiz;
        }
    }

    public void fren() {
        if (mevcutHiz - frenKapasitesi >= 0) {
            mevcutHiz -= frenKapasitesi;
            System.out.println("Fren yapıldı. Mevcut hız: " + mevcutHiz);
        } else {
            System.out.println("Bisiklet durdu.");
            mevcutHiz = 0;
        }
    }

    public void dur() {
        System.out.println("Bisiklet durdu.");
        mevcutHiz = 0;
    }

    public int mevcutHiz() {
        return mevcutHiz;
    }
}




public class Main {
    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.setMaksHiz(30);
        bisiklet.setFrenKapasitesi(5);
        bisiklet.setHizlanmaKapasitesi(10);

        bisiklet.calistir();
        bisiklet.hizlandir();
        bisiklet.fren();
        bisiklet.hizlandir();
        bisiklet.dur();

        System.out.println("Mevcut hız: " + bisiklet.mevcutHiz());
    }
}


