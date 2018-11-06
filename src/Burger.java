import java.io.Serializable;

public class Burger implements Serializable {

    private String name;
    private Float price;
    private boolean meetAdded;
    private boolean vegetablesAdded;

    public Burger(String name, Float price, boolean meetAdded, boolean vegetablesAdded) {
        this.name = name;
        this.price = price;
        this.meetAdded = meetAdded;
        this.vegetablesAdded = vegetablesAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public boolean isMeetAdded() {
        return meetAdded;
    }

    public void setMeetAdded(boolean meetAdded) {
        this.meetAdded = meetAdded;
    }

    public boolean isVegetablesAdded() {
        return vegetablesAdded;
    }

    public void setVegetablesAdded(boolean vegetablesAdded) {
        this.vegetablesAdded = vegetablesAdded;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", meetAdded=" + meetAdded +
                ", vegetablesAdded=" + vegetablesAdded +
                '}';
    }
}
