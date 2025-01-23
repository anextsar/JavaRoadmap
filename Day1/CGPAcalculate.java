import java.util.Scanner;
public class CGPAcalculate {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your name");
        String name=scanner.nextLine();

        System.out.println("Enter first subject mark");
        double mark1=scanner.nextDouble();

        System.out.println("Enter second subject mark");
        double mark2=scanner.nextDouble();

        System.out.println("Enter second subject mark");
        double mark3=scanner.nextDouble();

        double CGPA = (mark1 + mark2  + mark3) / 3;

        System.out.println("CGPA of "+ name+ " is "+ CGPA); 

        scanner.close();
    }
    
}
