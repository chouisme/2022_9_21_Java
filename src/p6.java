import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class p6 {
    public static  void strSplit(String n){
       String [] splitList = n.split(" ");
       ArrayList<Integer> maxArray = new ArrayList<>();
       ArrayList<Integer> minArray = new ArrayList<>();

        for (int i  = 0; i <splitList.length; i++) {
            int tmp = Integer.parseInt(splitList[i]);
            maxArray.add(tmp);
            minArray.add(tmp);

       }
        Collections.sort(minArray,Collections.reverseOrder());
        Collections.sort(maxArray);
        int maxIndex = 0;
        int mimIndex = 0;
        int count = 1;
        for (int i = 0; i<maxArray.size(); i++){
            maxIndex=maxIndex+ (count* maxArray.get(i));
            mimIndex = mimIndex+ (count* minArray.get(i));
            count *=10;
        }
        System.out.println(maxIndex);
        System.out.println(mimIndex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一串數字並以空格分開:");
        String str = scanner.nextLine();
        strSplit(str);
    }
}
