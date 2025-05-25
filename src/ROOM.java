public enum ROOM {
    CORRIDOR("Corridor"),
    ARENA("Arena");

    private final String name;

    ROOM(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
