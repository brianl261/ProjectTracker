import java.util.Scanner;
public class PinoutTracker {
    private String d1 = "";
    private String d2 = "";
    private String d3 = "";
    private String d4 = "";
    private String d5 = "";
    private String d6 = "";
    private String d7 = "";
    private String d8 = "";
    private String d9 = "";
    private String d10 = "";
    private String d11 = "";
    private String d12 = "";
    private String d13 = "";
    private String d14 = "";
    private String a1 = "";
    private String a2 = "";
    private String a3 = "";
    private String a4 = "";
    private String a5 = "";
    private String a6 = "";
    private String a7 = "";
    private String a8 = "";
    Scanner pinSetter = new Scanner(System.in);
    public void layoutSetter(){
        System.out.println("Assign a module pin to Digital pin D1");
        d1 = pinSetter.nextLine();
        System.out.println("Pin D1 to:" + d1);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D2");
        d2 = pinSetter.nextLine();
        System.out.println("Pin D2 to:" + d2);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D3");
        d3 = pinSetter.nextLine();
        System.out.println("Pin D3 to:" + d3);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D4");
        d4 = pinSetter.nextLine();
        System.out.println("Pin D4 to:" + d4);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D5");
        d5 = pinSetter.nextLine();
        System.out.println("Pin D5 to:" + d5);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D6");
        d6 = pinSetter.nextLine();
        System.out.println("Pin D6 to:" + d6);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D7");
        d7 = pinSetter.nextLine();
        System.out.println("Pin D7 to:" + d7);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D8");
        d8 = pinSetter.nextLine();
        System.out.println("Pin D8 to:" + d8);
        System.out.println("-----------------------------------------------");
    }
    public void layoutGetter(){

    }
}
