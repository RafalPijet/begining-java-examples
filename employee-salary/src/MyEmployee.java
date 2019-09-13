interface MyEmployee {
    public double calculateSalary();
}

class BonusSalaryEmployee implements MyEmployee {
    private double salary;
    BonusSalaryEmployee(double salary) {
        this.salary = salary;
    }
    public double calculateSalary() {
        double randomNum =  10*(Math.random());
        if (randomNum > 3) {                    // 70% szansy na premię 20%-tową
            return this.salary * 1.2;
        } else {
            return this.salary;
        }
    }
}

class PieceworkEmployee implements MyEmployee {
    private double quantity;
    PieceworkEmployee(double quantity) {
        this.quantity = quantity;
    }
    public double calculateSalary() {
        return this.quantity * 5;               // 5 PLN stawka akordowa
    }
}

abstract class MySalaryPayout {
    MyEmployee myEmployee;
    MySalaryPayout(MyEmployee myEmployee) {
        this.myEmployee = myEmployee;
    }
    abstract protected void payout();

    public void processPayout() {
        System.out.println("Creating payout for " + this.myEmployee.calculateSalary() + " PLN");
        this.payout();
        System.out.println("The payout is complete.");
    }
}

class MySalaryPayoutProcessor extends MySalaryPayout {
    MySalaryPayoutProcessor(MyEmployee myEmployee) {
        super(myEmployee);
    }
    public void payout() {
        System.out.println("Sending money to employee");
    }
}

class Application8 {
    public static void main(String[] args) {
        BonusSalaryEmployee employee1 = new BonusSalaryEmployee(2000);
        PieceworkEmployee employee2 = new PieceworkEmployee(658);
        MySalaryPayoutProcessor processor1 = new MySalaryPayoutProcessor(employee1);
        MySalaryPayoutProcessor processor2 = new MySalaryPayoutProcessor(employee2);
        processor1.processPayout();
        processor2.processPayout();
    }
}
