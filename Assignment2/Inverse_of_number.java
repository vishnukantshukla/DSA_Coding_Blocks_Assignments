import java.util.Scanner;

public class Inverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        int sum =0;
        while(num>0){
            int rem = num%10;
            sum = sum + (int)(i*Math.pow(10,rem-1));
            num/=10;
            i++;
        }
        System.out.println(sum);
    }
}
