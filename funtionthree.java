import java.util.Scanner;
public class funtionthree {
    public static int sum(int a, int b){
        int sum = a*b;
        System.out.print("The sum is: "+ sum);
        return sum;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a = scan.nextInt();
        System.out.print("Enter the number b: ");
        int b = scan.nextInt();
        sum(a,b);
    }
}
