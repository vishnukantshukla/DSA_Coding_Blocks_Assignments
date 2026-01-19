import java.util.*;
public class Boston_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isBoston(num)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
    public static boolean isBoston(int num){
        int prime_factor = prime_factorization_sum_function(num);
        int sum_of_digit = sumDigit(num);
        return prime_factor == sum_of_digit ? true : false;
    }
    public static int prime_factorization_sum_function(int num){
        int sum =0;
        for(int i=2;i<=num;i++){
            while(num%i==0){
                sum += sumDigit(i);
                num/=i;
            }
        }
        return sum;

    }
    public static int sumDigit(int num){
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}