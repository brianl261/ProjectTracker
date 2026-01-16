import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ProductSourceRating {
    List<String> good = new ArrayList<>();
    List<String> avoid = new ArrayList<>();
    Scanner next = new Scanner(System.in);

    public ProductSourceRating(){

    }
    public String AddAvoid(){
        System.out.println("input a product name");
        avoid.add(next.nextLine());
        System.out.println(avoid);
    }
    public String AddgoodProducts(){
        System.out.println("input a product name");
        good.add(next.nextLine());
        System.out.println(avoid);
    }
}
