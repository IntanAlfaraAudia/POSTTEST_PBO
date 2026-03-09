package PenjualanPerhiasan;

public class Perhiasan {

    public String id;
    public String nama;
    public String jenis;
    public double harga;
    public int stok;

    public Perhiasan(String id, String nama, String jenis, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
    }
}