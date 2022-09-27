import java.util.Scanner;
public class n_factorial {

    public static  int F(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n*F(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//宣告Scanner物件
        System.out.print("請輸入數字:"); //提示使用者輸入數字
        int num = scanner.nextInt();//定義num接受輸入的數字
        int ret =  F(num);//呼叫階乘方法
        System.out.println(num+"的階乘為"+ret);//輸出返回值

    }
}
