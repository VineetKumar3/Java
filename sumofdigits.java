import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        
        int sum = 0;
        while(n>0){
            int lastdigit= n%10;
            sum = sum+lastdigit;

            n = n/10;
        }
        System.out.print("The sum of digit is: "+sum);

    }
}
