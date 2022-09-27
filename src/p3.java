import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p3 {
    public static String cz(String s) {
        int year = Integer.parseInt(s);
        List<String> czList =  Arrays.asList("rat","ox","tiger","rabbit","dragon","snake","horse","sheep","monkey","rooster","dog","pig");
        int tmp  = year%12-4;
        if (year >=2010)
        {

            String czYear = czList.get(tmp);
            System.out.println(czYear);

        }
        else {
            String czYear = czList.get(-tmp);
            System.out.println(czYear);

        }



        return "1";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//宣告Scanner物件
        System.out.print("請輸入數字:"); //提示使用者輸入數字
        String str  = scanner.nextLine();
        cz(str);

    }
}
