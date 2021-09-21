import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bag {

    private int weihgtLimit;
    private ArrayList<Item> contents;

    public Bag() {
        this.contents = new ArrayList<>();
        this.weihgtLimit = 0;
    }

    public int getWeihgtLimit() {
        return weihgtLimit;
    }

    public void setWeihgtLimit(int weihgtLimit) {
        this.weihgtLimit = weihgtLimit;
    }

    public ArrayList<Item> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Item> contents) {
        this.contents = contents;
    }

    public void initiateValue(String filename){
        BufferedReader br = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader(filename));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
