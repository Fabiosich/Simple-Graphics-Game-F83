package org.academiadecodigo.wizards;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class AvoidObstacles extends Objects {

    private int row;
    private int col;

    Field position;

    Rectangle badC;
    Picture badCar;

    private boolean isCrashed;

    @Override

    public void goDown(){
        badCar.translate(0,100);

    }
    public int inicialBadCarPos(int col, int row) {
        badCar = new Picture(col,row, "resources/download-1_copy-removebg-preview 2.png");
        badCar.draw();
        return col;
    }
    public int inicialBadCarPos1(int col, int row){
        badCar = new Picture(col,row, "resources/download-1_copy-removebg-preview 2.png");
        badCar.draw();
        return col;
    }

    public int inicialBadCarPos2(int col, int row){
        badCar = new Picture(col,row, "resources/download-1_copy-removebg-preview 2.png");
        badCar.draw();
        return col;
    }

    public int inicialBadCarPos3(int col, int row){
        badCar = new Picture(col,row, "resources/download-1_copy-removebg-preview 2.png");
        badCar.draw();
        return col;
    }
    public void badMoveDown() throws InterruptedException {
        while (badCar.getY() < 670) {
            int delay = 100;
            badCar.translate(0,50);
            badCar.draw();
            Thread.sleep(delay);
        }
        badCar.delete();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

