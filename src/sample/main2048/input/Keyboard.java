package sample.main2048.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

    public static boolean[] keys = new boolean[256];
    public static boolean[] lastKeys = new boolean[256];

    public void update() {
        for (int i = 1; i < keys.length; i++) {
            lastKeys[i] = keys[i];
        }
    }

    public static boolean key(int key) {
        return keys[key];
    }

    public static boolean keyDown(int key) {
        return keys[key] && !lastKeys[key];
    }

    public static boolean keyUp(int key) {
        return !keys[key] && lastKeys[key];
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}
