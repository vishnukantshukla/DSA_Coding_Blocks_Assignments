import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int star = 1;
        int i=0;
        int val =1;

        while(i<n){
            int j=0;
            while(j<star){
                System.out.print(val+" ");
                val++;
                j++;
            }
            System.out.println();
            star++;
            i++;

        }
    }
}
