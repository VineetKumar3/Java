import java.util.Scanner;
public class rectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = in.nextInt();
        System.out.print("Enter height: ");
        int height = in.nextInt();

        System.out.println("Perimeter: "+ (2*(width+height)));
        System.out.print("Area: "+ (width+height));
    }
}
