package coffeefactory;

import java.util.Random;

public class Coffee {
    private String type;

    public Coffee() {
        String[] types = new String[] { "capuccino", "latte", "americano", "hot chocolate" };

        this.type = types[new Random().nextInt(0, types.length)];
    }

    @Override
    public String toString() {
        return String.format("It's %s", this.type);
    }
}
