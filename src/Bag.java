import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Bag {

    private double weihgtLimit;

    public Bag() {
        this.weihgtLimit = 0;
    }

    public double getWeihgtLimit() {
        return weihgtLimit;
    }

    public void setWeihgtLimit(double weihgtLimit) {
        this.weihgtLimit = weihgtLimit;
    }

    public ArrayList<Item> initiateValue(String filename) {
        BufferedReader br = null;
        ArrayList<Item> listItems = new ArrayList<>();
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(filename));
            this.setWeihgtLimit(Integer.parseInt(br.readLine()));
            while ((sCurrentLine = br.readLine()) != null) {
                listItems.add(new Item(Integer.parseInt(sCurrentLine.split(" ")[0]), Integer.parseInt(sCurrentLine.split(" ")[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        listItems.sort(new CompareByRating());
        return listItems;
    }
}
