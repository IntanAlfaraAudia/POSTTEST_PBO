package PenjualanPerhiasan;

public class Transaksi {

    public String idTransaksi;
    public String pembeli;
    public String namaPerhiasan;
    public int jumlah;
    public double total;

    public Transaksi(String idTransaksi, String pembeli, String namaPerhiasan, int jumlah, double total) {
        this.idTransaksi = idTransaksi;
        this.pembeli = pembeli;
        this.namaPerhiasan = namaPerhiasan;
        this.jumlah = jumlah;
        this.total = total;
    }
}