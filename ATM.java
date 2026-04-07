class ATMS {

    private double balance;


    ATMS(double balance) {
        this.balance = balance;
    }

                     
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }


    public double getBalance() {
        return balance;
    }
}

class ATM {
    public static void main(String[] args) {
        ATMS user = new ATMS(5000); // initial balance

        user.deposit(2000);
        user.withdraw(1500);
                         
        System.out.println("Current Balance: " + user.getBalance());
    }
}