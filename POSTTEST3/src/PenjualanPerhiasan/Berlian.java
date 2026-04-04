package PenjualanPerhiasan;

public class Berlian extends Perhiasan {

    private int karat;

    public Berlian(String id, String nama, double harga, int stok, int karat) {
        super(id, nama, "Berlian", harga, stok);
        this.karat = karat;
    }

    @Override
    public void displayInfo() {
        System.out.println("Berlian: " + nama + " | Karat: " + karat);
    }
}