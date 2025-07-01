import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number you want to check for palindrome: ");
        int a = scan.nextInt();
        
        int original=a;
        int rev=0;
        while(a>0){
            int lastdigit=a%10;
            rev = rev*10+lastdigit;
            a=a/10;
        }
        System.out.println(rev);
        if(rev==original){
            System.out.println("The  number is Palindrome");
        }else{System.out.println("The number is not Palindrome");
        }
    }
}
