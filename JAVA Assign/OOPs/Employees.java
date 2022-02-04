public class Employees {
     int Salary;
    int incentive;
    int overtime;
    public int getSalary(){
        return Salary;
    }
    public int getIncentive(){
        return incentive;

    }
    public int getovertime(){
        return overtime;
    }

}
class Labour extends Employees{
    @Override
    public int getovertime() {
        return super.getovertime();
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

}
class Manager extends Employees{
    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public int getIncentive() {
        return super.getIncentive();
    }

        }
        class result {
            public static void main(String[] args) {
                Employees takein = new Employees();
                takein.Salary = 10000;
                takein.overtime = 500;
                takein.incentive = 5000;
                System.out.println("Salary for Manager and Labour:" + takein.getSalary());
                System.out.println("Incentive:" + takein.getIncentive());
                System.out.println("over time" +
                        ":" + takein.getovertime());
            }
        }
