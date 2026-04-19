package PenjualanPerhiasan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Perhiasan> daftarPerhiasan = new ArrayList<>();
    static ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            menu();
            System.out.print("Silahkan Pilih Menu : ");
            pilihan = Integer.parseInt(input.nextLine());

            switch (pilihan) {
                case 1: tambahPerhiasan(); break;
                case 2: tampilPerhiasan(); break;
                case 3: updatePerhiasan(); break;
                case 4: hapusPerhiasan(); break;
                case 5: transaksi(); break;
                case 6: tampilTransaksi(); break;
                case 7: System.out.println("Program selesai..."); break;
                default: System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 7);
    }

    public static void menu() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║      SISTEM PENJUALAN PERHIASAN      ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ 1. Tambah Data Perhiasan             ║");
        System.out.println("║ 2. Lihat Data Perhiasan              ║");
        System.out.println("║ 3. Update Data Perhiasan             ║");
        System.out.println("║ 4. Hapus Data Perhiasan              ║");
        System.out.println("║ 5. Transaksi Penjualan               ║");
        System.out.println("║ 6. Lihat Data Transaksi              ║");
        System.out.println("║ 7. Keluar                            ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

    public static void tambahPerhiasan() {

        System.out.print("ID Perhiasan: ");
        String id = input.nextLine();

        System.out.print("Nama Perhiasan : ");
        String nama = input.nextLine();

        System.out.print("Harga : ");
        double harga = Double.parseDouble(input.nextLine());

        System.out.print("Stok : ");
        int stok = Integer.parseInt(input.nextLine());

        System.out.println("Pilih Jenis:");
        System.out.println("1. Emas");
        System.out.println("2. Perak");
        System.out.println("3. Berlian");
        System.out.print("Pilihan: ");
        int pilih = Integer.parseInt(input.nextLine());

        if (pilih == 1) {
            System.out.print("Kadar: ");
            double kadar = Double.parseDouble(input.nextLine());
            daftarPerhiasan.add(new Emas(id, nama, "Emas", harga, stok, kadar));

        } else if (pilih == 2) {
            System.out.print("Kualitas: ");
            String kualitas = input.nextLine();
            daftarPerhiasan.add(new Perak(id, nama, "Perak", harga, stok, kualitas));

        } else {
            System.out.print("Karat: ");
            int karat = Integer.parseInt(input.nextLine());
            daftarPerhiasan.add(new Berlian(id, nama, "Berlian", harga, stok, karat));
        }

        System.out.println("Data berhasil ditambahkan!");
    }

    public static void tampilPerhiasan() {
        if (daftarPerhiasan.isEmpty()) {
            System.out.println("Data kosong!");
            return;
        }

        for (Perhiasan p : daftarPerhiasan) {
            System.out.println("------------------");
            p.tampilInfo(); // overriding
        }
    }

    public static void updatePerhiasan() { }

    public static void hapusPerhiasan() { }

    public static void transaksi() {

        tampilPerhiasan();

        System.out.print("ID Transaksi : ");
        String idT = input.nextLine();

        System.out.print("Pembeli : ");
        String pembeli = input.nextLine();

        System.out.print("ID Perhiasan : ");
        String id = input.nextLine();

        for (Perhiasan p : daftarPerhiasan) {

            if (p.getId().equals(id)) {

                System.out.print("Jumlah : ");
                int jumlah = Integer.parseInt(input.nextLine());

                Transaksi t = new Transaksi(idT, pembeli, p.getNama(), jumlah, 0);

                double total = t.hitungTotalSetelahDiskon(p.getHarga(), jumlah);

                daftarTransaksi.add(new Transaksi(idT, pembeli, p.getNama(), jumlah, total));

                System.out.println("Transaksi berhasil!");
                return;
            }
        }

        System.out.println("Perhiasan tidak ditemukan!");
    }

    public static void tampilTransaksi() {

        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        for (Transaksi t : daftarTransaksi) {
            System.out.println("------------------");
            System.out.println("ID : " + t.getIdTransaksi());
            System.out.println("Pembeli : " + t.getPembeli());
            System.out.println("Barang : " + t.getNamaPerhiasan());
            System.out.println("Jumlah : " + t.getJumlah());
            System.out.println("Total : " + t.getTotal());
        }
    }
}