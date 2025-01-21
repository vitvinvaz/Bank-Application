import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.println("\n      Welcome to ABC Bank!\n");
        Map<Long,Customer> customers = new HashMap<>();
        Scanner s = new Scanner(System.in);
        long accountno = 10001;

        while(true) {
            System.out.println("1. Create Account \n" + "2. Deposit \n" + "3. Withdraw \n" + "4. Account Balance  \n" + "5. Customer Details\n" + "6. Update Details");
            System.out.print("\nEnter your choice : ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = s.next();
                    System.out.print("Enter your age: ");
                    int age = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter your password: ");
                    String password = s.nextLine();
                    int balance = 0;

                    Customer customer = new Customer(accountno, name, age, password, balance);
                    customers.put(accountno, customer);
                    System.out.println("\nAccount Created Successfully.");
                    System.out.println("Account Number : " + accountno);
                    System.out.println();
                    accountno++;
                    break;
                case 2:
                    System.out.print("Enter Account Number : ");
                    long num = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter your password : ");
                    String pass = s.nextLine();

                    Customer depcustomer = checkingDetails(num, pass, customers);
                    if(depcustomer != null){
                        System.out.println("Enter the Deposit Amount : ");
                        int depoAmount = s.nextInt();
                        depcustomer.accountBalance += depoAmount;
                        System.out.println("\nCash Deposited Successfully.\n");
                    }
                    else{
                        System.out.println("Account Doesn't Exists, please provide correct information.\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account Number : ");
                    long anum = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter your password : ");
                    String pass1 = s.nextLine();

                    Customer withCustomer = checkingDetails(anum, pass1, customers);
                    if(withCustomer != null){
                        System.out.println("Enter the Withdraw Amount : ");
                        int depoAmount = s.nextInt();
                        if (depoAmount <= withCustomer.accountBalance){
                            withCustomer.accountBalance -= depoAmount;
                            System.out.println("Cash Withdraw Successfully.\n");
                        }
                        else{
                            System.out.println("Insufficient money..\n");
                        }
                    }
                    else{
                        System.out.println("Account Doesn't Exists, please provide correct information.\n");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account Number : ");
                    long number = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter your password : ");
                    String pswrd = s.nextLine();
                    Customer customer1 = checkingDetails(number, pswrd, customers);
                    if(customer1 != null){
                        System.out.println("Account Balance : " + customer1.accountBalance +"\n");
                    }
                    else{
                        System.out.println("Account Doesn't Exists, please provide correct information.\n");
                    }
                    break;

                case 5:
                    if(!customers.isEmpty()){
                        for(long c : customers.keySet()) {
                            System.out.println(customers.get(c));
                        }
                        System.out.println();
                    }else {
                        System.out.println("No Customer details availble");
                    }
                    break;
                case 6:
                    updateDetails(customers,s);
                    break;
                default:
                    System.out.println("Please enter the valid input...!\n");
            }
        }
    }
    public static Customer checkingDetails(long num, String password,Map<Long,Customer> customers){
        if(!customers.isEmpty()){
            if(customers.containsKey(num)){
                Customer customer = customers.get(num);
                if(password.equals(customer.accountPassword)) {
                    return customer;
                }
            }
        }
        return null;
    }

    public static void updateDetails(Map<Long,Customer> customers,Scanner s){
        System.out.print("Enter Account Number : ");
        long number = s.nextInt();
        s.nextLine();
        System.out.print("Enter your password: ");
        String password = s.nextLine();
        if (customers.containsKey(number)){
            Customer customer = customers.get(number);
            if(password.equals(customer.accountPassword)){
                System.out.println("Select the option to update");
                System.out.println("1. Name \n" + "2. password \n");
                System.out.println("Select choice : ");
                int choice = s.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Enter the new Name");
                        String name = s.next();
                        customer.name = name;
                        System.out.println("Updated the Name Successfully...\n");
                        break;
                    case 2:
                        System.out.println("Enter the new Password");
                        String pass = s.nextLine();
                        customer.accountPassword = pass;
                        System.out.println("Updated the Password Successfully...\n");
                        break;
                }
            }
        }
        else{
            System.out.println("Account not Available..\n");
        }
    }
}