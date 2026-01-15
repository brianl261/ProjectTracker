import java.util.Scanner;
public class PowerCalculator {
    private Scanner Amp;
    private int mA;
    private int MaxAmp;
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[91m";
    public static final String GREEN = "\u001B[92m";
    public static final String BLUE = "\\u001b[94m";
    public static final String YELLOW = "\\u001B[93m";
    public PowerCalculator(){
        mA = 0;
        Amp = new Scanner(System.in);
        MaxAmp = 0;
    }

    public void MaxAmp(){
        System.out.println(PowerCalculator.GREEN + "Enter the maximum allowed current draw" + PowerCalculator.RESET);
        MaxAmp = Amp.nextInt();
    }

    public String CurrentDraw(){
        boolean DeviceStackComplete = false;
        int nextDevice = 0;
        int StackedMiliAmps = 0;
        boolean unsafe = false;
        while(DeviceStackComplete == false){
            System.out.println("Please input the current draw of a device being added");
            System.out.println("Type 0 to indicate you have added all devices");
            nextDevice = Amp.nextInt();
            StackedMiliAmps += nextDevice;
            if(nextDevice == 0){
                DeviceStackComplete = true;
            }
        }
        mA = StackedMiliAmps;
        if(StackedMiliAmps > MaxAmp){
            unsafe = true;
        }
        if(unsafe == true){
            return "Current draw is too high, please remove a device";
        }
        return "Current draw falls within limits";
    }

    public int wattUsage(){
        double W = 0;
        double Voltage = 0;
        System.out.println("Enter voltage source voltage (V)");
        Voltage = Amp.nextDouble();
        W = (Voltage * mA);
        return (int) W ;
    }
}


