import java.util.Scanner;
public class sumofnaturalno {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the natural number till you want to print: ");
    int n = scan.nextInt();
    int sum = 0;
    int i = 1;
    while(i<=n){
        sum = sum + i;
        i++; 
    }
    System.out.print(sum);

    }
}
