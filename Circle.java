import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = in.nextDouble();

        double perimetre = (2*3.14*radius);
        double area =  (3.14*(radius*2));

        System.out.println("Perimetere: "+perimetre);
        System.out.print("Area: "+area);
    }
}
