package spring.assignments ;

public class SCAQ3 {
    private  long accountId;
    private  String  accountHolderName;
    private  String  accountType;
    private double accountBalance;

    public void BankAccount(){}

    public SCAQ3(long accountId, String accountHolderName, String accountType, double accountBalance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
interface BankAccountRepository {
    public double getBalance(long accountId);
    public double updateBalance(long accountId, double newBalance);
}


interface BankAccountService {
    public double withdraw(long accountId, double balance);
    public double deposit(long accountId, double balance);
    public double getBalance(long accountId);
    public boolean fundTransfer(long fromAccount, long toAccount, double amont);
}


class BankAccountServiceImpl implements  BankAccountService {
    @Override
    public double withdraw(long accountId, double balance) {
        return 0;
    }

    @Override
    public double deposit(long accountId, double balance) {
        return 0;
    }

    @Override
    public double getBalance(long accountId) {
        return 0;
    }

    @Override
    public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
        return false;
    }
}
















