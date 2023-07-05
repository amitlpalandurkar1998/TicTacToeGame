package com.tictactoegame;
public class TicTacToeGame {
    static char [] tictac = new char[10];
    public void board(){
        tictac[1] = '_';
        tictac[2] = '_';
        tictac[3] = '_';
        tictac[4] = '_';
        tictac[5] = '_';
        tictac[6] = '_';
        tictac[7] = '_';
        tictac[8] = '_';
        tictac[9] = '_';

    }
    public void showBoard(){
        board();
        for (int i=1; i< tictac.length; i++){
            if (i==4){
                System.out.println();
            } else if (i==7) {
                System.out.println();
            }
            System.out.print(tictac[i]+"  ");
        }

    }
    public void check(int playerPosition){
        char temp = tictac[playerPosition];
        if (temp=='_'){
            System.out.println("Index is free. ");
        }else {
            System.out.println("Index is not free .");
        }
    }
    public boolean firstCheckAnyfreeSpace(){
        boolean checkFreeSpace = true;
        for (int i=1; i<=9; i++){
            if (tictac[i]=='_'){
                checkFreeSpace=true;
            }else {
                checkFreeSpace=false;
            }
        }
        return checkFreeSpace;
    }
}