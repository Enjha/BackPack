public class Item {

    private int weight;
    private int value;
    private boolean stealed;

    public Item(int weight, int value, boolean stealed) {
        this.weight = weight;
        this.value = value;
        this.stealed = false;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public void setStealed(boolean stealed) {
        this.stealed = stealed;
    }
}
