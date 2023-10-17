import java.util.*;
public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting of range : ");
        int a = sc.nextInt();
        System.out.print("Enter the last point of range : ");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println("Even : "+i);
            }
            else{
             System.out.println("odd  : "+i);
        }
    }
    sc.close();
}
}