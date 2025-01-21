public class Customer {

    String name;
    int age;
    long accountNo;
    String accountPassword;
    int accountBalance;

    public Customer(long accountNo, String name, int age, String accountPassword, int accountBalance) {
        this.name = name;
        this.age = age;
        this.accountPassword = accountPassword;
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", accountNo=" + accountNo +
                ", accountPassword='" + accountPassword + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
