/**このクラスは、人間のキャラクターの基本的な動きをまとめたクラスです
 */
package character;

public class Human {
    protected String name; //名前
    protected int age;
    protected String role; //役職・職業など

    //コンストラクタ
    public Human(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void introduce() {
        System.out.println("私は" + name + "、" + age + "歳の" + role + "です。");
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }
}
