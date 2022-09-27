import java.util.Scanner;
public class list_split {
    public static String reverseWords(String s) {
        String [] split = s.split(" ");
        String tmp = "" ;
        int count =split.length;
        for (int i=0; i<count; i++)
        {
            StringBuilder strb = new StringBuilder(split[i]);
            String index = strb.reverse().toString();
            tmp+=index+" ";
        }
        tmp.trim();
        System.out.println(tmp);
        return tmp.trim();
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//宣告Scanner物件
        System.out.print("請輸入數字:"); //提示使用者輸入數字
        String str  = scanner.nextLine();
        reverseWords(str);
    }
}
