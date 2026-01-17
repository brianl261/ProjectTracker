import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PinoutTracker PT = new PinoutTracker();
        ProductSourceRating PSR = new ProductSourceRating();
        PowerCalculator PowerCalc = new PowerCalculator();
        Scanner line = new Scanner(System.in);

        System.out.println(PinoutTracker.PURPLE + "Select An Option for your project");
        System.out.println();
        System.out.println(PinoutTracker.RED + "(A) Track Ardiuno Pins" + PinoutTracker.RESET);
        System.out.println();
        System.out.println(PinoutTracker.GREEN + "(B) Calculate Amperage and Wattage" + PinoutTracker.RESET);
        System.out.println();
        System.out.println(PinoutTracker.BLUE + "(C) Track What Products you want to and do not want to buy" + PinoutTracker.RESET);
        String option = line.nextLine();
        //The following if-Statements allow the user to select
        //which function to use
        if((option.equals("A"))||(option.equals("a"))){
            System.out.println();
            PT.layoutSetter();
            System.out.println();
            PT.ChartLayoutGetter();
            System.out.println();
            PT.layoutGetter();
            System.out.println();
            PT.currentSafety();
            System.out.println();
            PT.AverageCurrentPerComponent();
        }
        if((option.equals("B"))||(option.equals("b"))){
            PowerCalc.MaxAmp();
            System.out.println();
            PowerCalc.CurrentDraw();
            PowerCalc.SafetyCheck();
            System.out.println();
            PowerCalc.wattUsage();
        }
        if((option.equals("C"))||(option.equals("c"))){
            PSR.AddAvoid();
            PSR.AddgoodProducts();
            System.out.println(PinoutTracker.RED + "Avoid: " + PSR.avoid);
            System.out.println(PinoutTracker.BLUE + "Safe to use: " +PSR.good);
        }



    }
}