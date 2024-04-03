import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        final int MALIAT = 9;

        System.out.println("برای خرید عدد 1 و برای فروش عدد 2 را وارد کنید:");
        Scanner scanner = new Scanner(System.in);
        byte khadamt = scanner.nextByte();

        if (khadamt == 1){
            System.out.println("نرخ طلا را وارد کنید:");
            Scanner scanner1 = new Scanner(System.in);
            int nerkh = scanner1.nextInt();

            System.out.println("وزن خالص طلا را وارد کنید:");
            Scanner scanner2 = new Scanner(System.in);
            float vazn = scanner2.nextFloat();

            System.out.println("اجرت ساخت را وارد کنید:");
            Scanner scanner3 = new Scanner(System.in);
            float ojrat = scanner3.nextFloat();
            ojrat = ojrat / 100;

            System.out.println("سود فروشنده را وارد کنید:");
            Scanner scanner4 = new Scanner(System.in);
            float sood = scanner4.nextFloat();
            sood = sood / 100;

            System.out.println("قیمت طلای محصول:");
            float qimat = vazn * nerkh;
            System.out.println(df.format(qimat));

            System.out.println("اجرت ساخت:");
            float ojrat1 = qimat * ojrat;
            System.out.println(df.format(ojrat1));

            System.out.println("سود فروش طلا:");
            float sood1 = (qimat + ojrat1) * sood;
            System.out.println(df.format(sood1));

            System.out.println("مالیات:");
            float maliat = (sood1 + ojrat1) * MALIAT / 100;
            System.out.println(df.format(maliat));

            System.out.println("قیمت نهایی محصول:");
            float qimat1 = qimat + ojrat1 + sood1 + maliat;
            System.out.println(df.format(qimat1));
        } else if (khadamt == 2) {
            System.out.println("نرخ طلای دست دوم را وارد کنید:");
            Scanner scanner1 = new Scanner(System.in);
            int nerkh = scanner1.nextInt();

            System.out.println("وزن طلا را وارد کنید:");
            Scanner scanner2 = new Scanner(System.in);
            float vazn = scanner2.nextFloat();

            System.out.println("درصد سود طلا فروش را وارد کنید:");
            Scanner scanner3 = new Scanner(System.in);
            float darsad = scanner3.nextFloat();

            System.out.println("قیمت نهایی طلا:");
            float qimat = vazn * nerkh / darsad;
            System.out.println(df.format(qimat));
        } else System.out.println("لطفا عدد را بدستی وارد کنید");
    }
}