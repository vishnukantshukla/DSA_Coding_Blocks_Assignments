import java.util.*;
public class LCM {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd_number = gcd(a,b);
        // System.out.println(gcd_number);
        int mul = a*b;
        int lcm = mul/gcd_number;
        System.out.println(lcm);


    }
    public static int gcd(int divident , int divisior){
        while(divident%divisior!=0){
            int rem = divident%divisior;
            divident= divisior;
            divisior = rem;
        }
        return divisior;

    }
}