import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Bag o = new Bag();
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez choisir le sac : sac0.txt  sac1.txt  sac2.txt  sac3.txt  sac4.txt");
        String filename = scan.next();
        scan.close();
        ArrayList<Item> listItems = o.initiateValue("Instances/"+filename);
        listItems.sort(new CompareByRating());
        int weightStealerBag = 0;
        int stealedValue = 0;
        for(Item i : listItems){
            if(o.getWeihgtLimit() - i.getWeight() >= 0){
                o.setWeihgtLimit(o.getWeihgtLimit()-i.getWeight());
                weightStealerBag += i.getWeight();
                stealedValue += i.getValue();
                i.setStealed(true);
                System.out.println("L'item n°"+listItems.indexOf(i)+" qui a pour poid: "+i.getWeight() +" ,et pour valeur: "+i.getValue()+" a été volé !");
            }
        }
        System.out.println("Poid du sac du voleur: "+weightStealerBag+", pour une valeur total de : "+stealedValue);
    }

}
