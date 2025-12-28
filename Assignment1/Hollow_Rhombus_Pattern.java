import java.util.*;
public class Hollow_Rhombus_Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int space = n-1;
        int i=0;
        while(i<n){
            int j=0;
            while(j<space){
                System.out.print(" ");
                j++;

            }
            int k=0;
            if(i==0 || i==n-1){
                while(k<n){
                    System.out.print("*");
                    k++;
                }
            }
            else{
                int l =0;
                System.out.print("*");
                while(l<n-2){
                    System.out.print(" ");
                    l++;
                }
                System.out.print("*");
                
            }
            System.out.println();
            space--;
            i++;
        }
    }
}