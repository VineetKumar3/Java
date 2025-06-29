import java.util.Scanner;
public class oddevencheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
    
        if(n%2==0){
            System.out.print("Yes the number is even");
        }else{
            System.out.print("The number is odd");
    
        }
    }
}
