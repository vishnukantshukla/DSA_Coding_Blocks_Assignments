import java.util.*;
public class Simple_Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = sc.nextInt();
            sum += num;
            if (sum >= 0) {
                System.out.println(num);
            } else {
                break;
            }
        }
    }
}
