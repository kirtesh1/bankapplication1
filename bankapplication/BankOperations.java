public class BankOperations {
    private int checkBalance;
    private int deposit;
    private int Withdraw;

    public int getCheckBalance() {
        System.out.println("Balance amount = " + checkBalance);
        return checkBalance;
    }
    public void setCheckBalance(int checkBalance) {
        this.checkBalance = checkBalance;
    }
    public int getDeposit() {
        return deposit;
    }
    public void setDeposit(int deposit) {
        this.deposit = deposit;
        checkBalance += this.deposit;
        System.out.println("Deposit amount = " + this.deposit);
    }
    public int getWithdraw() {
        return Withdraw;
    }
    public void setWithdraw(int withdraw) {
        
        if(checkBalance - this.Withdraw < 0){
            System.out.println("You Don't have enough balance, Can't withdraw Money");
        }
        this.Withdraw = withdraw;
        checkBalance -= this.Withdraw;
          System.out.println("After withdraw Balance amount = " + checkBalance);
    }

    
}
