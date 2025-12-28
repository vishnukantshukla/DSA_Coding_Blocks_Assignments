import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int star =1;
        int space = n/2 +1;
        int i=0;
        int val =1;
        while(i<n){
            int j=0;
            val = i+1;
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
            System.out.println();
            star+=2;
            space--;
            i++;
        }
    }
}
