import java.io.Serializable;

public class Klasa implements Serializable {
    private boolean pole;

    public Klasa(boolean pole) {
        this.pole = pole;
    }

    public boolean isPole() {
        return pole;
    }

    public void setPole(boolean pole) {
        this.pole = pole;
    }
}
