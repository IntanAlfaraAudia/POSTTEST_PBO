package PenjualanPerhiasan;

public class Transaksi {

    // Overloading 1
    public double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    // Overloading 2 (dengan diskon)
    public double hitungTotal(double harga, int jumlah, double diskon) {
        return (harga * jumlah) - diskon;
    }

    // Overloading 3 (bonus poin tambahan)
    public double hitungTotal(double harga, int jumlah, double diskon, double pajak) {
        return (harga * jumlah - diskon) + pajak;
    }
}