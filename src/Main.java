public class Main {
    public static void main(String[] args) {

        Entity hero = new Entity("Hero", 100, WEAPONS.Sword);
        Entity monster = new Entity("Monster", 25, WEAPONS.Stick);

        Combat.attack(hero,monster);



        hero.getInfo();
        monster.getInfo();

    }
}