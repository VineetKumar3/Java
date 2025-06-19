import java.util.Scanner;
public class areaofsquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the sides of the square: ");
        int side = scan.nextInt();
        double area = side*side;

        System.out.println("The area of the square is:"+ area+"Square units");
    }
}