package com.tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        boolean playerChance = true;
        boolean computerChance = true;

        System.out.println("Welcome to Tic Tac Toe Game.");
        System.out.println("Enter '0' For Head : ");
        System.out.println("Enter '1' For Tail : ");
        int tos = scanner.nextInt();
        int tosACoin = random.nextInt(2);
        if (tos==tosACoin){
            System.out.println("You win the toas.");
            System.out.println("You play First.");
            playerChance = true;
            computerChance = false;
        }else {
            System.out.println("You Lose the Toas.");
            System.out.println("Computer played first");
            playerChance = false;
            computerChance = true;
        }

        System.out.println("Welcome to Tic Tac Toe Game.");
        System.out.println("Enter '1' To Get 'X' : ");
        System.out.println("Enter '0' To Get 'O' : ");
        System.out.println("Enter '2' To Display Board : ");

        System.out.print("Enter the Input : ");
        int input = scanner.nextInt();

        char playerLetter = ' ';
        char computerLetter = ' ';
        switch (input){
            case 0 :
                playerLetter='O';
                computerLetter='X';
                break;
            case 1 :
                playerLetter='X';
                computerLetter='O';
                break;
            case 2 :
                ticTacToeGame.showBoard();
                break;
            default:
                System.out.println("\nInvalid...............!");
                break;
        }
        System.out.println("\nThe Player Letter is : "+ playerLetter);
        System.out.println("\nThe Computer Letter is : "+computerLetter);
        System.out.println();

        while (isRunning){
            ticTacToeGame.showBoard();
            System.out.println("\n");
            System.out.print("player Selete the Index Number (between 1 to 9): ");
            int playerPosition = scanner.nextInt();
            ticTacToeGame.check(playerPosition);
            isRunning= ticTacToeGame.firstCheckAnyfreeSpace();
        }
    }
}