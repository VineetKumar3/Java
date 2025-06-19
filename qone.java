import java.util.Scanner;
public class qone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number:");
        int a = scan.nextInt();
        System.out.print("Enter the second number:");
        int b = scan.nextInt();

        float sum = (a+b)/2;
        System.out.println("The average of the two numbers is: "+sum);

    }
}
