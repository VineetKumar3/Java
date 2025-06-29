import java.util.Scanner;
public class sumofnaturalnumber {
    public static void main(String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.print("Enter the natural number you wan to print till: ");
    int n = scan.nextInt();
    int sum = 0;
    for(int i=1;i<=n;i++){
        sum = sum+i;
     }
     System.out.print(sum);
    }
}
