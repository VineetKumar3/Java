import java.util.Scanner;
public class swapping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a= scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.print("a= "+a+" b= "+b);

    }
}
