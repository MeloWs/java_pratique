import java.util.*;

import character.Archer;
import character.Character;
import character.Knight;
import character.Wizard;
import player.Player;

public class Game {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int choiceCheck() {
		int choice = 0;
		while (choice == 0) {
			String myString = sc.next();
			
			try {
				   choice = Integer.parseInt(myString);
				   
				}
			catch (NumberFormatException e)
				{
				   choice = 0;
				   System.out.println("it seems that what you submitted ins't a number, please enter a valid number");
				}
		}
		if (choice > 3) {
			choice = 0;
		}
		
		return choice;
	}
	
	public static void chooseCaracter(Player player, List<Character> team){
		System.out.println("1. Knight, 2. Wizard, 3. Archer, (just put the number of your desired character)");
		
		int choice = choiceCheck();
		
		System.out.println("and then give him/her a name");
		String membername = sc.next();

		   switch(choice){
		   
		       case 1: 
		    	   Character knight = new Knight(membername, player, 10, "sword");
		           team.add(knight);
		           break;
		   
		       case 2:
		    	   Character wizard = new Wizard(membername, player, 10, "Magic");
		    	   team.add(wizard);
		           break;
		   
		       case 3:
		    	   Character archer = new Archer(membername, player, 10, "long bow");
		    	   team.add(archer);
		           break;
		       default:
		           System.out.println("it seems that the number you submitted doesn't fit with any types");
		           break;
		   }
		   
		   
		}
	public static void listChara(List<Character> team) {
		for (int i=0; i<team.size();i++) {
			System.out.println(i+". " + team.get(i).getName()+ ", type : " + team.get(i).getClass().getSimpleName()+", Health : "+ team.get(i).getHealth()+" HP, Damage : "+team.get(i).getDamage()+", Defensive Mode : "+team.get(i).isCounterAttack());
		}
		
	}
	
	public static void teamConstitution(List<Character> team, Player player) {
		System.out.println("Hello "+player.getUsername() + " ! Let's contitute your team, would you ?");
		System.out.println("Just choose one member from those listed below to add it to your Champions:");
		System.out.println(" ");

		char addCharacter = 'Y';
		while (addCharacter == 'Y' && team.size() <= 3) {
			chooseCaracter(player, team);
			System.out.println("Well done "+player.getUsername()+ ", do you want to add an other member? (Y/N)");
			addCharacter = sc.next().charAt(0);
		}
		System.out.println("Well, That means your team is complete !");
		System.out.println(" ");
	}
	
	public static void actionPlay (Player player, List<Character> team1, List<Character> team2) {
		
		System.out.println(player.getUsername()+ " which charater do you wanna use for this round ? *enter the number of your character*");
		
		listChara(team1);
		
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
		
		int actionChoice = choiceCheck();
		
		int targetChoice = 0;
		
		if(actionChoice == 2 || actionChoice == 3) {}
		else {
			System.out.println("and to whom you are going to apply the action in the opposing team :");
			listChara(team2);
		
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
		
		System.out.println("Welcome to the ArcadeGame !");
		System.out.println("Please enter the First Player's Username :");
		String player1Name = sc.next();
		Player player1 = new Player(player1Name, 1);
		List<Character> player1Team = new ArrayList<Character>();
		
		teamConstitution(player1Team, player1);
		
		System.out.println("Please enter the Second Player's Username :");
		String player2Name = sc.next();
		Player player2 = new Player(player2Name, 1);
		List<Character> player2Team = new ArrayList<Character>();
		
		teamConstitution(player2Team, player2);
		
		System.out.println("Now that all the teams are set, let's begin the game");
		
		while (player1Team.size() != 0 || player2Team.size() != 0) {
			if (player2Team.size() == 0) {
				System.out.println("Congratulations "+player1Name+ " ! You win the battle");
				break;
			}
			else if(player1Team.size() == 0){
				System.out.println("Congratulations "+player2Name+ " ! You win the battle");
				break;
			}
			
		
			else {
			System.out.println(" ");
			actionPlay(player1, player1Team, player2Team);
			System.out.println(" ");
			actionPlay(player2, player2Team, player1Team);
			}
		}
		
		sc.close();
	}

}
