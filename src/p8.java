import java.util.List;
import java.util.Scanner;

public class p8 {
//    public  static  void  strSplit( String [] sec){
//
//
//        System.out.println(sec[0]);
//        int count = 0;
//        int add = 0;
//        int tmp = 0;
//        for (int i = 0; i< sec.length; i++){
//
//            for (int j = 0; j < sec.length; j++ ){
//                if (sec[i] == sec[j]){
//                    tmp++;
//                }
//                if (tmp > count){
//                    count = tmp;
//                    tmp = 0;
//                }
//            }
//        }
//        System.out.println("最大出現次數:"+count);
//
//
//
//
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //提示使用者輸入
        System.out.println("即將輸入數字個數n:");
        int total = input.nextInt();
        System.out.println("請輸入數字:");
        int number = input.nextInt();
        int min = number;
        int mincount = 1;

        //比較並記錄結果
        for(int i = 2 ; i <= total ; i++)
        {
            System.out.println("請輸入數字:");
            number = input.nextInt();

            if(number < min)
            {
                min = number;
                mincount = 1;
            }
            else if(number == min)
            {
                min = number;
                mincount = mincount + 1;
            }
        }

        //印出結果
        System.out.println("最小值為:" + min );
        System.out.println("最小值出現次數:" + mincount);
    }
    
}
