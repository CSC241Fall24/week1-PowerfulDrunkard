public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        level = lv;
        if(level >= 16 && level < 32){
            id = 2;
        }
        else if(level >= 32){
            id = 3;
        }
    }

    // getLevel method
    public int getLevel() {
        // TODO: Implement this method
        return level; // Placeholder return value
    }

    // getName method
    public String getName() {
        switch(id){
            case 1: return "Bulbasaur";
            case 2: return "Ivysaur";
            case 3: return "Venusaur";
        }
        return "";
    }

    // getID method
    public int getID() {
        // TODO: Implement this method
        return id; // Placeholder return value
    }

    // toString method
    @Override
    public String toString() {
        // TODO: Implement this method
        // Return a string representation of the Bulbasaur object
        return "Level: " + level + ". ID: " + id; // Placeholder return value
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if(((Bulbasaur)obj).getID() == id &&
        ((Bulbasaur)obj).getLevel() == level){
            return true;
        }
        return false; // Placeholder return value
    }

    // copy method
    public Bulbasaur copy() {
        Bulbasaur clone = new Bulbasaur();
        clone.setLevel(level);
        return clone; // Placeholder return value
    }
}