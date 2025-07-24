package main;

import character.Repair;
import character.Weapon;
import event.Prologue;
import event.Tutorial;

public class Main {
    public static void main(String[] args) {
        Repair r = new Repair("ロルフ", 58);
        r.introduce();

        Weapon axe = new Weapon("古代の斧",80);
        r.repair(axe);

        Prologue.start();
        Tutorial.start();
    }
    

}
