public class test {
  public static void main(String[] args) {
    Mobil mobil1 = new Sedan("ProMax","Civic","CV-X",10000);
    Mobil mobil2 = new Minibus("ProMas","Haryanto","S-class",40000);
    Mobil mobil3 = new Bus("ProBus","Setiajaya","AB-Max",80000);

    Karyawan karyawan1 = new Karyawan("Aci","Sales",4);

    // System.out.println("Harga Mobil : " + mobil1.getHarga());
    // System.out.println("Jenis Merk : " + mobil1.getMerk());
    // System.out.println("Harga Model : " + mobil1.getModel());
    System.out.println("  ");

    Pembeli pembeli1 = new Individu("Bagus",1234567);
    pembeli1.addMobil(mobil1);
    pembeli1.addMobil(mobil2);

    System.out.println("  ");
    
    pembeli1.getMobil();

    System.out.println("  ");
    karyawan1.setGaji(pembeli1.invoice());
    System.out.println("Gaji Karyawan : Rp." + karyawan1.getGaji());
    System.out.println("  ");


    Pembeli pembeli2 = new Borongan("Wahit",1234567);
    pembeli2.addMobil(mobil3,4);
    // pembeli2.addMobil(mobil3);
    // pembeli2.addMobil(mobil3);

    System.out.println("  ");

    pembeli2.getMobil();

    // System.out.println("  ");

    karyawan1.setGaji(pembeli2.invoice());
    System.out.println("Gaji Karyawan : Rp." + karyawan1.getGaji());
    System.out.println("  ");

    karyawan1.getPembeli(pembeli1);
    System.out.println("  ");
    karyawan1.getPembeli(pembeli2);

  }
}
