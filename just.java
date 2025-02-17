import java.util.Scanner;
public class just {
    public static void main(String[] args)
    {
        Scanner my = new Scanner(System.in);

        // String Input
        System.out.print("Enter name: ");
        String name = my.nextLine();

        // Integer Input
        System.out.print("Enter age: ");
        int age = my.nextInt();

        System.out.println("Enter salary: ");
        Double salary = my.nextDouble();

        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
    }

    
}