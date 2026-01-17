import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProductSourceRating {
    List<String> good = new ArrayList<>();
    List<String> avoid = new ArrayList<>();
    Scanner next = new Scanner(System.in);
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String GREEN = "\u001B[92m";
    public static final String BLUE = "\u001b[94m";
    public static final String YELLOW = "\u001B[93m";
    public static final String PURPLE = "\u001B[95m";
    //Constructor
    public ProductSourceRating() {
    }
    //Adds products to avoid list
    public void AddAvoid() {
        while (true) {
            System.out.println("Input a product name to avoid or type 'stop' to finish");
            String input = next.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            avoid.add(input);
            System.out.println(ProductSourceRating.RED + "Avoid list: " + avoid + ProductSourceRating.RESET);
        }
    }
    //Add products to good list
    public void AddgoodProducts() {
        while (true) {
            System.out.println("Input a good product name or type 'stop' to finish");
            String input = next.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            good.add(input);
            System.out.println(ProductSourceRating.BLUE +"Good list: " + good + ProductSourceRating.RESET);
        }
    }


}
