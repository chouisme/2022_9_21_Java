import java.util.ArrayList;
import java.util.Scanner;

public class p7 {
    public static void strSplit(String n){
        String [] input = n.split(",");
        ArrayList<Integer> inputClean = new ArrayList<>();
        for (int i = 0; i < input.length; i++){
            int tmp = Integer.parseInt(input[i]);
            inputClean.add(tmp);
        }
        System.out.println(inputClean);
        switch (inputClean.get(0)){

            case 186:
                double tmp = 0.09*inputClean.get(1);
                if (tmp / 186 <=1){
                    tmp *= 0.9;
                }
                else {
                    tmp *=0.8;
                }
                tmp = Integer.parseInt(String.valueOf(tmp));
                System.out.println("通話費為:"+tmp);
                break;
            case 386:
                tmp = 0.08*inputClean.get(1);
                if (tmp / 386 <=1){
                    tmp *= 0.8;
                }
                else {
                    tmp *=0.7;
                }
                tmp = Integer.parseInt(String.valueOf(tmp));
                System.out.println("通話費為:"+tmp);
                break;





            case 586:
                tmp = 0.07*inputClean.get(1);
                if (tmp / 586 <=1){
                    tmp *= 0.7;
                }
                else {
                    tmp *=0.6;
                }
                tmp = Integer.parseInt(String.valueOf(tmp));
                System.out.println("通話費為:"+tmp);
                break;


            case 986:
                tmp = 0.06*inputClean.get(1);
                if (tmp / 986 <=1){
                    tmp *= 0.6;
                }
                else {
                    tmp *=0.5;
                }
                tmp = Integer.parseInt(String.valueOf(tmp));
                System.out.println("通話費為:"+tmp);
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一串數字並以逗號分開話費與通話時間:");
        String str = scanner.nextLine();
        strSplit(str);
    }
}
