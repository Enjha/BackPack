import java.util.ArrayList;

public class AlgoClassic {

    private final Bag o;

    public AlgoClassic(Bag o){
        this.o = o;
    }

    public void start(String filename){
        ArrayList<Item> listItems = o.initiateValue("bags/"+filename);
        listItems.sort(new CompareByRating());
        int weightStealerBag = 0;
        int stealedValue = 0;
        for(Item i : listItems){
            if(o.getWeihgtLimit() - i.getWeight() >= 0){
                o.setWeihgtLimit(o.getWeihgtLimit()-i.getWeight());
                weightStealerBag += i.getWeight();
                stealedValue += i.getValue();
                i.setStealed(true);
                System.out.println("L'item n°"+listItems.indexOf(i)+" qui a pour poid: "+i.getWeight()
                        +" ,et pour valeur: "+i.getValue()+" a été volé !");
            }
        }
        System.out.println("Poid du sac du voleur: "+weightStealerBag+", pour une valeur total de : "+stealedValue);
    }
}
