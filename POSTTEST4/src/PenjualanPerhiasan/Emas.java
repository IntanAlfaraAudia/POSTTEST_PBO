package PenjualanPerhiasan;

public class Emas extends Perhiasan {

    private double kadar;

    public Emas(String id, String nama, String jenis, double harga, int stok, double kadar) {
        super(id, nama, jenis, harga, stok);
        this.kadar = kadar;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kadar   : " + kadar + "K");
    }
}