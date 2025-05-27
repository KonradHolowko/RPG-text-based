import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class Entity {
    private String name;
    private int hp;
    private WEAPONS weapon;
    private List<ROOM> location = new ArrayList<>();
    private Random random = new Random();


    public Entity(String name, int hp, WEAPONS weapon) {
        setName(name);
        setHp(hp);
        setWeapon(weapon);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setWeapon(WEAPONS weapon) {
        this.weapon = weapon;
    }

    public void setLocation(ROOM room, Entity entity) {
        this.location.add(room);

        if(room.equals(ROOM.CORRIDOR) && randomBoolean()){
            Combat.trap(entity);
        }

    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public WEAPONS getWeapon() {
        return this.weapon;
    }

    public void getLocation() {

        for(int i = 0; i < this.location.size(); i++){
            System.out.print(this.location.get(i) + " -> ");
        }



    }

    public void getInfo() {
        System.out.print("\nName: " + this.name + " HP: " + this.hp + " Weapon: " + this.weapon);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;

        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public boolean randomBoolean(){
        return random.nextBoolean();
    }


}
