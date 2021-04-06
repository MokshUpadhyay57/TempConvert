import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        double t,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature(in fahrenheit): ");
        f = sc.nextFloat();
        sc.close();
        t = (float)(f-32)/1.8;
        System.out.print(f + " | " + t);
    }
}
