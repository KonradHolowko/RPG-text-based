import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Entity hero = new Entity("Hero", 100, WEAPONS.Sword);
        Entity monster = new Entity("Monster", 25, WEAPONS.Stick);


        Scanner scanner = new Scanner(System.in);

        hero.setLocation(ROOM.ARENA);
        hero.setLocation(ROOM.CORRIDOR);
        hero.setLocation(ROOM.ARENA);
        hero.setLocation(ROOM.SHOP);
        hero.getLocation();





        while(true) {
            System.out.print("\n\n1. Attack\n" +
                    "2. Move\n" +
                    "0. Leave\n" +
                    "Enter your choice: ");

            int i = scanner.nextInt();

            if(i == 0){
                break;
            }


            if (i == 1) {
                hero.getInfo();
                monster.getInfo();
                Combat.attack(hero, monster);
                Combat.attack(monster, hero);
                hero.getInfo();
                monster.getInfo();
            }




        }
    }
}