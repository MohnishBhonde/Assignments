package spring.assignments;

public class BankAccountepositoryImpl implements BankAccountRepository {

    private SCAQ3 bankAccount1;
    private SCAQ3 bankAccount2;

    public void BankAccountepositoryImpl() {
    }

    public BankAccountepositoryImpl(SCAQ3 bankAccount1, SCAQ3 bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
    }

    @Override
    public double getBalance(long accountId) {
        if (this.bankAccount1.getAccountId() == accountId) {
            return bankAccount1.getAccountBalance();
        } else {
            return bankAccount2.getAccountBalance();
        }

    }

    @Override
    public double updateBalance(long accountId, double newBalance) {

        double updatedBal = 0;
        if (this.bankAccount1.getAccountId() == accountId) {
            updatedBal = newBalance;
            bankAccount1.setAccountBalance(updatedBal);
        } else {
            updatedBal = newBalance;
            bankAccount2.setAccountBalance(updatedBal);
        }
        return updatedBal;
    }
}
