package event;

import java.util.Scanner;

public class Prologue {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String[] lines = {
            "ようやくここまで来たか",
            "お前たちも、ここまで良く付いてきてくれたな",
            "最後の戦いだ！歯ぁ食いしばれよ！！"
        };

        for (String line : lines) {
            System.out.println(line);
            System.out.println(" ▼ ");
            scanner.nextLine();
        }
    }
}
