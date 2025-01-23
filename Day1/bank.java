// Online Java Compiler
import java.util.Scanner;// Use this editor to write, compile and run your Java code online
class Bank{
    double balance=500;
    void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println("current balance is: "+ balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    
    }
    void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance -=amount;
            System.out.println("Remaining balance is  " +balance);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    double checkBalance(){
        return balance;
        
    }
    
    
}
 
class Main {
    public static void main(String[] args) {
        Bank dhiraj =new Bank();
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("Select from the below option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            
            int choice =sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    Double depositAmount = sc.nextDouble();
                    dhiraj.deposit(depositAmount);
                    break;
                    
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    Double withdrawAmount =sc.nextDouble();
                    dhiraj.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is:  ");
                    dhiraj.checkBalance();
                    break;  
                case 4:
                    System.out.println("Thankyou !");
                    return;
                default:
                    System.out.println("Invalid choice .");
            }
        }
    }
}
