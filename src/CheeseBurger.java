public class CheeseBurger extends Burger {

    private boolean cheeseAdded;

    public CheeseBurger(String name, Float price, boolean meetAdded, boolean vegetablesAdded, boolean cheeseAdded) {
        super(name, price, meetAdded, vegetablesAdded);
        this.cheeseAdded = cheeseAdded;
    }

    public boolean isCheeseAdded() {
        return cheeseAdded;
    }

    public void setCheeseAdded(boolean cheeseAdded) {
        this.cheeseAdded = cheeseAdded;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "cheeseAdded=" + cheeseAdded +
                "} " + super.toString();
    }
}
