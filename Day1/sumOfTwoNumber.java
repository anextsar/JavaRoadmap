import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter first Number");
        int num1= scanner.nextInt();

        System.out.println("Enter second Number");
        int num2 = scanner.nextInt();

        int sum= num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        scanner.close();
    }
}