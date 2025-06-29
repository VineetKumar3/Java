import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number you want to make the reverse: ");
        int n = scan.nextInt();
        
        while(n > 0){
            int lastdigit = n%10;
            System.out.print( lastdigit+" ");
            n = n/10;
        }
    }
}
