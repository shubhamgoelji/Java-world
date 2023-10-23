import java.util.*;
public class FunctionSimpleInterest {
static double SimpleInterest(float principle,float rate,float time){
    double SimpleInterest = (principle * rate * time)/100;
    return SimpleInterest;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle : ");
        float principle = sc.nextFloat();
        System.out.print("Enter rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter time : ");
        Float time = sc.nextFloat();
        double si = SimpleInterest(principle,rate,time);
        System.out.print("Simple interest : "+si);
        sc.close();
    }
    
}
