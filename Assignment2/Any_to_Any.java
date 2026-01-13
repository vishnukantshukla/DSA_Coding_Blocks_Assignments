import java.util.Scanner;

public class Any_to_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source_num_base_system = sc.nextInt();
        int des_num_base_system = sc.nextInt();
        int num = sc.nextInt();
        if(source_num_base_system !=10 || source_num_base_system!=2){
            int res =  convert_number_helper_fun(num,source_num_base_system,10);
            num= res;
            int final_res = convert_number_helper_fun(num,10,des_num_base_system);
            System.out.println(final_res);
        }
        else{
            int final_res = convert_number_helper_fun(num,source_num_base_system,des_num_base_system);
            System.out.println(final_res);
        }   
        
        
    }
    public static int convert_number_helper_fun(int num,int source , int destination){
        int sum =0;
        int mul =1;
        while(num!=0){
            int rem =  num%destination;
            sum = sum+rem*mul;
            mul*=source;
            num/=destination;
        }
        return sum;
    }
}
