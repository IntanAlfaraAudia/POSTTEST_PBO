package PenjualanPerhiasan;

public class Transaksi {

    private String idTransaksi;
    private String pembeli;
    private String namaPerhiasan;
    private int jumlah;
    private double total;

    public Transaksi(String idTransaksi, String pembeli, String namaPerhiasan, int jumlah, double total) {
        this.idTransaksi = idTransaksi;
        this.pembeli = pembeli;
        this.namaPerhiasan = namaPerhiasan;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getPembeli() {
        return pembeli;
    }

    public String getNamaPerhiasan() {
        return namaPerhiasan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotal() {
        return total;
    }
}