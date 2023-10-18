import java.util.*;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in fehrenhite : ");
        float f = sc.nextFloat();
        float c = (f-32)*5/9;
        System.out.println("The temperatur in celcius : "+c);
        System.out.print("Now enter the temperature in celcius : ");
        float cel = sc.nextFloat();
        float feh = (cel*9/5)+32;
        System.out.print("The temperature in fehrenhite : "+feh);
        sc.close();
    }
}
