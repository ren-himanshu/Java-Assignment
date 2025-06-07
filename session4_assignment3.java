enum BankName
{
    ICICI(6.3), HDFC(5.8), SBI(6.0);
    double interestRate;

    private BankName(double interestRate) {
        this.interestRate = interestRate;
    }
}

class BankAccount
{
    String accountHolderName;
    BankName bankName;
    double accountBalance;

    BankAccount(String accountHolderName, BankName bankName, double accountBalance)
    {
        this.accountHolderName= accountHolderName;
        this.bankName= bankName;
        this.accountBalance= accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount [accountHolderName=" + accountHolderName + ", bankName=" + bankName + ", accountBalance="
                + String.format("%.2f",accountBalance) + "]";
    }

    // void getBalance()
    // {
    //     System.out.println("Account Balance: "+String.format("%.2f",accountBalance));
    // }

    void deposit(double d_amount)
    {
        accountBalance+= d_amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double w_amount)
    {
        if(accountBalance<w_amount)
        System.out.println("Insufficient balance.");
        else
        {
            accountBalance-= w_amount;
            System.out.println("Amount withdrawed successfully.");
        }
    }

    void calculateInterest(int numberOfYears)
    {
        double totalinterest= bankName.interestRate*numberOfYears*accountBalance;
        System.out.println("Your interest comes out to be: "+String.format("%.2f", totalinterest));
    }

}

public class session4_assignment3 {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount("Himanshu", BankName.ICICI, 100);
        BankAccount account2= new BankAccount("Ayush", BankName.HDFC, 10000);
        BankAccount account3= new BankAccount("Aditya", BankName.SBI, 5000);
        System.out.println(account1);
        account1.calculateInterest(3);
        System.out.println(account2);
        account2.calculateInterest(3);
        System.out.println(account3);
        account3.calculateInterest(4);
    }
}
