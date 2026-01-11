import java.util.*;
public class Sum_of_odd_placed_and_even_placed_digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        int i=1;
        while(num>0){
            if(i%2==0){
                even+=num%10;
            }
            else{
                odd+=num%10;
            }
            num/=10;
            i++;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}