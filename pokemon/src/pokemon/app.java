package pokemon;

import javax.management.loading.PrivateClassLoader;

public class app {

	public static void main(String[] args) throws Exception {

		player p1=new player("MEHMET");
		player p2=new player("CAN");
       
		pokemon pok1 = new Pikachu();
		pokemon pok2 = new Misty();
		pokemon pok3 = new Charizard();
		pokemon pok4 = new Charizard();
        p1.add(pok1);
        p1.add(pok1);
        p2.add(pok3);
        p2.add(pok4);

  game game =new game(p1, p2);
game.start();
	}

}
