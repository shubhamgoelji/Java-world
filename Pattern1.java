import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern : ");
        int n = sc.nextInt();
        {
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print("S");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}