import java.util.*;
public class Pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern : ");
        int n = sc.nextInt();
        {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if( j==1 || j==i || i==n){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                
                }
                System.out.println();
            }
        }
        sc.close();  
    }
  
}