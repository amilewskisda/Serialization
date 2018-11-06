public class CheeseBurger extends Burger {

    private Cheese cheese;

    public CheeseBurger(String name, Float price, boolean meetAdded, boolean vegetablesAdded, Cheese cheese) {
        super(name, price, meetAdded, vegetablesAdded);
        this.cheese = cheese;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "cheeseKind=" + cheese +
                "} " + super.toString();
    }
}
