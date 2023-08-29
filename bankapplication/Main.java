import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Your Bank");
        System.out.print("1.Balance \n2.Deposit \n3.Withdraw \n4.Show Menu\n");
        System.out.println("Enter Your Choice");
        Scanner sc = new Scanner(System.in);
        int choice ;
         int amount;
        BankOperations bankOperations = new BankOperations();
        do {
            choice = sc.nextInt();
            System.out.println("Enter Your Choice");
            switch (choice)
            {
                case 1:
                    System.out.println(bankOperations.getCheckBalance());
                    break;
                case 2:
                    System.out.println("Enter Amount for Deposit");
                    amount = sc.nextInt();
                    bankOperations.setDeposit(amount);
                    System.out.println("Deposit");
                    bankOperations.getCheckBalance();
                    break;
                case 3:
                    System.out.println("Enter Amount for Withdraw");
                    amount = sc.nextInt();
                    bankOperations.setWithdraw(amount);
                    System.out.println("WithDraw");
                    bankOperations.getCheckBalance();
                    System.out.println("Withdraw");
                    break;
                case 4:
                    System.out.println("Show Menu");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    break;
            }
        }while(choice != 5);
        
    } 
}
