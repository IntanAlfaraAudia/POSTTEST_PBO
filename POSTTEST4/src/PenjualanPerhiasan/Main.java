package PenjualanPerhiasan;

public class Main {
    public static void main(String[] args) {

        Perhiasan p1 = new Emas("P001", "Kalung Emas", "Emas", 1500000, 10, 24);
        Perhiasan p2 = new Perak("P002", "Gelang Perak", "Perak", 500000, 5, "Premium");
        Perhiasan p3 = new Berlian("P003", "Cincin Berlian", "Berlian", 3000000, 3, 2);

        System.out.println("=== DATA PERHIASAN ===");
        p1.tampilInfo();
        System.out.println("-------------------");
        p2.tampilInfo();
        System.out.println("-------------------");
        p3.tampilInfo();

        Transaksi t = new Transaksi();

        double total1 = t.hitungTotal(1500000, 2);
        double total2 = t.hitungTotal(1500000, 2, 100000);
        double total3 = t.hitungTotal(1500000, 2, 100000, 50000);

        System.out.println("\n=== TRANSAKSI ===");
        System.out.println("Tanpa diskon : " + total1);
        System.out.println("Dengan diskon: " + total2);
        System.out.println("Diskon + pajak: " + total3);
    }
}