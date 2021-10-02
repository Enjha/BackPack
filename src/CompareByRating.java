import java.util.Comparator;

public class CompareByRating implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        int test1 = o1.getValue()/o1.getWeight();
        int test2 = o2.getValue()/o2.getWeight();
        return test1-test2;
    }
}
