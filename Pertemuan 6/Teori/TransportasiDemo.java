import transportasi.Bicycle;
import transportasi.Mobil;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil Avanza = new Mobil();
        Avanza.setWarna("Putih");
        Avanza.setNopol("G 123 AC");
        System.out.println("Mobil Avanza dengan warna " + Avanza.getWarna() + " dan nopol " + Avanza.getNopol());

        Mobil Jazz = new Mobil("Merah", "G 2 B", 2019, "Pertamax Turbo");
        System.out.println("Mobil Jazz dengan warna " + Jazz.getWarna() + " dan nopol " + Jazz.getNopol() + " tahun produksi " + Jazz.getTahunProduksi() + " dengan bahan bakar " + Jazz.getBahanBakar());

        Bicycle pixy = new Bicycle();
        pixy.setWarna("Putih");
        System.out.println("Sepeda dengan warna " + pixy.getWarna());

        Bicycle a = new Bicycle("Hitam", "Polygon",);
        System.out.println("Sepeda dengan warna " + a.getWarna() + " dengan merek " + a.getMerek());
    }
}