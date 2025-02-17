import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of: ");
        int num = scan.nextInt();

        float sum = 1;
        for(int i = 1; i<=num ;i++){
            sum = sum*i;
        }
        System.out.println("The factorial is: "+ sum);

    }
}
