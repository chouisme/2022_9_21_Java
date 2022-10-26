import java.util.Scanner;

public class p9 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("S1:");
        String str = scanner.nextLine();
        System.out.print("S2:");
        String str2 = scanner.nextLine();
        boolean containsStr = str.contains(str2);
        System.out.println(containsStr);

    }
}
