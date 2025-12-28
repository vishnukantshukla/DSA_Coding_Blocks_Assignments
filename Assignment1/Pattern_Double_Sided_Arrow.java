import java.util.Scanner;

public class Pattern_Double_Sided_Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int space = n-1;
        int space1 =-1;
        int star =1;
        int i=0;
        int val =1;
        while(i<n){
            int j=0;
            if(i<n/2+1){
                val = i+1;
            }
            else{
                val--;
            }
            
            while(j<space){
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star){
                System.out.print(val+" ");
                val--;
                k++;
            }
            int l=0;
            while(l<space1){
                System.out.print("  ");
                l++;
            }
            int m=0;
            if(i==0 || i==n-1){
                m=1;
            }
            if(val==0){
                val=1;
            }
            
            while(m<star){
                System.out.print(val+" ");
                val++;
                m++;
            }
            i++;
            System.out.println();
            if(i+1>(n/2)+1){
                star--;
                space+=2;
                space1-=2;  
                val--;
                
            }
            else{
                star++;
                space-=2;
                space1+=2;
               
                

                
            }
            
        }
    }
}
