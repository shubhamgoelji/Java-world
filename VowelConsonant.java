import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = sc.next().charAt(0);
        if( ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U' )
            System.out.println("The character is vowel");
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("The character is consonant");
            else
            System.out.println("The number is not consonant");
        sc.close();
    }
}
