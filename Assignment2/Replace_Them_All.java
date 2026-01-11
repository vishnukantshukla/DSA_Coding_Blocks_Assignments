import java.util.*;
public class Replace_Them_All {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // when we try to give input in the form of interger then it will not handle the leading zeros edge case.
        // long num = sc.nextLong();
        // long res = replace_helper_fun(num);
        // System.out.println(res);


        String str = sc.nextLine();
        String res = replace_helper_fun(str);
        System.out.println(res);
        

    }
    // public static long replace_helper_fun(long num){
    //     long sum =0;
    //     long mul =1;
    //     while(num!=0){
    //         long rem = num%10;
    //         if(rem==0){
    //             sum = sum + 5*mul;
    //         }
    //         else{
    //             sum = sum + rem*mul;
    //         }
    //         num/=10;
    //         mul*=10;
    //     }
    //     return sum;
    // }
    public static String replace_helper_fun(String st){
        String str = st.replace('0','5');
        return str;
    }
}
