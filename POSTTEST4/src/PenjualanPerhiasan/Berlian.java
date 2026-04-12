package PenjualanPerhiasan;

public class Berlian extends Perhiasan {

    private int karat;

    public Berlian(String id, String nama, String jenis, double harga, int stok, int karat) {
        super(id, nama, jenis, harga, stok);
        this.karat = karat;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Karat   : " + karat);
    }
}