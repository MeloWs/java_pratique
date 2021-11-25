//import java.util.*;
//
//import character.Archer;
//import character.Character;
//import character.Knight;
//import character.Wizard;
//import player.Player;
//
//public class Game2 {
//
//	
//		private List<Character> characters = new ArrayList<Character>();
//		//private HashMap<String, Animal> parcelle
//		
//		public List<Character> getCharacters(){
//			return characters;
//		}
//		public void setCharacters(List<Character> characters) {
//			this.characters = characters;
//		}
//	
//	
//		public void chooseCaracter(Player player){
//			Scanner sc = new Scanner(System.in);
//			int choice = sc.nextInt();
//			String membername = sc.next();
//
//			   switch(choice){
//			   
//			       case 1: 
//			           Character knight = new Knight(membername, player, 5, "sword");
//			           this.getCharacters().add(unknown);
//			           break;
//			   
//			       case 2:
//			    	   unknown = new Wizard(membername, player, 4, "Magic");
//			    	   team.add(unknown);
//			           break;
//			   
//			       case 3:
//			    	   unknown = new Archer(membername, player, 5, "long bow");
//			    	   team.add(unknown);
//			           break;
//			       default:
//			           System.out.println("it seems that the number you submitted doesn't fit with any types");
//			           break;
//			   }
//			   
//			   sc.close();
//			}
//		
//	public static void main(String[] args) {
//		Game2 game = new Game2();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Hello, Please enter the First Player's Username :");
//		String player1Name = sc.next();
//		Player player1 = new Player(player1Name, 1);
//		
//		System.out.println("Hello, Please enter the Second Player's Username :");
//		String player2Name = sc.next();
//		Player player2 = new Player(player2Name, 2);
//		
//		System.out.println("Welcome " + player1Name + " and " + player2Name + " to the game!");
//		System.out.println("You are now going to choose the constitution of your team :");
//		
//		System.out.println(player1Name + ", who do you want in your team, you can choose 3 members from those listed below");
//		System.out.println("1. Knight, 2. Wizard, 3. Archer, just put the number below and then give a him a name");
//		
//	}
//
//}
