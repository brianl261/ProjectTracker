import java.util.Scanner;
public class PowerCalculator {
    Scanner Amp = new Scanner(System.in);
        public int MaxAmp(int MaxAmp){
            System.out.println("Enter the maximum allowed current draw");
            MaxAmp = Amp.nextInt();
            return MaxAmp;
        }
        public int CurrentDraw(){
            boolean DeviceStackComplete = false;
            int nextDevice = 0;
            int StackedAmps = 0;
            while(DeviceStackComplete = false){
                System.out.println("Please input the current draw of a device being added");
                System.out.println("Type 0 to indicate you have added all devices");
                nextDevice = Amp.nextInt();
                StackedAmps += nextDevice;
                if(nextDevice == 0){
                    DeviceStackComplete = true;
                }
            }
            return StackedAmps;
        }
}


