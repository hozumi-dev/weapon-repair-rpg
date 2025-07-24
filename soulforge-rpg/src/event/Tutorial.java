package event;

import character.Repair;
import character.Weapon;

import java.util.Scanner;

public class Tutorial {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        //ロルフと武器たちの初期化
        Repair rolf = new Repair("ロルフ", 50);
        Weapon blade = new Weapon("フェンリルの剣", 80);
        Weapon axe = new Weapon("ガルダの斧", 100);

        //武器の声
        System.out.println(blade.getName() + "：いくぞ");
        System.out.println(axe.getName() + "：ここまで良くやった");

        //擬似バトル
        System.out.println("▼(修理へ)");
        scanner.nextLine();

        blade.use();
        System.out.println(blade.getName() + "はダメージを受けている");
        System.out.println("ロルフの修理");
        rolf.repair(blade);

        System.out.println("▼(終了)");
        scanner.nextLine();
    }
}
