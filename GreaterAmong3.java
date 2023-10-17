import java.util.*;
public class GreaterAmong3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the First number : ");
    int a = sc.nextInt();
    System.out.print("Enter your second number : ");
    int b = sc.nextInt();
    System.out.print("Enter the third number : ");
    int c = sc.nextInt();
    System.out.println((a>b&&a>c)?"First number is the bigger one":(b>c)?"Second number is bigger one":"third number is the bigger one");
    sc.close();
    }
}
