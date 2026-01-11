import java.util.Scanner;

public class Count_Digits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int val = sc.nextInt();
        int count=0;
        while(num>0){
            if(num%10==val){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
