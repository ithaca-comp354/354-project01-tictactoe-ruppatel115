package edu.ithaca.dragon.games.tictactoe.player;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;
import org.javatuples.Pair;


public class ExpertPlayer implements TicTacToePlayer{
    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
        if(curBoard.isSquareOpen(new Pair<>(1,1))){
            return new Pair<>(1,1);
        }


        for (int y=0; y<3; y++){
            for(int x=0; x<3;x++) {

                if (((curBoard.checkForWin('X')) && curBoard.isSquareOpen(new Pair<>(x, y)))){
                    return new Pair<>(x, y);
                }

                else if (curBoard.checkForWin('O') || curBoard.isSquareOpen(new Pair<>(x, y))){
                    return new Pair<>(x, y);
                }


            }

        }
        throw new IllegalArgumentException("Board with no moves given to player:\n" + curBoard.displayString());
    }



}
