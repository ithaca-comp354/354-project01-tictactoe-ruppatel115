package edu.ithaca.dragon.games.tictactoe.player;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;
import org.javatuples.Pair;


public class ExpertPlayer implements TicTacToePlayer {


    private int[][] preferredMoves = {
            {1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2},
            {0, 1}, {1, 0}, {1, 2}, {2, 1}};

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {
        if (curBoard.isSquareOpen(new Pair<>(1, 1))) {
            return new Pair<>(1, 1);
        }


        for (int [] move : preferredMoves){


            if(curBoard.isSquareOpen(new Pair<>(move[0], move[1]))){
                return new Pair<>(move[0], move[1]);



            }

        }
        throw new IllegalArgumentException("Board with no moves given to player:\n" + curBoard.displayString());
    }



}
