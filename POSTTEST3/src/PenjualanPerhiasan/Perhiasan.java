package PenjualanPerhiasan;

public class Perhiasan {

    protected String id;
    protected String nama;
    protected String jenis;
    protected double harga;
    protected int stok;

    public Perhiasan(String id, String nama, String jenis, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
    }

    // METHOD TAMBAHAN (untuk inheritance)
    public void displayInfo() {
        System.out.println("Perhiasan: " + nama + " | Jenis: " + jenis);
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}