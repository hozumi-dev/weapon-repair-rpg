package game;

import java.util.Scanner;

public class StartScreen {
    public static int show() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== 鍛冶屋物語 =====");
        System.out.println("1. ゲームを始める");
        System.out.println("2. 終了する");
        System.out.println("選択肢を入力してください：");

        int choice = scanner.nextInt();
        return choice;
    }
}