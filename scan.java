import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);

        // String Input
        System.out.print("Enter your name: ");
        String name = my.nextLine();

        // Integer Input
        System.out.print("Enter your age: ");
        int age = my.nextInt();

        // Clearing the buffer
        my.nextLine(); // Consume the leftover newline

        // Double Input
        System.out.print("Enter your salary: ");
        double salary = my.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
