import java.util.Scanner;
public class SwapVariables {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("This program is to swap two numbers");
    int temp;

    System.out.print("Enter number a to swap: ");
    int a = in.nextInt();
    System.out.print("Enter number b to swap: ");
    int b = in.nextInt();

    temp = a;
    a = b;  
    b = temp;

    System.out.print("Swapped numbers are: "+ "a="+ a + " & b="+ b );

        
    }
}
