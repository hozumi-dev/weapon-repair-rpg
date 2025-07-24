/**このクラスは修理工のクラスです
 */

package character;

public class Repair extends Human {
    private int repairSkill; //修理スキルを持たせる

    public Repair(String name, int age) {
        super(name, age, "修理工");
        this.repairSkill = 50;
    }

    public void repair(Weapon weapon) {
        System.out.println(name + "は" + weapon.getName() + "を修理している...");
        weapon.repairer(repairSkill);
    }

    public int getRepairSkill() {
        return repairSkill;
    }

    public void improveSkill(int amount) {
        repairSkill += amount;
        System.out.println(name + "の修理スキルが" + repairSkill + "に上がった！");
    }
}
