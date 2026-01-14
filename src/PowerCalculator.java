import java.util.Scanner;
public class PowerCalculator {
    Scanner Amp = new Scanner(System.in);
    private int MaxAmp;
        public void MaxAmp(){
            System.out.println("Enter the maximum allowed current draw");
            MaxAmp = Amp.nextInt();
        }
        public String CurrentDraw(){
            boolean DeviceStackComplete = false;
            int nextDevice = 0;
            int StackedAmps = 0;
            boolean unsafe = false;
            while(DeviceStackComplete = false){
                System.out.println("Please input the current draw of a device being added");
                System.out.println("Type 0 to indicate you have added all devices");
                nextDevice = Amp.nextInt();
                StackedAmps += nextDevice;
                if(nextDevice == 0){
                    DeviceStackComplete = true;
                }
            }
            if(StackedAmps > MaxAmp){
                unsafe = true;
            }
            if(unsafe == true){
                return "Current draw is too high, please remove a device";
            }
            return "Current draw falls within limits";
        }
}


