import java.util.*;
public class Conversion_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min_f = sc.nextInt();
        int max_f = sc.nextInt();
        int step = sc.nextInt();
        while(min_f<=max_f){
            int celsius = (5 *(min_f-32))/9;
            System.out.println(min_f+" "+ celsius);
            min_f += step;

        }

    }
    
}
