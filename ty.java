import java.util.Scanner;
public class ty {
    // This program takes a float input from the user and converts it to an integer
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num = scan.nextFloat();
        int num1 = (int) num;
        System.out.println("The number is: " + num1);


    }
}