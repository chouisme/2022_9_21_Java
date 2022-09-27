import java.util.Scanner;

public class p2 {
        public static String cal(String s)
        {
            float tmp = 0f;
            int count = Integer.parseInt(s);
            if (count <=120)
            {
                tmp = count*2.10f;
                System.out.println("Summer months:"+tmp);
                System.out.println("non Summer months:"+tmp);
            } else if (count >120 && count <=330) {
                tmp =(count-120)*2.10f+(count-120)*3.02f;
                System.out.println("Summer months:"+tmp);
                
                tmp =120*2.10f+(count-120)*2.68f;
                System.out.println("non Summer months:"+tmp);

            } else if (count >330 && count <=500) {
                    tmp = 120*2.10f+109*3.02f+(count-331)*4.39f;

                    System.out.println("Summer months:"+tmp);

                    tmp = 120*2.10f+109*2.68f+(count-331)*3.61f;

                    System.out.println("non Summer months:"+tmp);

            } else if (count >500 && count >=700) {
                tmp = 120*2.10f+109*3.02f+169*4.39f+(count-500)*4.97f;

                System.out.println("Summer months:"+tmp);

                tmp = 120*2.10f+109*2.68f+169*3.61f+(count-500)*4.01f;

                System.out.println("non Summer months:"+tmp);


            }
            else {
                tmp = 120*2.10f+109*3.02f+169*4.39f+199*4.97f+(count-700)*5.63f;

                System.out.println("Summer months:"+tmp);

                tmp = 120*2.10f+109*2.68f+169*3.61f+199*4.01f+(count-700)*4.50f;

                System.out.println("non Summer months:"+tmp);
            }

            return "1";


        }
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);//宣告Scanner物件
            System.out.print("請輸入數字:"); //提示使用者輸入數字
            String str  = scanner.nextLine();
            cal(str);

        }

}
