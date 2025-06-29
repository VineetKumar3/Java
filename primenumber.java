import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" Enter the number: ");
        int n = scan.nextInt();
        int count = 0;
        if(n<=1){
            System.out.print("The number is not a prime number");
        }else{
            for (int i =2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            } 
         if(count==0){
            System.out.print("The number is Pime");
         }else{System.out.print("The number is not Prime");}   
        }
    }
}
