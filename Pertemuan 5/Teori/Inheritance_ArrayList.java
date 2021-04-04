import java.util.ArrayList;

public class Inheritance_ArrayList {
      public static void main(String args[]){
            Hewan hewan = new Hewan();
            System.out.println(hewan.sisaHewan());
 
            hewan.tambahHewan("Kucing");
            hewan.tambahHewan("Anjing");
            hewan.tambahHewan("Tikus");
            System.out.println(hewan.sisaHewan());
 
            hewan.gantiHewan(2,"Buaya");
            System.out.println(hewan.sisaHewan());
 
            hewan.hewanMati();
            System.out.println(hewan.sisaHewan());
      }
}

class Kebun_Binatang {
      ArrayList<String> animal = new ArrayList<String>();

      public Kebun_Binatang(){

      }
      public void setHewan(ArrayList<String> animal) {
            this.animal = animal;
      }
      public ArrayList<String> getHewan(){
            return this.animal;
      }
} 

class Hewan extends Kebun_Binatang {
      public void tambahHewan(String animal){
            super.getHewan().add(animal);
      }
      public String hewanMati(int index){
            return super.getHewan().remove(index);
      }
      public void gantiHewan(int index, String animal){
            super.getHewan().set(index, animal);
      }
      public ArrayList<String> sisaHewan(){
            return super.getHewan();
      }
}