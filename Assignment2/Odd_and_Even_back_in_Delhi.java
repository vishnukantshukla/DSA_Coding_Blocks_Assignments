import java.util.*;

public class Odd_and_Even_back_in_Delhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            long car_num = sc.nextLong();
            if (isAllowed(car_num)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isAllowed(long num) {
        long even_sum = 0;
        long odd_sum = 0;
        while (num != 0) {
            long rem = num % 10;
            if (isEven(rem)) {
                even_sum += rem;
            } else {
                odd_sum += rem;
            }
            num /= 10;
        }
        if (even_sum % 4 == 0 || odd_sum % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven(long num) {
        return num % 2 == 0 ? true : false;

    }
}