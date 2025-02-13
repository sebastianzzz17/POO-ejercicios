/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.Chess;
import core.chess.board.Position;

/**
 *
 * @author sebastiancampillo
 */
public class Piece {
    private boolean color;
    private int type;
    private Chess chess;
    private Position position;
    
    public boolean move(Position position){
        return true;
    }
}
