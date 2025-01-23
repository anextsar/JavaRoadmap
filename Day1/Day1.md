https://www.programiz.com/online-compiler/9oVjYTfAlEW6e

# Bank System - Java Application

## Overview

This is a simple Java-based Bank System that simulates the basic functionalities of a bank account, including depositing, withdrawing, and checking the balance. It is an interactive program where a user can choose between various options to perform operations on the account. The system starts with an initial balance of 500 units.

The program provides the following features:
1. **Deposit**: Allows the user to deposit a specified amount into their account.
2. **Withdraw**: Allows the user to withdraw a specified amount from their account, ensuring that the withdrawal is less than or equal to the current balance.
3. **Check Balance**: Displays the current balance of the account.
4. **Exit**: Exits the program.

## Features
- **Deposit**: Ensures the deposited amount is positive and adds it to the balance.
- **Withdraw**: Ensures the withdrawal amount is positive and does not exceed the current balance.
- **Check Balance**: Displays the current account balance.
- **Validation**: Handles invalid inputs by printing appropriate messages.

## Requirements

- Java 8 or higher is required to run this program.

## Getting Started

To use the Bank System, follow these steps:

### 1. **Clone or Download the Code**

You can access and run the Java code from the following link:

[Bank System Code - Programiz Online Compiler](https://www.programiz.com/online-compiler/9oVjYTfAlEW6e)

You can run it directly on the Programiz platform or copy it to your local development environment.

### 2. **Run the Program**
   - **Step 1**: Copy and paste the provided code into a Java file (e.g., `Main.java`).
   - **Step 2**: Compile and run the file.
   - **Step 3**: The program will prompt you with options to choose between deposit, withdrawal, balance check, or exit.

### 3. **Interacting with the Program**
   - Choose an option by entering a number from the provided menu.
   - For deposit and withdrawal options, you will be asked to input an amount.
   - You can repeat the operations until you choose to exit.

### Example Usage

```plaintext
Select from the below options:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

### 4. **Exit the Program**
   - When you select "4" to exit, the program will terminate with a thank you message.

## Code Walkthrough

- **Bank Class**: Contains methods for deposit, withdrawal, and checking balance.
    - **deposit(double amount)**: Adds the deposit amount to the balance if it is positive.
    - **withdraw(double amount)**: Deducts the withdrawal amount from the balance if it is positive and doesn't exceed the current balance.
    - **checkBalance()**: Returns the current balance of the bank account.

- **Main Class**: Implements the logic to interact with the user. It uses a switch-case structure to manage user choices and invoke the relevant methods from the `Bank` class.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

If you'd like to contribute to this project, feel free to fork it and make improvements. For any suggestions or improvements, open an issue or create a pull request. 

---

Feel free to test it out, modify, and improve as per your needs!
