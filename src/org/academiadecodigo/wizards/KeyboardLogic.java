package org.academiadecodigo.wizards;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class KeyboardLogic implements KeyboardHandler {

    private Keyboard keyboard;
    private final Car picture;

    public KeyboardLogic(Car picture) {
        this.keyboard = new Keyboard(this);
        this.picture = picture;
    }



    public void init() {
        keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent one = new KeyboardEvent();
        one.setKey(KeyboardEvent.KEY_1);
        one.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(one);

        KeyboardEvent two = new KeyboardEvent();
        two.setKey(KeyboardEvent.KEY_2);
        two.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(two);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                picture.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                picture.moveDown();
                break;

            case KeyboardEvent.KEY_RIGHT:
                picture.moveRigth();
                break;

            case KeyboardEvent.KEY_LEFT:
                picture.moveLeft();
                break;


        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }



}
