package com.tictactoegame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

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
