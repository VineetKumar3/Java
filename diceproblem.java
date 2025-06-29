import java.util.Scanner;
public class diceproblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of the dice within 1 to 6: ");
        int n = scan.nextInt();

        if(n>0 && n<6 && n<0){
        int opposite = 7-n;
        System.out.print("The opposite of "+n+" is: "+opposite);

        }else{
            System.out.print("The number is invalid please give number within 1 to 6");
        }
    }
}
