public class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String name, int acno, double bal ) {
        this.accountHolder = name;
        this.accountNumber = acno;
        this.balance = bal;
    }

    void withdrawMoney(float money) {
        if(balance < money) System.out.println("You don't have sufficient balance to withdraw");
        else {
            balance = balance - money;
            System.out.println("Successfully withdraw " + money + "/-");
        }
    }

    void depositeMoney(float money) {
        balance = balance + money;
        System.out.println("Successfully deposite " + money + "/-");
    }

    void displayBalance() {
        System.out.println("The total balance you have is : " + balance + "/-");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Customer", 154785, 10035.00);
        b1.withdrawMoney(100);
        b1.depositeMoney(1000);
        b1.displayBalance();
    }
}

// Successfully withdraw 100.0/-
// Successfully deposite 1000.0/-
// The total balance you have is : 10935.0/-