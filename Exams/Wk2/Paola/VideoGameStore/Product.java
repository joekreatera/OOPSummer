public class Product {
    private final int id;
    private final String name;

    protected Product(int id, String name) {
    this.id = code;
    this.name = name;
    }

    @Override
    public String toString() {
        return "Item [name:" + name +  ", id:" +id+ "]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
