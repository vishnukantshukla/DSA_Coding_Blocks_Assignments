import java.util.*;
public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 = sc.nextInt();
        int res =  GCD(n1,n2);
        System.out.println(res);

    }
    public static int GCD(int n1,int n2){
        while(n1%n2!=0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        return n2;
    }
    
}
