import java.util.Scanner;

public class Atm{
    public static void main(String[] args) {
         int balance = 5000, withdraw, deposit;
    Scanner sc = new Scanner(System.in);
 
    while (true)
    {
      System.out.println("ATM (Automated Teller Machine)");
      System.out.println("Choose 1 for Withdraw");
      System.out.println("Choose 2 for Deposit");
      System.out.println("Choose 3 for Check Balance");
      System.out.println("Choose 4 for EXIT");
      System.out.print("Choose the operation you want to perform: ");
 
      //user choice input 
      int choice = sc.nextInt();
      switch (choice)
      {
        case 1:
          System.out.print("Enter the amount to be withdrawn: ");
          withdraw = sc.nextInt();
 
          //balance need to be with the withdrawn amount  
          if (balance >= withdraw)  //for successful transaction 
          {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful! Please collect your money.");
          }
          else //not enough balance
          {
            System.out.println("Insufficient Balance");
          }
 
          System.out.println("");
          break;
 
        case 2:
          System.out.print("Enter amount to be deposited: ");
          deposit = sc.nextInt();
 
          //adding to the total balance 
          balance = balance + deposit;
          System.out.println("Your Money has been successfully depsited:");
          System.out.println("");
          break;
 
        case 3:
          //balance check 
          System.out.println("Available Balance: " + balance);
          System.out.println("");
          break;
 
        case 4:
          //for exit 
          System.out.println("Successfully EXIT.");
          System.exit(0);
            }
            
        }   
    }
}
