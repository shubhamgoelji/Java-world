import java.util.*;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number you want : ");
        int x = sc.nextInt();
        System.out.println((x%2!=0)?"the number is odd":"the number is even");
        sc.close();
    }
}