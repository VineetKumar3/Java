import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter 3 numbers to get the average: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        System.out.print("Avreage = "+((a+b+c)/3));


    }
}
