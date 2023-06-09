package org.academiadecodigo.wizards;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
/*

    Field f = new Field(8, 8);
    Car car = new Car();
    AvoidObstacles badCar = new AvoidObstacles();

    KeyboardLogic keyboardLogic = new KeyboardLogic(car);
    f.makeField();
    car.inicialPositionBlueCar(315,715);
    badCar.inicialBadCarPos(215,115);
    badCar.inicialBadCarPos1(315,115);
    badCar.inicialBadCarPos2(415,115);
    badCar.inicialBadCarPos3(515,115);
    keyboardLogic.init();
*/
        Game game = new Game();
        //game.init();
        AvoidObstacles car = new AvoidObstacles();
        car.inicialBadCarPos(215,115);
        game.init();



    }
}