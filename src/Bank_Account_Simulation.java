import java.util.ArrayList;
import java.util.Scanner;

    class Account
    {
        private String accountHolderName;
        private double balance;
        private ArrayList<String> transactionHistory;

        // Constructor
        public Account(String name, double initialBalance)
        {
            this.accountHolderName = name;
            this.balance = initialBalance;
            this.transactionHistory = new ArrayList<>();
            transactionHistory.add("Account created with balance: ₹" + initialBalance);
        }

        // Deposit method
        public void deposit(double amount)
        {
            if (amount > 0)
            {
                balance += amount;
                transactionHistory.add("Deposited: ₹" + amount);
                System.out.println("Successfully deposited ₹" + amount);
            }
            else
            {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw method
        public void withdraw(double amount)
        {
            if (amount > 0 && amount <= balance)
            {
                balance -= amount;
                transactionHistory.add("Withdrawn: ₹" + amount);
                System.out.println("Successfully withdrawn ₹" + amount);
            }
            else
            {
                System.out.println("Invalid withdraw amount or insufficient balance.");
            }
        }

        // Check balance
        public void checkBalance()
        {
            System.out.println("Current balance: ₹" + balance);
        }

        // Show transaction history
        public void showTransactionHistory()
        {
            System.out.println("Transaction History:");
            for (String record : transactionHistory)
            {
                System.out.println(record);
            }
        }
    }

    public class Bank_Account_Simulation
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter account holder name: ");
            String name = scanner.nextLine();
            System.out.print("Enter initial deposit: ₹");
            double initialBalance = scanner.nextDouble();

            Account account = new Account(name, initialBalance);

            int choice;
            do
            {
                System.out.println("\n--- Bank Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        account.showTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using our banking service.");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            }
            while (choice != 5);

            scanner.close();
        }
    }


