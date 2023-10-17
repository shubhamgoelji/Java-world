import java.util.*;
public class SumOfNdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int sum = 0;

        while (n>0){
            int i = n%10;
            n=n/10;
            sum = sum +i;
            
        }
        System.out.println("sum : "+sum);
sc.close();
    }
}
