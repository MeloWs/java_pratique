import java.util.*;

import character.Archer;
import character.Character;
import character.Knight;
import character.Wizard;
import player.Player;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void chooseCaracter(Player player, List<Character> team){
		System.out.println("1. Knight, 2. Wizard, 3. Archer, just put the number below");
		int choice = sc.nextInt();
		System.out.println("and then give him a name");
		String membername = sc.next();

		   switch(choice){
		   
		       case 1: 
		    	   Character knight = new Knight(membername, player, 5, "sword");
		           team.add(knight);
		           break;
		   
		       case 2:
		    	   Character wizard = new Wizard(membername, player, 4, "Magic");
		    	   team.add(wizard);
		           break;
		   
		       case 3:
		    	   Character archer = new Archer(membername, player, 3, "long bow");
		    	   team.add(archer);
		           break;
		       default:
		           System.out.println("it seems that the number you submitted doesn't fit with any types");
		           break;
		   }
		   
		   
		}
	
	public static void main(String[] args) {
		
		System.out.println("Hello, Please enter the First Player's Username :");
		String player1Name = sc.next();
		Player player1 = new Player(player1Name, 1);
		List<Character> player1Team = new ArrayList<Character>();
		
		System.out.println("Hello, Please enter the Second Player's Username :");
		String player2Name = sc.next();
		Player player2 = new Player(player2Name, 1);
		List<Character> player2Team = new ArrayList<Character>();
		
		System.out.println("Welcome " + player1Name + " and " + player2Name + " to the game!");
		System.out.println("You are now going to choose the constitution of your team :");
		
		System.out.println(player1Name + ", who do you want in your team, you can choose 3 members from those listed below");
		
		chooseCaracter(player1, player1Team);
		chooseCaracter(player1, player1Team);
		chooseCaracter(player1, player1Team);
		for(Character elem: player1Team)
	       {
	       	 System.out.println (elem.getName());
	       }
		System.out.println("Congratulation, " +player1Name+ " your team is complete");
		
		
		chooseCaracter(player2, player2Team);
		chooseCaracter(player2, player2Team);
		chooseCaracter(player2, player2Team);
		for(Character elem: player2Team)
	       {
	       	 System.out.println (elem.getName());
	       }
		System.out.println("Congratulation, " +player2Name+ " your team is complete");
		
		System.out.println("Now that all the teams are formed, let's begin the game");
		System.out.println(player1Name+ " which carater do you wanna use for this round ?");
		
		
		
		
		
		
		player1Team.get(1).attack(player2Team, 0);
		
		sc.close();
		//System.out.println(player2Team.forEach(a -> a.getName()));
		
		
		//System.out.println(knight);
	}

}
