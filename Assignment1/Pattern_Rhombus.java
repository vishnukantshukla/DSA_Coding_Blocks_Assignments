import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =  (n/2)+1;
        int space = n-1;
        int star=1;
        int i=0;
        int val =1;
        int temp = 1;
        while(i<n+row){
            val = temp;
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                System.out.print(val+" ");
                if(k>=star/2){
                    val--;
                }
                else{
                    val++;
                }
                
                k++;
            }
            if(i+1>=n){
                temp--;
                star-=2;
                space++;
            }
            else{
                temp++;
                star+=2;
                space--;
            }
            
            System.out.println();
            i++;
        }
    }
}

