package PenjualanPerhiasan;

public class Perak extends Perhiasan {

    private String kualitas;

    public Perak(String id, String nama, double harga, int stok, String kualitas) {
        super(id, nama, "Perak", harga, stok);
        this.kualitas = kualitas;
    }

    @Override
    public void displayInfo() {
        System.out.println("Perak: " + nama + " | Kualitas: " + kualitas);
    }
}