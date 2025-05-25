public class Combat {
    public static void attack(Entity attacker, Entity defender){

        if(defender.getHp() == 0){
            System.out.println("\nYou can't attack it. It's already dead");
        }
        else{
            int damage = attacker.getWeapon().getDamage() + ((int) (Math.random() * 10));
            System.out.println("\n"+attacker.getName() + " attacks " + defender.getName() + " with " + attacker.getWeapon() + " for " + damage  + " damage!");
            defender.takeDamage(damage);
        }
    }

    public static void battle(Entity attacker, Entity defender){
        System.out.println("\nThe battle begin!" +
                "\nThe dices are rolling...");

        if((Math.random()*6) + 1 > 3){
            attack(attacker,defender);
        }
        else{
            attack(defender,attacker);
        }


    }




}
