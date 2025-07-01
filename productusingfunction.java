import java.util.Scanner;
public class productusingfunction {
    public static int product(int a,int b){
        int product = a*b;
        return product;
    }   
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        int prod= product(a,b);
        System.out.print("The product is: "+prod);
        
    }
}
