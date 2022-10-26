import java.util.Scanner;
import java.math.*;
public class p4 {
    public static void XY(String x,String y){
        int xPos =Integer.parseInt(x);
        int yPos =Integer.parseInt(y);
        double distance = Math.pow(xPos,2)+Math.pow(yPos,2);
        if (xPos == 0 && yPos == 0){
            System.out.println("位於原點");
        } else if (xPos > 0 && yPos >0 ) {
            System.out.println("該點位於第一象限上，與原點的距離為"+distance);
        } else if (xPos <0 && yPos >0) {
            System.out.println("該點位於第二象限上，與原點的距離為"+distance);
        }
        else if (xPos <0 && yPos <0) {
            System.out.println("該點位於第三象限上，與原點的距離為"+distance);
        }
        else if (xPos >0 && yPos <0) {
            System.out.println("該點位於第四象限上，與原點的距離為"+distance);
        } else if (xPos ==0 && yPos !=0 ) {
            if (yPos >0)
            {
                System.out.println("該點位於上半平面，與原點距離為"+yPos);
            }
            else
            {
                System.out.println("該點位於下半平面，與原點距離為"+Math.abs(yPos));
            }
        } else if (xPos != 0 && yPos == 0) {
            if (xPos > 0) {
                System.out.println("該點位於右半平面，與原點距離為"+xPos);
            }
            else {
                System.out.println("該點位於左半平面，與原點距離為"+Math.abs(xPos));
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入X:");
        String xPos = scanner.nextLine();
        System.out.print("請輸入Y:");
        String yPos = scanner.nextLine();
        XY(xPos,yPos);
        
    }
}
