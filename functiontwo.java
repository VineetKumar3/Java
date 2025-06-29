import java.util.Scanner;
public class functiontwo{
    public static int sum(int a,int b){
    int sum = a+b;
    System.out.println("The sum is: "+sum);
    return sum;
    }
    
    public static void main(String []args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        sum(a,b);
    }
}