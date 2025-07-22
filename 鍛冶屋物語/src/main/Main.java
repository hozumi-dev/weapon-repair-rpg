package main;

import character.Repairer;
import character.Weapon;

public class Main {
    public static void main(String[] args) {
        Repairer r = new Repairer("ロルフ", 58);
        r.introduce();

        Weapon axe = new Weapon("古代の斧",80);
        r.repairer(axe);
    }
}
