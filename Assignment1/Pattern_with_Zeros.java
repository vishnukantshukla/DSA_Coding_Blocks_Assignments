import java.util.*;
public class Pattern_with_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int star =1;
        int i=0;
        while(i<n){
            int j=0;
            while(j<star){
                if(j==0 || j==star-1){
                    System.out.print(i+1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
                j++;
            }
            System.out.println();
            i++;
            star++;
        }

    }
}
