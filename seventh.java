import java.util.Scanner;
public class seventh {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want the multipicaltion of: ");
        int n1 = in.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n1 + " x " + ( i )+ " = " + (n1*i));
        }
    }
}
