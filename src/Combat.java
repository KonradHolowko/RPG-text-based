public class Combat {
    public static void attack(Entity attacker, Entity defender){

        if(defender.getHp() == 0){
            System.out.println("You can't attack it. It's already dead");
        }
        else{
            System.out.println("\n"+attacker.getName() + " attacks " + defender.getName() + " with " + attacker.getWeapon() + " for " + attacker.getWeapon().getDamage() + " damage!");
            defender.takeDamage(attacker.getWeapon().getDamage());
        }
    }


}
