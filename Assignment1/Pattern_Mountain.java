import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int space = 2*n-3;
        int star =1;
        int val=1;
        int i=0;
        while(i<n){
            int j=0;
            val=1;
            while(j<star){
                System.out.print(val+" ");
                val++;
                j++;
            }
            int k=0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            int l=0;
            if(i==n-1){
                l=1;
                val--;
            }
            val--;
            while(l<star){
                
                System.out.print(val+" ");
                val--;
                l++;
            }
            System.out.println();
            i++;
            star++;
            space-=2;
        }
    }
}
