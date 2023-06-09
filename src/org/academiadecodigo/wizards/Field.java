package org.academiadecodigo.wizards;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Field {


    Picture bannerJogo;
    Picture field;
    private int cols;

    private int rows;

    public Rectangle[][] rectangle;

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public Field(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        rectangle = new Rectangle[cols][rows];
    }
        public void makeField(){
        int x = 10;
        int y = 10;
        int width = 100;
        int heigth = 100;

            for (int i = 0; i < cols ; i++) {
                for (int j = 0; j < rows ; j++) {
                    rectangle[i][j] = new Rectangle(x,y,width,heigth);
                    rectangle[i][j].draw();
                    rectangle[i][j].fill();
                    rectangle[i][j].setColor(Color.BLACK);
                    rectangle[0][j].setColor(Color.BLACK);
                    rectangle[0][j].fill();
                    x+=width;
                }
                x=10;
                y+=heigth;
                rectangle[i][0].fill();
                rectangle[i][1].fill();
                rectangle[i][6].fill();
                rectangle[i][7].fill();
            }
            field = new Picture(210,110, "resources/Road 005_00000.png");
            field.draw();
            bannerJogo = new Picture(10,10, "resources/bannerJogo.png");
            bannerJogo.draw();

        }






}
