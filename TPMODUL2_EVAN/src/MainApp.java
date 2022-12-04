public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("WD Green", 32, 3.2F);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("V-Gen", 16, 2.7F, false);
        laptop.informasi();
        laptop.bukaGame("Genshin Impact");
        laptop.kirimEmail("evandanirafif@gmail.com");
        laptop.kirimEmail("copykanan@gmail.com", "copykiri@gmail.com");
        System.out.println();

        Handphone handphone = new Handphone("Samsung", 8, 2.55F, true);
        handphone.informasi();
        handphone.telfon(62913123);
        handphone.kirimSMS(62133133);
        handphone.kirimSMS(6231313, 62991313);
    }
}