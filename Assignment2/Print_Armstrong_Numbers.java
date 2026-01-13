import java.util.Scanner;

public class Print_Armstrong_Numbers {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n1= sc.nextInt();
       int n2 = sc.nextInt();
       for(int i=n1;i<=n2;i++){
           if(isArmstrong(i)){
               System.out.println(i);
           }
       }
    }
    public static boolean isArmstrong(int num ){
        int len = len_helper(num);
        int sam = num;
        int sum =0;
        while(num!=0){
            int temp = num%10;
            sum+= Math.pow(temp,len);
            num/=10;
        }
        if(sam == sum){
            return true;
        }
        return false;

    }
    public static int len_helper(int num){
        int len =0;
        while(num!=0){
            len++;
            num/=10;

        }
        return len;
    }
}
