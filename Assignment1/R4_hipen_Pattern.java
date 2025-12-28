import java.util.Scanner;

public class R4_hipen_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int star =1;
        int i=0;
        while(i<n){
            int j=0;
            while(j<star){
                System.out.print("*");
                j++;
            }
            System.out.println();
            if(i!=n-1){
                 System.out.println();
            }
           
            star++;
            i++;
        }
    }
}

