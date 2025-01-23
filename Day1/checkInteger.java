import java.util.Scanner;
public class checkInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer oe some non-Integer: ");

        

        if(sc.hasNextInt()){

            int num = sc.nextInt();
            System.out.println("You entered an integer " +  num);
        } else {
            System.out.println("You entered a non-integer ");
        }
        
        sc.close();
    }
    
}
