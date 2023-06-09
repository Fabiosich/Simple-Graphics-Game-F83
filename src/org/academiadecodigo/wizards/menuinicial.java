package org.academiadecodigo.wizards;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class menuinicial {


        Picture tetris;
        Picture penaltyKick;
        Picture spaceInvaders;
        Picture f83;

        Picture welcome;

        Picture start;
        Picture academia;


        private int cols;
        public int rows;

        Rectangle[][] rectangle;

        public int getCols() {
            return cols;
        }

        public int getRows() {
            return rows;
        }
        public void delete() {
            start.delete();
        }



        public void Grid(int cols, int rows) {
            this.cols = cols;
            this.rows = rows;
            rectangle = new Rectangle[cols][rows];
        }

        public void initMenu() {
            int x = 10;
            int y = 10;
            int width = 100;
            int height = 100;

            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    rectangle[i][j] = new Rectangle(x, y, width, height);
                    rectangle[i][j].draw();
                    rectangle[i][j].setColor(Color.BLACK);
                    x += width;
                }
                x = 10;
                y += height;
            }

            tetris = new Picture(10, 110, "resources/tetris2_360.png");
            tetris.draw();

            penaltyKick = new Picture(10, 410, "resources/penalty_kick_360.png");
            penaltyKick.draw();

            spaceInvaders = new Picture(310, 110, "resources/spaceinvaders2_360.png");
            spaceInvaders.draw();

            f83 = new Picture(310, 410, "resources/f83_360.jpg");
            f83.draw();

            welcome = new Picture(10, 10, "resources/welcome.png");
            welcome.draw();

            start = new Picture(610, 110, "resources/start_480.png");
            start.draw();

            academia = new Picture(610, 10, "resources/Academia2.jpg");
            academia.draw();

        }


    }



