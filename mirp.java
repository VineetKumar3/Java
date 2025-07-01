import java.util.Scanner;
public class mirp {
    public static int prime(int n){
        int  counter=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                counter++;
            }  
        }
        if(counter==0){
            System.out.println("The number is  prime");
            }else{System.out.println("The number is not prime");
             }
        return counter;
    }
    public static int revprime(int rev){
        int  counterev=0;
        for(int i=2;i<rev;i++){
            if(rev%i==0){
                counterev++;
            }  
        }
        if(counterev==0){
            System.out.println("The number after reverse is also  prime");
            }else{System.out.println("The number after reverse is not prime");
             }
        return counterev;
    }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("This program checks for the MIRp of the number.");
    System.out.print("Enter the number: ");
    int n = scan.nextInt();
    int primo=prime(n);
    

    int rev=0;
    while(n>0){
        int lastdigit=n%10;
        rev = rev+lastdigit;
        n=n/10;
    }
    int revno=revprime(rev);

  }  
}
