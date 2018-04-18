import java.util.Scanner;
import java.lang.Math;
public class factorial {
public static void main(String[] args) {
    int num;
    int fact=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num = input.nextInt();
    for (int i=2;i<=num; i++){
        fact=fact*i;
    }

    System.out.println("Factorial: "+fact);
}
}
