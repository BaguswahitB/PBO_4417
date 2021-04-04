import java.util.Queue;
import java.util.LinkedList;
public class Inheritance_Queue {
      public static void main(String args[]){
            Hewan hewan = new Hewan();
            System.out.println(hewan.sisaHewan());
 
            hewan.tambahHewan("Kucing");
            hewan.tambahHewan("Anjing");
            hewan.tambahHewan("Kelinci");
            hewan.tambahHewan("Singa");
            hewan.tambahHewan("Harimau");
            System.out.println(hewan.sisaHewan());
 
            hewan.hewanMati(3);
            System.out.println(hewan.sisaHewan());
      }      
}

class Kebun_Binatang {
      Queue<String> animal = new LinkedList<String>();
 
      public Kebun_Binatang(){
 
      }
      public void setHewan(Queue<String> animal) {
            this.animal = animal;
      }
      public Queue<String> getHewan(){
            return this.animal;
      }
}

class Hewan extends Kebun_Binatang {
      public void tambahHewan(String animal){
            super.getHewan().add(animal);
      }
      public void hewanMati(int index){
            System.out.println(super.getHewan().poll());
      }
      public Queue<String> sisaHewan(){
            return super.getHewan();
      }
} 