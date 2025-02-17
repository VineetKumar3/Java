import java.util.Scanner;
public class compare {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();

        if(n1==n2){
            System.out.print(n1+"="+n2);
        }else{System.out.println(n1+ " != "+ n2);}
    }
}
