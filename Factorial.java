import java.util.*;
public class Factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number you want the factorial : ");
       int a = sc.nextInt();
       int fact = 1;
       for(int i=a;i>=1;i--){
        fact = fact * i;
       }
       System.out.println("factorial : "+fact);
       sc.close();

    }
}
