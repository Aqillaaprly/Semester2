import java.util.Scanner;

 //inisialisasi class kendaraan
public class Kendaraan {
    String nomorTNKB;
    String namaPemilik;
    String jenis;
    int ccKendaraan;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String nomorTNKB, String namaPemilik, String jenis, int ccKendaraan, int tahun, int bulanHarusBayar) {
        this.nomorTNKB = nomorTNKB;
        this.namaPemilik = namaPemilik;
        this.jenis = jenis;
        this.ccKendaraan = ccKendaraan;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public String toString() {
        return String.format("| %-10s | %-10s | %-5s | %-10d | %-4d | %-17d |",
                nomorTNKB, namaPemilik, jenis, ccKendaraan, tahun, bulanHarusBayar);
    }

    public void printTransaksi() {
        throw new UnsupportedOperationException("Unimplemented method 'printTransaksi'");
    }
}

//insialisasi class Transaksi 
class Transaksi {
    int kode;
    String nomorTNKB;
    String namaPemilik;
    int nominal;
    int denda;

    public Transaksi(int kode, String nomorTNKB, String namaPemilik, int nominal, int denda) {
        this.kode = kode;
        this.nomorTNKB = nomorTNKB;
        this.namaPemilik = namaPemilik;
        this.nominal = nominal;
        this.denda = denda;
    }

    public String toString() {
        return String.format("| %-4d | %-10s | %-10s | %-7d | %-6d |",
                kode, nomorTNKB, namaPemilik, nominal, denda);
    }
}