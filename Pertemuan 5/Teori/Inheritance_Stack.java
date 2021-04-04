import java.util.Stack;

public class Inheritance_Stack {
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
      Stack<String> animal = new Stack<String>();
 
      public Kebun_Binatang(){
 
      }
      public void setHewan(Stack<String> animal) {
            this.animal = animal;
      }
      public Stack<String> getHewan(){
            return this.animal;
      }
} 
 
class Hewan extends Kebun_Binatang {
      public void tambahHewan(String animal){
            super.getHewan().push(animal);
      }
      public String hewanMati(){
            return super.getHewan().pop();
      }
      public void gantiHewan(int index,String animal){
            super.getHewan().set(index, animal);
      }
      public Stack<String> sisaHewan(){
            return super.getHewan();
      }
}

