public class Main {
    public static void main(String[] args) {
        var kuyruk = new Kuyruk();
        kuyruk.ekle(3);
        System.out.println(kuyruk);
        kuyruk.ekle(5);
        System.out.println(kuyruk);
        kuyruk.ekle(7);
        System.out.println(kuyruk);
        kuyruk.cikar();
        System.out.println(kuyruk);
        kuyruk.cikar();
        System.out.println(kuyruk);
    }
}