/**このクラスは修理工のクラスです
 */

package character;

public class Repairer extends Human {
    private int repairerSkill; //修理スキルを持たせる

    public Repairer(String name, int age) {
        super(name, age, "修理工");
        this.repairerSkill = 50;
    }

    public void repairer(Weapon weapon) {
        System.out.println(name + "は" + weapon.getName() + "を修理している...");
        weapon.repairer(repairerSkill);
    }

    public int getRepairSkill() {
        return repairerSkill;
    }

    public void improveSkill(int amount) {
        repairerSkill += amount;
        System.out.println(name + "の修理スキルが" + repairerSkill + "に上がった！");
    }
}
