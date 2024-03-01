import java.util.Scanner;
public class BukuMain04 {
   
    public static void main(String[] args) {
        
        Buku04 bk1 = new Buku04();
        bk1.judul = "Tomorrow Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        System.out.println("Harga yang terjual : " + bk1.hitungHargaTotal(5));
        System.out.println("Harga diskon : " + bk1.hitungDiskon(5));
        System.out.println("Harga Bayar :" + bk1.hitungHargaBayar(5));
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println("================================");
        Buku04 bk2 = new Buku04("Self Reward", "Msheera Ayesha", 160, 29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku04 bkAqilla = new Buku04("NOIR","Renita Nozaria", 265, 10, 85000);
        bkAqilla.terjual(6);
        bkAqilla.tampilInformasi();

    }
    
}
