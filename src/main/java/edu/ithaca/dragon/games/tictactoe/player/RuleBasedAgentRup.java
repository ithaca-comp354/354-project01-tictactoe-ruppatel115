package edu.ithaca.dragon.games.tictactoe.player;

import edu.ithaca.dragon.games.tictactoe.board.TicTacToeBoard;
import org.javatuples.Pair;


public class RuleBasedAgentRup implements TicTacToePlayer {


    private int[][] preferredMoves = {
            {1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2},
            {0, 1}, {1, 0}, {1, 2}, {2, 1}};

    @Override
    public Pair<Integer, Integer> chooseSquare(TicTacToeBoard curBoard, char yourSymbol) {

        //if middle is open, take it
        if (curBoard.isSquareOpen(new Pair<>(1, 1))) {
            return new Pair<>(1, 1);
        }

        // we have a winning move, take it
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (curBoard.isSquareOpen(new Pair<>(x, y))) {
                    curBoard.setSquare(new Pair<>(x, y), yourSymbol);

                    if (curBoard.checkForWin(yourSymbol)) {
                        return new Pair<>(x, y);
                    }
                }
            }
        }


        // opponent winning move, block it
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (curBoard.isSquareOpen(new Pair<>(x, y))) {
                    curBoard.setSquare(new Pair<>(x, y), yourSymbol);

                    if (curBoard.checkForWin(yourSymbol)) {
                        return new Pair<>(x, y);
                    }
                }
            }
        }

        //nothing available, take a move.
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (curBoard.isSquareOpen(new Pair<>(x, y))) {
                    curBoard.setSquare(new Pair<>(x, y), yourSymbol);

                }
            }
        }


                throw new IllegalArgumentException("Board with no moves given to player:\n" + curBoard.displayString());
            }


}


