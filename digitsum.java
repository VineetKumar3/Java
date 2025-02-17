import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int sum;
        sum = ( (num / 10) + (num % 10) );
        System.out.println("The sum of the didgit is: " + sum);
        
    }
}
