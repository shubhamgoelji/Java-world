import java.util.*;
public class WeekOfTheDay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number from 1 to 7 : ");
        int n = sc.nextInt();
        if(n==1){
        System.out.println("sunday");
        }
        if(n==3){
            System.out.println("tuesday");
        }
        if(n==4){
        System.out.println("wednesday");
        }
        if(n==5){
        System.out.println("thursday");
        }
        if(n==6){
        System.out.println("friday");
        }
        if(n==7){
        System.out.println("saturday");
        }
        if(n==1){
        System.out.println("monday");
        }
        sc.close();
        
}
}