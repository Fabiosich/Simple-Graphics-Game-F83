package org.academiadecodigo.wizards;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class PointsObjects extends Objects {

    private int col;

    private int row;

    Field position;

    Rectangle objects;

    private boolean isCrashed;

    Picture points;

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void inicialPoints(int col, int row) {
        points = new Picture(col, row, "resources/Points.png");
        points.draw();
    }

    public void inicialPointsps1(int col, int row) {
        points = new Picture(col, row, "resources/Points.png");
        points.draw();
    }

    public void inicialPointsPos2(int col, int row) {
        points = new Picture(col, row, "resources/Points.png");
        points.draw();
    }

    public void inicialPointsPos3(int col, int row) {
        points = new Picture(col, row, "resources/Points.png");
        points.draw();
    }

    public void pointMoveDown() throws InterruptedException {
        while (points.getY() < 700) {
            int delay = 100;
            points.translate(0, 50);
            points.draw();
            Thread.sleep(delay);
        }
        points.delete();
    }
}


