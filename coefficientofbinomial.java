import java.util.Scanner;
public class coefficientofbinomial {
    public static int fact(int n){
        int sum =1;
        for(int i=1;i<=n;i++){
            sum= sum*i;
        }
       return sum; 
    }

    public static int bce(int n , int r){
        int nfac = fact(n);
        int mfac = fact(r);
        int nmr = fact(n-r);

        int binocoefficient = nfac/(mfac*nmr);

        return binocoefficient;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scan.nextInt();
        int binomial = bce(n, r);
        System.out.print("The Binomial coefficient is: "+binomial);
    }
}
