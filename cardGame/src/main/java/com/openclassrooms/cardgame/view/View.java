package com.openclassrooms.cardgame.view;

import com.openclassrooms.cardgame.controller.GameController;

import java.util.Scanner;

public class View {
    GameController controller;
    Scanner keyboard = new Scanner(System.in);
    public void setController(GameController gc){
        this.controller = gc;
    }
    public void promptForPlayerName(){
        System.out.println("Enter Player Name: ");
        String name = keyboard.nextLine();
        if(name.length()==0){
            controller.startGame();
        } else {
            controller.addPlayers(name);
        }
    }
    public void promptForFlip(){
        System.out.println("Press Enter to reveal cards");
        keyboard.nextLine();
        controller.flipCards();
    }
    public void promptForNewGame(){
        System.out.println("Press Enter to play again");
        keyboard.nextLine();
        controller.startGame();
    }
    public void showPlayerName(int playerIndex, String playerName){
        System.out.println("["+ playerIndex+ "]["+playerName+"]");
    }
    public void showFaceDownCardForPlayer(int playerIndex, String playerName){
        System.out.println("["+ playerIndex+ "]["+playerName+"][x][x]");
    }
    public void showWinner(String playerName){
        System.out.println("Winner is "+ playerName+ " !");
    }
    public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit){
        System.out.println("["+playerIndex+ "]["+playerName+"]["+rank+"]["+suit+"]");
    }
}
