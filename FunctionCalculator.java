import java.util.*;
public class FunctionCalculator {
    static float addition(float a,float b){
        float sum = a + b;
        return sum;
    }
    static float subtraction(float a,float b){
        float sub = a - b;
        return sub;
    }
    static float multiplication(float a,float b){
        float mul = a * b;
        return mul;
    }
    static float division(float a,float b){
        float div = a / b;
        return div;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the option for performing your task : ");
        System.out.println("for addition press '+'");
        System.out.println("for subtraction press '-'");
        System.out.println("for multiplication press '*'");
        System.out.println("for division press '/'");
        char n = sc.next().charAt(0);
        System.out.println("Enter the value of a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b : ");
        float b = sc.nextFloat();
        switch(n){
            case '+':{
                float sum = addition(a,b);                
                System.out.println("addition : "+sum);
                break;
            }
            case '-':{
                float sub = subtraction(a,b);
                System.out.println("subtraction : "+sub);
                break;
            }
            case '*':{
                float mul = multiplication(a,b);
                System.out.println("multiplication : "+mul);
                break;
            }
            case '/':{
                float div = division(a,b);
                System.out.println("division : "+div);
                break;
            }
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
        }
}
