import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez choisir le sac : sac0.txt  sac1.txt  sac2.txt  sac3.txt  sac4.txt");
        String filename = scan.next();
        scan.close();
        final Bag o = new Bag();
        o.initiateValue("bags/"+filename);
        System.out.println("La valeur totale des objets volés est de: "+ new AlgoOpti(filename, o).findOpti(o.getWeihgtLimit(),0,0));

        /* // ALGO CLASSIQUE
        new AlgoClassic().start(filename);
         */
    }

}
