public enum WEAPONS {
    Sword(5),
    Bow(3),
    Stick(1);

    private final int damage;

    WEAPONS(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
