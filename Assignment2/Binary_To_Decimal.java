import java.util.*;
public class Binary_To_Decimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mul =1;
        int deci = 0;
        while(num!=0){
            int rem = num%10;
            deci += rem*mul;
            mul*=2;
            num/=10;
        }
        System.out.println(deci);
    }
}
