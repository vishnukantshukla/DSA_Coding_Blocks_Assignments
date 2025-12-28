import java.util.Scanner;

public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star =1;
        int space= n-1;
        int i=0;    
        while(i<n){
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
           
            
            if(i>=n/2){
                star-=2;
                space++;
            }
            else{
                star+=2;
                space--;
            }
            i++;
            
        }
    }
}
