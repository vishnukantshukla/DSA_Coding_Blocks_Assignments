import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row=2*n-1;
        int star = n;
        int space=-1;
        int i=0;
        while(i<row){
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
            if(i==0 || i==row-1){
                l=1;
            }

            while(l<star){
                System.out.print("* ");
                l++;
            }
            if(i+1>=n){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            
            i++;
            System.out.println();
        }
    }
}
