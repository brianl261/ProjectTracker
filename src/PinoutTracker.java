import java.util.Scanner;
public class PinoutTracker {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String GREEN = "\u001B[92m";
    public static final String BLUE = "\u001b[94m";
    public static final String YELLOW = "\u001B[93m";
    public static final String PURPLE = "\u001B[95m";
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
    private String a0 = "";
    private String a1 = "";
    private String a2 = "";
    private String a3 = "";
    private String a4 = "";
    private String a5 = "";
    private String a6 = "";
    private String a7 = "";
    private String rx = "";
    private String tx = "";
    private int MaxMiliAmp = 400;
    private String componentType = "";
    private int currentUsed = 0;
    private Scanner pinSetter;
    private int numberOfPinsUsed = 0;

    public PinoutTracker(){
        pinSetter = new Scanner(System.in);
    }

    public void layoutSetter(){
        System.out.println("Enter \" LED\", or a component module name");
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D2");
        d2 = pinSetter.nextLine();
        if(d2.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d2.equals("")){
            currentUsed += 0;
        }
        if(d2.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D2 to:" + d2);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D3");
        d3 = pinSetter.nextLine();
        if(d3.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d3.equals("")){
            currentUsed += 0;
        }
        if(d3.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D3 to:" + d3);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D4");
        d4 = pinSetter.nextLine();
        if(d4.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d4.equals("")){
            currentUsed += 0;
        }
        if(d4.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D4 to:" + d4);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D5");
        d5 = pinSetter.nextLine();
        if(d5.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d5.equals("")){
            currentUsed += 0;
        }
        if(d5.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D5 to:" + d5);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D6");
        d6 = pinSetter.nextLine();
        if(d6.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d6.equals("")){
            currentUsed += 0;
        }
        if(d6.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D6 to:" + d6);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D7");
        d7 = pinSetter.nextLine();
        if(d7.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d7.equals("")){
            currentUsed += 0;
        }
        if(d7.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D7 to:" + d7);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D8");
        d8 = pinSetter.nextLine();
        if(d8.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d8.equals("")){
            currentUsed += 0;
        }
        if(d8.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D8 to:" + d8);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D9");
        d9 = pinSetter.nextLine();
        if(d9.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d9.equals("")){
            currentUsed += 0;
        }
        if(d9.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D9 to:" + d9);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D10");
        d10 = pinSetter.nextLine();
        System.out.println("Pin D10 to:" + d10);
        if(d10.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d10.equals("")){
            currentUsed += 0;
        }
        if(d10.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D11");
        d11 = pinSetter.nextLine();
        if(d11.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d11.equals("")){
            currentUsed += 0;
        }
        if(d11.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D11 to:" + d11);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D12");
        d12 = pinSetter.nextLine();
        if(d12.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d12.equals("")){
            currentUsed += 0;
        }
        if(d12.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin D12 to:" + d12);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Digital pin D13");
        d13 = pinSetter.nextLine();
        System.out.println("Pin D13 to:" + d13);
        if(d13.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(d13.equals("")){
            currentUsed += 0;
        }
        if(d13.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A0");
        a0 = pinSetter.nextLine();
        if(a0.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a0.equals("")){
            currentUsed += 0;
        }
        if(a0.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A0 to:" + a0);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A1");
        a1 = pinSetter.nextLine();
        if(a1.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a1.equals("")){
            currentUsed += 0;
        }
        if(a1.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A1 to:" + a1);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A2");
        a2 = pinSetter.nextLine();
        if(a2.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a2.equals("")){
            currentUsed += 0;
        }
        if(a2.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A2 to:" + a2);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A3");
        a3 = pinSetter.nextLine();
        if(a3.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a3.equals("")){
            currentUsed += 0;
        }
        if(a3.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A3 to:" + a3);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A4");
        a4 = pinSetter.nextLine();
        if(a4.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a4.equals("")){
            currentUsed += 0;
        }
        if(a4.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A4 to:" + a4);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A5");
        a5 = pinSetter.nextLine();
        if(a5.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a5.equals("")){
            currentUsed += 0;
        }
        if(a5.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A5 to:" + a5);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A6");
        a6 = pinSetter.nextLine();
        if(a6.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a6.equals("")){
            currentUsed += 0;
        }
        if(a6.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A6 to:" + a6);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Analog pin A7");
        a7 = pinSetter.nextLine();
        if(a7.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(a7.equals("")){
            currentUsed += 0;
        }
        if(a7.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin A7 to:" + a7);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Serial pin RX");
        if(rx.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(rx.equals("")){
            currentUsed += 0;
        }
        if(rx.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin RX to:" + rx);
        System.out.println("-----------------------------------------------");
        System.out.println("Assign a module pin to Serial pin TX");
        tx = pinSetter.nextLine();
        if(tx.equals("LED")){
            currentUsed += 20;
            numberOfPinsUsed ++;
        }
        if(tx.equals("")){
            currentUsed += 0;
        }
        if(tx.equals("Motor")){
            System.out.println(PinoutTracker.RED + "Please use a motor control module");
        }
        else{
            currentUsed += 30;
            numberOfPinsUsed ++;
        }
        System.out.println("Pin TX to:" + tx);
        System.out.println("-----------------------------------------------");
    }
    public void currentSafety(){
        if(currentUsed == 0){
            System.out.println("Nothing is connected to this board");
        }
        if(currentUsed <= 400){
            System.out.print(PinoutTracker.GREEN);
            System.out.println("Your setup is using " + currentUsed + "miliamps");
            System.out.print(PinoutTracker.RESET);
        }
        if((currentUsed > 400)&&(currentUsed <= 730)){
            System.out.print(PinoutTracker.YELLOW);
            System.out.println("Your setup is using " + currentUsed + "miliamps");
            System.out.print(PinoutTracker.RESET);
        }
        if(currentUsed > 730){
            System.out.print(PinoutTracker.RED);
            System.out.println("Your setup is using " + currentUsed + "miliamps; Please remove a device");
            System.out.print(PinoutTracker.RESET);
        }
    }
    public void layoutGetter(){
        System.out.println(PinoutTracker.PURPLE + d13 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->D13 {{{}}}{{{}}} D12<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d12);
        System.out.println(PinoutTracker.PURPLE + "3V3" + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->3V3 {{{}}}{{{}}} D11<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d11);
        System.out.println(PinoutTracker.PURPLE + "aref" + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->AREF{{{}}}{{{}}} D10<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d10);
        System.out.println(PinoutTracker.PURPLE + a0 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A0 {{{}}}{{{}}} D9<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d9);
        System.out.println(PinoutTracker.PURPLE + a1 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A1 {{{}}}{{{}}} D8<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d8);
        System.out.println(PinoutTracker.PURPLE + a2 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A2 {{{}}}{{{}}} D7<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d7);
        System.out.println(PinoutTracker.PURPLE + a3 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A3 {{{}}}{{{}}} D6<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d6);
        System.out.println(PinoutTracker.PURPLE + a4 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A4 {{{}}}{{{}}} D5<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d5);
        System.out.println(PinoutTracker.PURPLE + a5 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A5 {{{}}}{{{}}} D4<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d4);
        System.out.println(PinoutTracker.PURPLE + a6 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A6 {{{}}}{{{}}} D3<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d3);
        System.out.println(PinoutTracker.PURPLE + a7 + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->A7 {{{}}}{{{}}} D2<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + d2);
        System.out.println(PinoutTracker.PURPLE + "5V" + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->5V {{{}}}{{{}}} GND<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + "GND");
        System.out.println(PinoutTracker.PURPLE + "RST" + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->RST {{{}}}{{{}}} RST<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + "RST");
        System.out.println(PinoutTracker.PURPLE + "GND" + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->GND {{{}}}{{{}}} RXD<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + rx);
        System.out.println(PinoutTracker.PURPLE + "VIN" + PinoutTracker.YELLOW + "@" + PinoutTracker.BLUE + " ->VIN {{{}}}{{{}}} TXD<- " + PinoutTracker.YELLOW + "@" + PinoutTracker.PURPLE + tx);

    }
    public void ChartLayoutGetter(){
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D2" + d2 );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D3" + d3 );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D4" + d4  );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D5" + d5 );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D6" + d6 );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D7" + d7 );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D8" + d8 );
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D9" + d9);
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D10" + d10);
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D11" + d11);
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D12" + d12);
        System.out.println(PinoutTracker.PURPLE + "Digital Pin D13" +d13 + PinoutTracker.BLUE);
        System.out.println( "Analog Pin A0" +a0);
        System.out.println( "Analog Pin A1" +a1);
        System.out.println( "Analog Pin A2" +a2);
        System.out.println( "Analog Pin A3" +a3);
        System.out.println( "Analog Pin A4" +a4);
        System.out.println( "Analog Pin A5" +a5);
        System.out.println( "Analog Pin A6" +a6);
        System.out.println( "Analog Pin A7" +a7);
        System.out.println(PinoutTracker.RED + "Serial Pin RXD" +rx);
        System.out.println( "Serial Pin TXD" +tx);
    }
    public void AverageCurrentPerComponent(){
        double AvrAmp = currentUsed/numberOfPinsUsed ;
        System.out.println(PinoutTracker.GREEN + "The Average Amperage draw per component in your setup is: " + PinoutTracker.BLUE + AvrAmp + "mA");

    }
}

