import java.util.*;
public class Check_prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag =  true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
            
        }
    }
}
