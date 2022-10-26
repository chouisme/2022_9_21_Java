import java.util.Scanner;
public class p5 {
    public static int rank(int n )
    {
        int count = 1;
        int tmp = 1;
        while (tmp <n){
            tmp = tmp*count;
            count ++;
        }
        System.out.println("超過M為"+n+"的最小階層N值為"+(count-1));
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入數字:");
        String str = scanner.nextLine();
        int index = Integer.parseInt(str);
        rank(index);

    }


}
