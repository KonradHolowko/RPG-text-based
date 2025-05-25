public enum ROOM {
    CORRIDOR("Corridor"),
    ARENA("Arena"),
    SHOP("Shop");

    private final String name;

    ROOM(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
