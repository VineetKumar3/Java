import java.util.Scanner;
public class sumofno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        int sum = 0;
        for(int i = 0; i<=num; i++ ){
            sum = sum+i;
        }
        System.out.println("The sum is: "+ sum);
    }
}
