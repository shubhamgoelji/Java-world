import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n=n/10;
            count = count+1;
        }
        System.out.println("Number of digits : "+count);
        sc.close();
    }
}
