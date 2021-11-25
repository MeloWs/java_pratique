import java.util.*;

import character.Archer;
import character.Character;
import character.Knight;
import character.Wizard;
import player.Player;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void chooseCaracter(Player player, List<Character> team){
		System.out.println("1. Knight, 2. Wizard, 3. Archer, *just put the number of your desired character*");
		int choice = sc.nextInt();
		System.out.println("and then give him/her a name");
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
	public static void actionPlay (Player player, List<Character> team1, List<Character> team2) {
		System.out.println(player.getUsername()+ " which charater do you wanna use for this round ? *enter the number of your character*");
		System.out.println("0." + team1.get(0).getName()+ ", class : " + team1.get(0).getClass().getSimpleName());
		System.out.println("1." + team1.get(1).getName()+ ", class : " + team1.get(1).getClass().getSimpleName());
		System.out.println("2." + team1.get(2).getName()+ ", class : " + team1.get(2).getClass().getSimpleName());
		
		int characChoice = sc.nextInt();
		
		System.out.println("Then, choose what you want him/her to do");
		if (team1.get(characChoice).getClass().getSimpleName().equals("Wizard")) {
			System.out.println("1. Attack");
			System.out.println("2. Protect");
			System.out.println("3. Heal");
		} else {
			System.out.println("1. Attack");
			System.out.println("2. Protect");
		}
		
		int actionChoice = sc.nextInt();
		
		int targetChoice = 0;
		
		if(actionChoice == 2) {}
		else {
			System.out.println("and to whom you are going to apply the action in the opposing team :");
			System.out.println("0." + team2.get(0).getName()+ ", class : " + team2.get(0).getClass().getSimpleName());
			System.out.println("1." + team2.get(1).getName()+ ", class : " + team2.get(1).getClass().getSimpleName());
			System.out.println("2." + team2.get(2).getName()+ ", class : " + team2.get(2).getClass().getSimpleName());
		
		targetChoice = sc.nextInt();
		}
		
		
		switch(actionChoice){
		   
	       case 1: 
	    	   team1.get(characChoice).attack(team2, targetChoice);
	           break;
	   
	       case 2:
	    	   team1.get(characChoice).counterAttack();
	    	   System.out.println(team1.get(characChoice).getName()+ " is now protected until he/she attacks");
	           break;
	   
	       case 3:
	    	   team1.get(characChoice).getHealed();
	    	   System.out.println(team1.get(characChoice).getName()+ " uses his magic healing powers and his health is now "+ team1.get(characChoice).getHealth());
	           break;
	       default:
	           System.out.println("it seems that the number you submitted doesn't fit with any actions");
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
		
		System.out.println("Welcome to the game " + player1Name + " and " + player2Name + " !");
		System.out.println(" ");
		System.out.println("You are now going to choose the constitution of your team,");
		
		System.out.println(player1Name + ", You first, who do you want in your team, you can choose 3 members from those listed below");

//		char addCharacter = 'Y';
//		while (addCharacter == 'Y') {
//			chooseCaracter(player1, player1Team);
//		}
		chooseCaracter(player1, player1Team);
		chooseCaracter(player1, player1Team);
		chooseCaracter(player1, player1Team);
		
		System.out.println("Congratulations, " +player1Name+ " your team is complete, there are all your champions");
		for(Character elem: player1Team)
	       {
	       	 System.out.println (elem.getName());
	       }
		System.out.println(" ");
		System.out.println("It's your turn " + player2Name + " who do you want in your team, you can choose 3 members from those listed below");
		
		chooseCaracter(player2, player2Team);
		chooseCaracter(player2, player2Team);
		chooseCaracter(player2, player2Team);
		
		System.out.println("Congratulations, " +player2Name+ " your team is complete, there are all your champions");
		for(Character elem: player2Team)
	       {
	       	 System.out.println (elem.getName());
	       }
		System.out.println(" ");
		System.out.println("Now that all the teams are formed, let's begin the game");
		
		
		while (player1Team.size() > 0 || player2Team.size() > 0) {
		System.out.println(" ");
		actionPlay(player1, player1Team, player2Team);
		System.out.println(" ");
		actionPlay(player2, player2Team, player1Team);
		}
		
		sc.close();
	}

}
