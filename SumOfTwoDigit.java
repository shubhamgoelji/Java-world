import java.util.*;
public class SumOfTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number : ");
        float b = sc.nextFloat();
        float c = a+b;
        System.out.print("The sum is : "+c);
        sc.close();
    }
}
