import java.util.ArrayList;

public class AlgoOpti {

    private final ArrayList<Item> listItems;
    private final Bag o;
    private int bestValue;


    public AlgoOpti(String filename, Bag o){
        this.listItems = o.initiateValue("bags/"+filename);
        listItems.sort(new CompareByRating());
        this.bestValue = 0;
        this.o = o;
    }

    public int greedy(){
        int capacity = o.getWeihgtLimit();
        int value = 0;
        int i = 0;
        while(capacity>=listItems.get(i).getWeight()){
            capacity -= listItems.get(i).getWeight();
            value += listItems.get(i).getValue();
            i++;
        }
        return value + ( (listItems.get(i).getValue() * capacity) / listItems.get(i).getWeight() );
    }

    public int findOpti(int capacity, int currentValue, int index){
        if(capacity < 0 || index == listItems.size() - 1) return 0;
        if(bestValue < currentValue){
            bestValue = currentValue;
            return 0;
        }
        int greedy = greedy();
        if(bestValue >= greedy) return 0;
        findOpti(capacity,currentValue,index+1);
        findOpti(capacity-(listItems.get(index).getWeight()),currentValue+(listItems.get(index).getValue()),index+1);
        return bestValue;
    }

}
