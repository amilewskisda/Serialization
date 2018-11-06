public class CheeseBurger extends Burger {

    private CheeseKind cheeseKind;

    public CheeseBurger(String name, Float price, boolean meetAdded, boolean vegetablesAdded, CheeseKind cheeseKind) {
        super(name, price, meetAdded, vegetablesAdded);
        this.cheeseKind = cheeseKind;
    }

    public CheeseKind getCheeseKind() {
        return cheeseKind;
    }

    public void setCheeseKind(CheeseKind cheeseKind) {
        this.cheeseKind = cheeseKind;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "cheeseKind=" + cheeseKind +
                "} " + super.toString();
    }
}
