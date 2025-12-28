import java.util.Scanner;

public class Pattern_HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =  2*n +1;
        int star  = 2*n+1;
        int space = 0;
        int i=0;
        int val =n;
        int temp=1;
        int prev_1=0;
        int prev_2=0;
        while(i<row){
            int k=0;
            prev_1=val;
            // prev_2 = temp;
            while(k<space){
                System.out.print("  ");
                k++;
            }
            int j=0;
            while(j<star){
                
                if(val<0){
                    System.out.print(temp+" ");
                    temp++;
                    
                }

                else{
                    System.out.print(val+" ");
                    val--;
                }
                j++;
            }
            System.out.println();
            
            if(i>=n){
                val = prev_1+1;
                temp= 1;
                star+=2;
                space--;
            }
            else{
                val = prev_1-1;
                temp= 1;
                star-=2;
                space++;
            }
            i++;
        }
    }
}
