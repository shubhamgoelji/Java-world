import java.util.*;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int n = sc.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0)
                System.out.println("The number is leap");
                else
                System.out.println("The number is not a leap");
            }
            else
            System.out.println("The number is leap");
        }
        else
        System.out.println("The number is not a leap year");
        sc.close();
    }
}
