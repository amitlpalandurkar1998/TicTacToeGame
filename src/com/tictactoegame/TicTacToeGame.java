package com.tictactoegame;
public class TicTacToeGame {
    static char [] tictac = new char[10];
    public void board(){
        tictac[1] = '1';
        tictac[2] = '1';
        tictac[3] = '1';
        tictac[4] = '1';
        tictac[5] = '1';
        tictac[6] = '1';
        tictac[7] = '1';
        tictac[8] = '1';
        tictac[9] = '1';

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
