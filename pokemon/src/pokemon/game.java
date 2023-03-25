package pokemon;

public class game {
 private player player1;
 private player player2;
 private int  turn=1;
 public game(player player1,player player2) {
	 this.player1=player1;
	 this.player2=player2; 
}
 public void start () {
	 while(true) {
		 //p1->pook  hit(p2)
		 pokemon player1pokemon=player1.getNextPokemon();
		 pokemon player2pokemon=player2.getNextPokemon();

		 if(player1.getHealth()<70 && player1pokemon instanceof Boostable) {
			 Boostable boostable =(Boostable)player1pokemon;
			 boostable.boost();
			 System.out.println(player1.getName()+"'in pokemonu ("+player1pokemon.getName()+")boostlandı ");
		 }
		 player1pokemon.hit(player2);
		 if(!player2.isAlive()) {
			 anonseWinner(player1);
			 break;
		 }
		 player2pokemon.hit(player1);
		 if(!player1.isAlive()) {
			 anonseWinner(player2);
			 break;
		 }
		 ptintTurnResult(player1pokemon,player2pokemon);
		 
	 }
 }
private void ptintTurnResult(pokemon p1p,pokemon p2p ) {
	System.out.println("--->TUR"+ turn+ "<---");
	System.out.println(player1.getName()+ "'in pokemonu("+p1p.getName()+") saldirdi " + p1p.getPower());
	System.out.println(player2.getName() +"'In pokemonu("+p2p.getName()+") saldirdi " + p2p.getPower());

System.out.println("1->" + player1);
System.out.println("2->" +player2);
turn++;
}
private void anonseWinner(player player) {
	System.out.println(player + " KAZANDI!!");
}
 
 
}
