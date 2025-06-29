import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number you want the Table of:");
    int n = scan.nextInt();
    int num = 1;
    while(num<=10){
        int sum = num*n;
        System.out.println(n + " * " +num+ " = " + sum);
        num++;
      }
    }
}
