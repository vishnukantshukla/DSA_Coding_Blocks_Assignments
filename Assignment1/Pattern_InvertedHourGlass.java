import java.util.Scanner;

public class Pattern_InvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int row= 2*n+1;
        int star = 1 ;
        int val =n;
        int space = 2*n-1;
        int i=0;
        while(i<row){
            int j=0;
            val = n;
            while(j<star){
                System.out.print(val+" ");
                val--;
                j++;
            }
            int k=0;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            int l=0;
            val++;
            while(l<star){
                if(i==n && val==0){
                    System.out.print("");
                }
                else{
                    System.out.print(val+" ");
                }
                
                val++;
                l++;
            }
            System.out.println();
            i++;
            if(i>n){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            
        }

    }
}
