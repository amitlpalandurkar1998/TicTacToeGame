package com.tictactoegame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe Game.");
        System.out.println("Enter '1' To Get 'X' : ");
        System.out.println("Enter '0' To Get 'O' : ");

        System.out.print("Enter the Input : ");
        int input = scanner.nextInt();

        char playerLetter = ' ';
        char computerLetter = ' ';
        if (input==1){
            playerLetter='X';
            computerLetter='O';
        } else if (input==0) {
            playerLetter='O';
            computerLetter='X';
        }else {
            System.out.println("Invalid...............!");
        }

        System.out.println("\nThe Player Letter is : "+ playerLetter);
        System.out.println("\nThe Computer Letter is : "+computerLetter);
    }
}
