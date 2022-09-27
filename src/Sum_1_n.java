import java.util.Scanner;
public class Sum_1_n {



    public  static  int sum(int n)
    {
        if (n==0)
        {
            return 0;
        }
        else
        {
            return  n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//宣告Scanner物件
        System.out.print("請輸入數字:"); //提示使用者輸入數字
        int num = scanner.nextInt();//定義num接受輸入的數字
        int ret =  sum(num);//呼叫階乘方法
        System.out.println(num+"的總和為"+ret);//輸出返回值

    }
}

