import java.util.Scanner;
public class sumofsquareofnumbers {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = scan.nextInt();

    int sum = 0;
    for(int i=0;i<=n;i++){
        sum = sum+ (i*i);
    }
    System.out.print("number is:"+sum);
    }
}
