import java.util.*;
public class VariableSwap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int a = sc.nextInt();
    System.out.print("Enter the second number : ");
    int b = sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("first : "+a);
    System.out.println("second : "+b);
    sc.close();

  }  
}
