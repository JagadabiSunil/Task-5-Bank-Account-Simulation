#  Bank Account Simulation

This is a simple **console-based banking system** built using **Java Object-Oriented Programming (OOP)** principles. It simulates basic bank operations such as **depositing**, **withdrawing**, **checking balance**, and **viewing transaction history**.

---

##  Features

- Create a bank account with an initial deposit
- Deposit money into the account
- Withdraw money from the account
- Check current balance
- View complete transaction history
- Menu-driven console interface

---

## 🛠 Technologies Used

| Technology      | Purpose                                     |
|-----------------|---------------------------------------------|
| Java            | Core programming language                   |
| OOP Concepts    | For class, object, encapsulation            |
| Scanner         | To read input from the user                 |
| ArrayList       | To store dynamic transaction history        |
| Console I/O     | For simple user interaction via menu        |

---

## How It Works(Step by Step)

Step 1: Import Necessary Packages
We import:
Scanner for user input,
ArrayList to store the transaction history.

import java.util.ArrayList;
import java.util.Scanner;

 Step 2: Create Account Class
We define a class called Account to represent a bank account.

Data Members:
* accountHolderName: stores the name of the account holder.
* balance: stores the current balance.
* transactionHistory: an ArrayList<String> to record all transactions.

 
 Step 3: Constructor
* The constructor takes name and initialBalance as parameters.
* It initializes the account with these values.
* It also logs the account creation in transactionHistory.

public Account(String name, double initialBalance)

 
Step 4: deposit() Method

* This method:Accepts a deposit amount.
* Adds it to the balance.
* Logs the deposit in the transaction history.
* Shows a success message.

 Step 5: withdraw() Method
This method:
* Accepts a withdrawal amount.
* Checks if the amount is positive and does not exceed the balance.
* Deducts the amount if valid.
* Logs the withdrawal.
* Shows appropriate success or error message.

 Step 6: checkBalance() Method
* Displays the current balance using System.out.println.

 Step 7: showTransactionHistory() Method
* Iterates through the transactionHistory list.
* Prints all previous deposit and withdrawal logs, including account creation.

 Step 8: Create BankApp Class with main() Method
This is where the program starts.
* We use a Scanner to take user input.
  
We ask the user for:
**Their name.**
**An initial deposit amount.**
* We create an Account object using this information.

Step 9: Menu-Driven Loop
We use a do-while loop to show the following menu repeatedly:

1. Deposit
2. Withdraw
3. Check Balance
4. Transaction History
5. Exit
The user selects an option by entering a number.

* Based on the choice, we call the appropriate method of the Account object.
* The loop continues until the user selects option 5 (Exit).

 Step 10: End of Program
Once the user exits, we:
* Close the Scanner object to prevent memory leaks.
* Display a goodbye message.

