public class Combat {
    public static void attack(Entity attacker, Entity defender){

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " + attacker.getWeapon() + " for " + attacker.getWeapon().getDamage() + " damage!");
        defender.takeDamage(attacker.getWeapon().getDamage());
    }
}
