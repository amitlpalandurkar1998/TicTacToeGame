package com.tictactoegame;
public class TicTacToeGame {

        char [] tictac = new char[10];
    public void board(){
        tictac[1] = ' ';
        tictac[2] = ' ';
        tictac[3] = ' ';
        tictac[4] = ' ';
        tictac[5] = ' ';
        tictac[6] = ' ';
        tictac[7] = ' ';
        tictac[8] = ' ';
        tictac[9] = ' ';
        tictac[10] = ' ';

    }
    public void showBoard(){
        for (int i=1; i< tictac.length; i++){
            if (i==4){
                System.out.println();
            } else if (i==7) {
                System.out.println();
            }
            System.out.print(tictac[i]);
        }
    }

}
