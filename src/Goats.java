public class Goats implements Describable {

    private String description;

    public Goats(String name) {
        description = "A goat named "
                + name;
    }

    public String getDescription() {
        return description;
    }
}

