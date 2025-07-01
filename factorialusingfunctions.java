import java.util.Scanner;
public class factorialusingfunctions {
    public static int fact(int n){
        int sum=1;
        for(int i =1;i<=n;i++){
            sum=sum*i;
        }
     return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want the factorial of: ");
        int n = scan.nextInt();
        int factorail=fact(n);
        System.out.print("The factorial of the number isL "+ factorail);

    }
}
