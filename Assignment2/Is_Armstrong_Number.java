import java.util.Scanner;

public class Is_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len = get_length_helper_fun(num);
        if(Is_Armstrong(num,len)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static int get_length_helper_fun(int num){
        int len =0;
        while(num!=0){
            len++;
            num/=10;
        }
        return len;
    }
    public static boolean Is_Armstrong(int num , int len){
        int temp = num;
        int sum=0;
        while(num!=0){
            sum += Math.pow((num%10),len);
            num/=10;

        }
        if(temp == sum){
            return true;
        }
        return false;
    }
}
