import java.util.*;
public class Hollow_Diamond_Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row =  n/2 +1;
        int i=0;
        int star = n/2+1;
        int space =-1;
        while(i<n){
            int j=0;
            while(j<star){
                System.out.print("* ");
                j++;
            }
            int k=0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            int l=0;
            if(i==0 || i==n-1){
                l=1;
            }
            while(l<star){
                    System.out.print("* ");
                
                l++;
            } 
            if(i+1>=row){
                star++;
                space-=2;

            }
            else{
                star--;
                space+=2;
            }
            System.out.println();
            i++;
        }
    }
}