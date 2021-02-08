package edu.ithaca.dragon.games.tictactoe;

import edu.ithaca.dragon.games.tictactoe.player.RuleBasedAgentRup;
import edu.ithaca.dragon.games.tictactoe.player.HumanPlayer;

public class TicTacToeMain {
    public static void main (String[] args){
        new TicTacToeGame( new HumanPlayer(), new RuleBasedAgentRup()).play();
    }
    
}
