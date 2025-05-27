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


        while(attacker.getHp() >= 0 || defender.getHp() >= 0){

            if(attacker.getHp() == 0){
                System.out.println("The player is dead");
                break;
            }
            if(defender.getHp() == 0){
                System.out.println("The enemy is dead");
                break;
            }

            if((Math.random()*6) + 1 > 3){
                attack(attacker,defender);
            }
            else{
                attack(defender,attacker);
            }
        }
    }

    public static void trap(Entity entity){
        entity.setHp(entity.getHp() - 10);
        System.out.println("\n" + entity.getName() + " has fallen into trap!\n Health reduced by 10hp");
    }




}
