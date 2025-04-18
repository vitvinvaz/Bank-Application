# Bank Application

## Project Overview

This is a **console-based Bank Application** built in **Java**. The application allows users to manage bank accounts, including features like adding a new customer, viewing customer details, updating account information, and performing basic banking operations like withdrawing and depositing money. It also allows customers to check their balance and transfer funds between accounts.

---

## Table of Contents

1. [Technologies Used](#technologies-used)
2. [Features](#features)
3. [Classes Overview](#classes-overview)
4. [How to Run](#how-to-run)
5. [License](#license)

---

## Technologies Used

- **Java**: The primary language used to implement the application logic.
- **Collections**: Utilizes `ArrayList` and `HashMap` for storing and managing customer information and account details.
- **Scanner**: Used for capturing user input from the console.

---

## Features

- **Add New Customer**: Allows the user to create a new customer with details such as name and initial deposit.
- **Display Customer Details**: Displays the details of a customer, including their balance and account information.
- **Deposit Funds**: Allows the user to deposit money into a customer's account.
- **Withdraw Funds**: Enables the user to withdraw money from a customer's account.
- **Transfer Funds**: Allows transferring money between two customer accounts.
- **Update Customer Information**: Allows updating customer details, such as changing their name or account information.

---

## Classes Overview

### 1. `Bank.java`
The main class that runs the application, displaying the menu options to the user, taking input, and performing operations based on the user's choice.

### 2. `Customer.java`
This class represents a customer with attributes like `name`, `accountNo`, and `balance`. It includes methods for managing customer data, such as deposit and withdrawal operations.

### 3. `Account.java`
Contains account-related logic and provides methods for transferring funds, checking balances, and other operations related to account management.

---

## How to Run

1. Clone the repository to your local machine:

    ```bash
    git clone <repository-url>
    ```

2. Navigate to the project directory:

    ```bash
    cd BankApplication
    ```

3. Compile the Java files using your IDE or terminal.

4. Run the `Bank.java` class to start the application:

    ```bash
    java Bank
    ```

---

## License

This project is licensed under the MIT License - see the [LICENSE
