package PenjualanPerhiasan;

public class Perak extends Perhiasan {

    private String kualitas;

    public Perak(String id, String nama, String jenis, double harga, int stok, String kualitas) {
        super(id, nama, jenis, harga, stok);
        this.kualitas = kualitas;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kualitas: " + kualitas);
    }
}