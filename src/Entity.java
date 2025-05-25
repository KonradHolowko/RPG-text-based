public class Entity {
    private String name;
    private int hp;
    private WEAPONS weapon;

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

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public WEAPONS getWeapon() {
        return this.weapon;
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


}
