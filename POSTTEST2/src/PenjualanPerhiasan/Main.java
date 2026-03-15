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

                case 1:
                    tambahPerhiasan();
                    break;

                case 2:
                    tampilPerhiasan();
                    break;

                case 3:
                    updatePerhiasan();
                    break;

                case 4:
                    hapusPerhiasan();
                    break;

                case 5:
                    transaksi();
                    break;

                case 6:
                    tampilTransaksi();
                    break;

                case 7:
                    System.out.println("Program selesai...");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 7);
    }

    public static void menu() {

        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
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

        System.out.println("\n===== TAMBAH DATA PERHIASAN =====");

        System.out.print("ID Perhiasan : ");
        String id = input.nextLine();

        System.out.print("Nama Perhiasan : ");
        String nama = input.nextLine();

        System.out.print("Jenis Perhiasan : ");
        String jenis = input.nextLine();

        System.out.print("Harga : ");
        double harga = Double.parseDouble(input.nextLine());

        System.out.print("Stok : ");
        int stok = Integer.parseInt(input.nextLine());

        daftarPerhiasan.add(new Perhiasan(id, nama, jenis, harga, stok));

        System.out.println("Yes, Data berhasil ditambahkan!");
    }

    public static void tampilPerhiasan() {

        System.out.println("\n════════════ DATA PERHIASAN ════════════");

        if (daftarPerhiasan.isEmpty()) {
            System.out.println("Duh, Data kosong!");
            return;
        }

        System.out.printf("| %-5s | %-15s | %-10s | %-10s | %-5s |\n",
                "ID", "Nama", "Jenis", "Harga", "Stok");

        System.out.println("-----------------------------------------------------------");

        for (Perhiasan p : daftarPerhiasan) {

            System.out.printf("| %-5s | %-15s | %-10s | %-10.0f | %-5d |\n",
                    p.getId(), p.getNama(), p.getJenis(), p.getHarga(), p.getStok());
        }
    }

    public static void updatePerhiasan() {

        tampilPerhiasan();

        System.out.print("\nMasukkan ID yang ingin diupdate : ");
        String id = input.nextLine();

        for (Perhiasan p : daftarPerhiasan) {

            if (p.getId().equals(id)) {

                System.out.print("Nama baru : ");
                p.setNama(input.nextLine());

                System.out.print("Jenis baru : ");
                p.setJenis(input.nextLine());

                System.out.print("Harga baru : ");
                p.setHarga(Double.parseDouble(input.nextLine()));

                System.out.print("Stok baru : ");
                p.setStok(Integer.parseInt(input.nextLine()));

                System.out.println("Sip, Data berhasil diupdate!");
                return;
            }
        }

        System.out.println("Duh, Data tidak ditemukan!");
    }

    public static void hapusPerhiasan() {

        tampilPerhiasan();

        System.out.print("\nMasukkan ID yang ingin dihapus : ");
        String id = input.nextLine();

        for (Perhiasan p : daftarPerhiasan) {

            if (p.getId().equals(id)) {

                daftarPerhiasan.remove(p);
                System.out.println("hore, Data berhasil dihapus!");
                return;
            }
        }

        System.out.println("Duh, Data tidak ditemukan!");
    }

    public static void transaksi() {

        tampilPerhiasan();

        System.out.println("\n===== TRANSAKSI PENJUALAN =====");

        System.out.print("ID Transaksi : ");
        String idT = input.nextLine();

        System.out.print("Nama Pembeli : ");
        String pembeli = input.nextLine();

        System.out.print("ID Perhiasan : ");
        String id = input.nextLine();

        for (Perhiasan p : daftarPerhiasan) {

            if (p.getId().equals(id)) {

                System.out.print("Jumlah beli : ");
                int jumlah = Integer.parseInt(input.nextLine());

                double total = jumlah * p.getHarga();

                daftarTransaksi.add(new Transaksi(idT, pembeli, p.getNama(), jumlah, total));

                p.setStok(p.getStok() - jumlah);

                System.out.println("Yes, Transaksi berhasil!");
                return;
            }
        }

        System.out.println("Duh, Perhiasan tidak ditemukan!");
    }

    public static void tampilTransaksi() {

        System.out.println("\n════════════ DATA TRANSAKSI ════════════");

        if (daftarTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }

        System.out.printf("| %-10s | %-15s | %-15s | %-5s | %-10s |\n",
                "ID", "Pembeli", "Perhiasan", "Qty", "Total");

        System.out.println("----------------------------------------------------------------");

        for (Transaksi t : daftarTransaksi) {

            System.out.printf("| %-10s | %-15s | %-15s | %-5d | %-10.0f |\n",
                    t.getIdTransaksi(), t.getPembeli(), t.getNamaPerhiasan(), t.getJumlah(), t.getTotal());
        }
    }
}