package PenjualanPerhiasan;

public interface Diskon {

    double hitungDiskon(double harga, int jumlah);

    double hitungTotalSetelahDiskon(double harga, int jumlah);
}