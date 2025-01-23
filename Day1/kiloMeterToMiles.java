import java.util.Scanner;
public class kiloMeterToMiles {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Kilo meter");

        double km =scanner.nextDouble();

        double miles = km * 0.621371;

        System.out.println(km + " Kilometers is equal to " + miles + " Miles");
        scanner.close();
    }
    
}
