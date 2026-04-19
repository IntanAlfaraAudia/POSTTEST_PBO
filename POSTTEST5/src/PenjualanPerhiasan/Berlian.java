package PenjualanPerhiasan;

public class Berlian extends Perhiasan {

    private int karat;

    public Berlian(String id, String nama, String jenis, double harga, int stok, int karat) {
        super(id, nama, jenis, harga, stok);
        this.karat = karat;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Karat: " + karat);
    }
}