import java.util.*;

public class Pascal_Traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int i = 0;
        while (i < n) {
            int val = 1;
            int j = 0;
            while (j < star) {
                System.out.print(val + " ");
                val = ((i - j) * val) / (j + 1);
                j++;
            }
            System.out.println();
            i++;
            star++;
        }

    }
}