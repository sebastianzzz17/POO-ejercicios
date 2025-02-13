/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.chess.Chess;
import core.chess.board.Position;
import core.chess.pieces.Piece;

/**
 *
 * @author sebastiancampillo
 */
public class Player {
    private String name;
    private Chess chess;
    public boolean  movePiece(Piece piece,Position position){
        return true;
    }

    public Player(String name) {
        this.name = name;
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }

    public void setChess(Chess aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
