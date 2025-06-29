import java.util.Scanner;
public class whileoneton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want to print till: ");
        int n = scan.nextInt();
        int num = 1;

        while(num<=n){
            System.out.print(num+" ");
            num++;
        }

    }
}
