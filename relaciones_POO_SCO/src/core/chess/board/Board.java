/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.chess.board;

import core.chess.Chess;
import java.util.ArrayList;

/**
 *
 * @author sebastiancampillo
 */
public class Board {
    private ArrayList<Position>positions;
    private Chess chess;

    public Board() {
        this.positions =this.generatePositions();
    }
    
    private ArrayList<Position> generatePositions(){
        ArrayList<Position> positions=new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
              int row=i+1;
               String column=""+(char)(j+65);
               boolean color = (i+j)%2 !=0;
              positions.add(new Position(row,column,color));
                System.out.println( row+""+column+""+color);
            }
            
        }
        return positions;
    }

    public void setChess(Chess chess) {
        this.chess = chess;
        
    }
    
}
