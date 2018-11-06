import java.io.*;

public class Main {

    // TODO add some generics to serialize and deserialize anything that extends Burger

    private static final String SER_FILE_PATH = "C:/MojFolder/burger.ser";

    public static void main(String[] args) {
        Burger vegeBurger = new Burger("Vege", 14.99F, false, true);
        Burger meetBurger = new Burger("Meet", 18.99F, true, false);
        Burger regularBurger = new Burger("Regular", 15.99F, true, true);

        Burger[] burgerTab = {vegeBurger, meetBurger, regularBurger};

/*        serializeBurger(regularBurger);
        Burger burger = deserializeBurger();

        if (burger != null) {
            System.out.println("Deserialized burger object: " + burger.toString());
        }*/

/*        serializeBurgerTab(burgerTab);
        Burger[] deserializedBurgerTab = deserializeBurgerTab();

        if (deserializedBurgerTab != null) {
            for (Burger b : deserializedBurgerTab) {
                System.out.println(b.toString());
            }
        }*/

        // CheeseBurger nie musi mieć zaimplementowanego serializable !
        CheeseBurger cheeseBurger =  new CheeseBurger("Cheeseburger", 22.49F,true, true, CheeseKind.CHEDDAR);
        serializeObject(cheeseBurger);
        CheeseBurger deserializedCheeseBurger = (CheeseBurger) deserializeObject();
        if (deserializedCheeseBurger != null) {
            System.out.println("Deserialized burger object: " + deserializedCheeseBurger.toString());
        }
    }

    // 1

    private static void serializeBurger(Burger burger) {
        try {
            FileOutputStream fos = new FileOutputStream(SER_FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(burger);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in " + SER_FILE_PATH);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    // Optional here?
    private static Burger deserializeBurger() {
        Burger burger = null;
        try {
            FileInputStream fis = new FileInputStream(SER_FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            burger = (Burger) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Burger class not found");
            c.printStackTrace();
        }
        return burger;
    }

    // 2

    private static void serializeBurgerTab(Burger[] burgerTab) {
        try {
            FileOutputStream fos = new FileOutputStream(SER_FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(burgerTab);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in " + SER_FILE_PATH);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    // Optional here?
    private static Burger[] deserializeBurgerTab() {
        Burger[] burgerTab = null;
        try {
            FileInputStream fis = new FileInputStream(SER_FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            burgerTab = (Burger[]) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Burger tab not found");
            c.printStackTrace();
        }
        return burgerTab;
    }

    // 3

    private static void serializeObject(Object object) {
        try {
            FileOutputStream fos = new FileOutputStream(SER_FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.close();
            fos.close();
            System.out.println("Serialized data is saved in " + SER_FILE_PATH);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    // Optional here?
    private static Object deserializeObject() {
        Object object = null;
        try {
            FileInputStream fis = new FileInputStream(SER_FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            object = ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Object class not found");
            c.printStackTrace();
        }
        return object;
    }
}
