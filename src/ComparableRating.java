public class ComparableRating implements Comparable<Item>{

    @Override
    public int compareTo(Item o) {
        return o.getValue()/o.getWeight();
    }
}
