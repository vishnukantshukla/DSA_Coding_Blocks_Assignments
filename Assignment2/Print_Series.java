import java.util.*;
public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i=1;i<=n1;i++){
            int temp = 3*i + 2;
            if(temp%n2!=0){
                System.out.println(temp);
            }
            else{
                n1++;
            }
        }
    }
}
