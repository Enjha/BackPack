import java.util.Comparator;

public class CompareByRating implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return (o1.getValue()/o1.getWeight()) - (o2.getValue()/o2.getWeight());
    }
}
