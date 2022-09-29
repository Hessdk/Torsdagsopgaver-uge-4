import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    private ArrayList<String> coffeeMenu;

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }



    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("src//coffees.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {  // A WHile loop to put in the data from the file
                String line = scanner.nextLine();
                coffeeMenu.add(line); // Adds data as long as the file has a next line
            }
        } catch (FileNotFoundException e) { // Cathces it if no line found
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return String.format("cofeeMenu = {  %s }", coffeeMenu);
    }
}
