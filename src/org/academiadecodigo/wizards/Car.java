package org.academiadecodigo.wizards;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Car {
    Picture picture;

    Rectangle[][] rectangle;

    private boolean isCrashed;

    private int row;

    private int col;

    Field position;

    public Field getPosition() {
        return position;
    }

    /*public Car(Picture picture) {
        this.picture = picture;
    }*/

    public void inicialPositionBlueCar(int col, int row) {
        //Rectangle rectangle = new Rectangle(col, row, 90, 90);
        picture = new Picture(col,row, "resources/bluecar.png");
        picture.draw();
        //picture.grow(-50,-50);


    }
    public void moveUp() {
        if(row == -4){
            return;
        }

        picture.translate(0, -100);
        row--;
    }

    public void moveDown() {
        if(row == 0){
            return;
        }
        picture.translate(0, 100);
        row++;
    }

    public void moveLeft() {
        if (col == -1){
           return;
        }
        picture.translate(-100, 0);
        col--;
    }

    public void moveRigth() {
        if(col == 2){
            return;
        }
        picture.translate(100, 0);
        col++;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
