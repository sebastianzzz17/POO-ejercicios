/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.pieces;

import core.chess.board.Position;

/**
 *
 * @author sebastiancampillo
 */
public class Pawn extends Piece {

    public Pawn(boolean color) {
        super(color);
    }
    @Override
    public boolean move(Position position) {
        return true;
    }
    
}
