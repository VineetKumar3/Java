import java.util.Scanner;
public class nthtermofap {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter the n^th number: ");
        int n = scan.nextInt();

        int diff = b-a;

        int nthterm = a+(n-1)*diff;

        System.out.print("The ans is:"+nthterm);
    }
}
