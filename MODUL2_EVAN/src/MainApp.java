public class MainApp {
    public static void main(String[] args) {
    TransportasiAir transportasiAir = new TransportasiAir(10, 90000);
    transportasiAir.informasi();
    transportasiAir.berlayar();
    transportasiAir.berlabuh();
    System.out.println();

    Sampan sampan = new Sampan(5, 40000, 4);
    sampan.informasi();
    sampan.berlayar();
    sampan.berlabuh();
    sampan.berlabuh(1);
    System.out.println();

    Kapal kapal = new Kapal(20,100000, "Diesel");
    kapal.informasi();
    kapal.berlayar();
    kapal.berlayar(40);
    kapal.berlabuh();
    }
}
