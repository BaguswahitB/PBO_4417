public class TestGame {
      public static void main(String[] args){
            //GamePlayer player = new GamePlayer();
            //player.setDimension(5, 10);
            //player.setPosition(50, 50);
            //System.out.println("Player Width :"+ player.getWidth()+"Player Height :"+ player.getHeight()+" Player X :"+ player.getX()+ "Player Y :"+ player.getY());
            //player.Run();
            //player.Run(20);
     
    
            //GameEnemy enemy = new GameEnemy();
            //enemy.setDimension(40, 80);
            //enemy.setPosition(50, 25);
            //System.out.println("Enemy Width :"+ enemy.getWidth()+ "Enemy Height :"+ enemy.getHeight()+ "Enemy X :"+ enemy.getX()+ "Enemy Y :"+ enemy.getY());
            //enemy.Run();

            GamePlayer hero = new GamePlayer();
            hero.setDimension(12, 12);
            hero.setPosition(10, 120);
            System.out.println("Posisi Player :"+hero.getX()+","+hero.getY());
            hero.Run(12);
            System.out.println("Posisi Player :"+hero.getX()+","+hero.getY());
            GamePlayer hero2 = new GamePlayer();
            hero2.setDimension(12, 32);
            hero2.setPosition(10, 10);

            GameEnemy monster = new GameEnemy();
            monster.setDimension(12, 32);
            monster.setPosition(10, 10);

            GameEnvironment scene = new GameEnvironment();
            scene.addPlayer(hero);
            scene.addPlayer(hero);
            scene.addPlayer(hero2);
            scene.getAllPlayers();
            scene.getAllEnemies();
            scene.removePlayer(hero);
            scene.getAllPlayers();
            scene.addEnemy(monster);
            scene.Interaction();
      }
}


