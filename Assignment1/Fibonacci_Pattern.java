import java.util.*;
public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int star =1;
        int i=0;
        int a=0;
        int b =1;
        int sum=0;
        while(i<n){
            int j=0;
            
            while(j<star){
                System.out.print(a+" ");
                sum = a+b;
                a=b;
                b=sum;
                j++; 
            }
            
            System.out.println();
            i++;
            star++;
            
        }
        
    }
}
