import java.util.Scanner;
public class reverseagian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit+" ");
            n=n/10;
        }
    }
}
