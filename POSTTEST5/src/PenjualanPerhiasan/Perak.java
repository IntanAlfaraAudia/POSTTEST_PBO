package PenjualanPerhiasan;

public class Perak extends Perhiasan {

    private String kualitas;

    public Perak(String id, String nama, String jenis, double harga, int stok, String kualitas) {
        super(id, nama, jenis, harga, stok);
        this.kualitas = kualitas;
    }

    @Override
    public void tampilInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis: " + getJenis());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Kualitas: " + kualitas);
    }
}