package PenjualanPerhiasan;

public class Emas extends Perhiasan {

    private double kadar;

    public Emas(String id, String nama, double harga, int stok, double kadar) {
        super(id, nama, "Emas", harga, stok);
        this.kadar = kadar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Emas: " + nama + " | Kadar: " + kadar + "K");
    }
}