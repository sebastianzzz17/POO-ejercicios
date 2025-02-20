/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import core.chess.Chess;
import core.chess.board.Board;
import core.chess.pieces.Piece;
import core.person.Player;
import java.util.ArrayList;

/**
 *
 * @author sebastiancampillo
 */
public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("juan");
        Player player2 = new Player("Pedro");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println((char) 65);
        Board board = new Board();
        Chess chess = new Chess(player1, board);
        ArrayList<Piece> pieces = Piece.generatePieces();
        System.out.println(pieces);

    }

}
