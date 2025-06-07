class BankAccount
{
    String accountHolderName;
    String bankName;
    double accountBalance;

    BankAccount(String accountHolderName, String bankName, double accountBalance)
    {
        this.accountHolderName= accountHolderName;
        this.bankName= bankName;
        this.accountBalance= accountBalance;
    }

    void getBalance()
    {
        System.out.println("Account Balance: "+String.format("%.2f",accountBalance));
    }

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
}

public class session4_assignment1
{
    public static void main(String[] args)
    {
        BankAccount account1= new BankAccount("Himanshu", "ICICI", 10000.32);
        BankAccount account2= new BankAccount("Ayush", "HDFC", 900000.24);
        BankAccount account3= new BankAccount("Aditya", "SBI", 500000.77);
        account1.deposit(100.56);
        account1.getBalance();
        account1.withdraw(500.96);
        account1.getBalance();
        account2.deposit(400000.56);
        account2.getBalance();
        account2.withdraw(300000.96);
        account2.getBalance();
        account3.deposit(200000.56);
        account3.getBalance();
        account3.withdraw(50000.96);
        account3.getBalance();
    }
}