package Praktek;

public class TestGame {
      public static void main(String[] args){
     GamePlayer player = new GamePlayer();
     player.setDimension(5, 10);
     player.setPosition(50, 50);
     System.out.println("Player Width :"+ player.getWidth()+"Player Height :"+ player.getHeight()+" Player X :"+ player.getX()+ "Player Y :"+ player.getY());
     player.Run();
     player.Run(20);
     
    
    GameEnemy enemy = new GameEnemy();
     enemy.setDimension(40, 80);
     enemy.setPosition(50, 25);
     System.out.println("Enemy Width :"+ enemy.getWidth()+ "Enemy Height :"+ enemy.getHeight()+ "Enemy X :"+ enemy.getX()+ "Enemy Y :"+ enemy.getY());
     enemy.Run();
     }
}
