import java.util.*;
public class FunctionRectangle {
    static float perimeter(float l,float b){
        float  p = 2*(l+b);
        return p;
     }
     static float area(float l,float b){
        float area = l*b;
        return area;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        float length = sc.nextFloat();
        System.out.print("Enter breadth : ");
        float breadth = sc.nextFloat();
        float perimeter = perimeter(length,breadth);
        System.out.println("Perimeter : "+perimeter);
        float area = area(length,breadth);
        System.out.println("Area : "+area);
        sc.close();

     }
    
}
