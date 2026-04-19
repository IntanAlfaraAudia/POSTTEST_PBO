package PenjualanPerhiasan;

public class Emas extends Perhiasan {

    private double kadar;

    public Emas(String id, String nama, String jenis, double harga, int stok, double kadar) {
        super(id, nama, jenis, harga, stok);
        this.kadar = kadar;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Kadar: " + kadar + "K");
    }
}