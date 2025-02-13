/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess;

import core.chess.board.Board;
import core.chess.pieces.Piece;
import core.person.Player;
import java.util.ArrayList;

/**
 *
 * @author sebastiancampillo
 */
public class Chess {
    private Player player1;
    private Player player2;
    private ArrayList<Piece> pieces;
    private Board board;

    public Chess(Player player1, Board board) {
        this.player1 = player1;
        this.board = board;
        this.player1.setChess(this);
        this.board.setChess(this);
    }
    
}
