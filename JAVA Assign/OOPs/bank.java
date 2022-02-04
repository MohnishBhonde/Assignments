public class bank {
    int Cash;
    int totalCashInBank;
    public int totalCashInBank(){
        return totalCashInBank;
    }
        public int getCash(){
            return Cash;
        }
    }
    class CurrentAccount extends bank{
        @Override
        public int getCash() {
            return super.getCash();
        }
        int totalDeposits=10000;
        int creditLimit=2000;
    }
    class SavingsAccount extends bank{
    int totalDeposits=10000;
    int fixedDeposits=5000;

        @Override
        public int getCash() {
            return super.getCash();
        }
    }

    class outcomeBank {
        public static void main(String[] args) {
            bank takein = new bank();
            CurrentAccount CA=new CurrentAccount();
            SavingsAccount SA=new SavingsAccount();
            takein.Cash = 1000;
            takein.totalCashInBank=CA.totalDeposits + SA.totalDeposits+SA.fixedDeposits-CA.creditLimit;
            System.out.print("Total Cash in Bank after deducing credit limit:"+takein.totalCashInBank+"\n"+"credit limit:"+CA.creditLimit+"\n"+"Total deposit in current account:"+ CA.totalDeposits+"\n"+"Total deposit in savings account:"+SA.totalDeposits);


        }
    }

