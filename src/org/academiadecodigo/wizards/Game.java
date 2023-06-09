package org.academiadecodigo.wizards;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Game {
    private int delay = 100;

    private int points = 0;

    //menuinicial menu = new menuinicial();
    PointsObjects pointsObjects;

    AvoidObstacles bCar;

    //Objects objects = new Objects();
    public boolean isCrashed;


    public void init() throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {

       //menu.initMenu();

        Field f = new Field(8, 8);
        Car car = new Car();
        bCar = new AvoidObstacles();
        pointsObjects = new PointsObjects();
        KeyboardLogic keyboardLogic = new KeyboardLogic(car);

        Sound.playMusic("resources/Inquietude.wav");
        f.makeField();
        car.inicialPositionBlueCar(315, 715);
        keyboardLogic.init();

        //bCar.inicialBadCarPos(215,115);
        //bCar.badMoveDown();

        while (!isCrashed) {
            int num = (int) Math.ceil(Math.random() * 30);
            if (num <= 5) {
                bCar.inicialBadCarPos(215, 115);
                bCar.badMoveDown();
            }
            if (num > 5 && num <= 10) {
                bCar.inicialBadCarPos1(315, 115);
                bCar.badMoveDown();
            }
            if (num > 10 && num <= 15) {
                bCar.inicialBadCarPos2(415, 115);
                bCar.badMoveDown();
            }
            if (num > 15 && num <= 20) {
                bCar.inicialBadCarPos3(515, 115);
                bCar.badMoveDown();
            }
            if (num > 20 && num <= 23) {
                bCar.inicialBadCarPos(215, 115);
                bCar.badMoveDown();
            }
            if (num > 23 && num <= 26) {
                bCar.inicialBadCarPos1(315, 115);
                bCar.badMoveDown();
            }
            if (num == 27) {
                pointsObjects.inicialPoints(230, 115);
                pointsObjects.pointMoveDown();
            }
            if (num == 28) {
                pointsObjects.inicialPointsps1(330, 115);
                pointsObjects.pointMoveDown();
            }
            if (num == 29) {
                pointsObjects.inicialPointsPos2(430, 115);
                pointsObjects.pointMoveDown();
            }
            if (num == 30) {
                pointsObjects.inicialPointsPos3(530, 115);
                pointsObjects.pointMoveDown();
            }

           /*if(car.getRow() == bCar.getRow() && car.getCol() == bCar.getCol() ){
                isCrashed = true;
                init();
            }*/
            if(car.getRow() == pointsObjects.getCol() && car.getCol() == pointsObjects.getRow() ){
                points++;
                System.out.println(points);
                //pointsObjects.points.delete();
            }

        }
    }

}




