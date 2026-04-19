package PenjualanPerhiasan;

public class Transaksi implements Diskon {

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

    @Override
    public double hitungDiskon(double harga, int jumlah) {
        if (jumlah >= 3) {
            return harga * jumlah * 0.1;
        }
        return 0;
    }

    @Override
    public double hitungTotalSetelahDiskon(double harga, int jumlah) {
        double totalAwal = harga * jumlah;
        return totalAwal - hitungDiskon(harga, jumlah);
    }

    public double hitungTotal(double harga, int jumlah) {
        return harga * jumlah;
    }

    public double hitungTotal(double harga, int jumlah, double diskon) {
        return (harga * jumlah) - diskon;
    }

    public String getIdTransaksi() { return idTransaksi; }
    public String getPembeli() { return pembeli; }
    public String getNamaPerhiasan() { return namaPerhiasan; }
    public int getJumlah() { return jumlah; }
    public double getTotal() { return total; }
}