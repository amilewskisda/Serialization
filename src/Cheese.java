// it will show NotSerializableException: Cheese
public class Cheese {
    private String colour;
    private CheeseKind cheeseKind;

    public Cheese(String colour, CheeseKind cheeseKind) {
        this.colour = colour;
        this.cheeseKind = cheeseKind;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public CheeseKind getCheeseKind() {
        return cheeseKind;
    }

    public void setCheeseKind(CheeseKind cheeseKind) {
        this.cheeseKind = cheeseKind;
    }
}
