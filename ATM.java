import java.util.Scanner;


    class BankAcc {
        private double balance;

        public BankAcc(double initialBal) {
            this.balance = initialBal;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        }

        public boolean withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds. Withdrawal failed.");
                return false;
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
                System.out.println("Current Balance: " + balance);
                return true;
            }
        }
    }

    public class ATM {
        private BankAcc account;
        private Scanner scanner;
        String name;

        public ATM(BankAcc account) {
            this.account = account;
            scanner = new Scanner(System.in);
        }

        public void displayMenu() {

                System.out.println("Welcome to the CANARA BANK ATM!");
            System.out.println("Enter your name:");
             name=scanner.nextLine();
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
        }

        public void process(int option) {
            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you "+name+" for using the CANARA BANK ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        public void checkBalance() {
            System.out.println("Your balance is: " + account.getBalance());
        }

        public void deposit() {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        }

        public void withdraw() {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            if (account.withdraw(amount)) {
                System.out.println("Please take your cash.");
            }
        }

        public static void main(String[] args) {
            BankAcc userAccount = new BankAcc(500);
            ATM atm = new ATM(userAccount);
            Scanner scanner = new Scanner(System.in);

            while (true) {
                atm.displayMenu();
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                atm.process(choice);
            }
        }
    
    }

