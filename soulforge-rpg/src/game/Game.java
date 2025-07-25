package game;

import game.event.Prologue;
import game.event.Tutorial;

public class Game {
    public void start() {
        StartScreen screen = new StartScreen();
        int choice = screen.show();

        switch (choice) {
            case 1:
                Prologue.start();
                Tutorial.start();
                break;
            case 2:
                System.out.println("ゲームを終了します");
                break;   
            default:
                System.out.println("無効な選択です");
                break;     
        }
    }
}
