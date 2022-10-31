import java.util.Scanner;


public class Server {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Regiter Terlebih Dahulu");
        System.out.println("===================================");

        // print success
        System.out.println("Name : "+ (User.nameUser));
        System.out.println("No. Handphone: " + (User.numberPhone));
        System.out.println("===================================");
        System.out.println("1. Menu\n2. Pilih Menu\n3. Keluar");
        System.out.println("===================================");
        System.out.println("Masukkan Pilihan : ");
        int pilihan = scanner.nextInt();
        if (pilihan == 1){
            System.out.println("Menu");
            System.out.println("===================================");
        } else if (pilihan == 2) {
            System.out.println();
        }
    }
}