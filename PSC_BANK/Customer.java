public class Customer {
    private String name;
    private String password;
    private String accountNumber;
    private double totalBalance;
    private String role;

    public Customer(String name, String password, String accountNumber, double totalBalance, String role) {
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public String getRole() {
        return role;
    }

    public void setDepositAmount(double amount) {
        totalBalance = totalBalance + amount;
    }

    public void withdrawAmount(double amount) {
        if (amount > totalBalance) {
            System.out.println("Insufficient funds");
        } else {
            totalBalance = totalBalance - amount;
        }
    }

    public void transfer(String accountNumber, double amount) {
        if (amount > totalBalance) {
            System.out.println("Insufficient funds");
        } else {
            totalBalance = totalBalance - amount;
            System.out.println("Amount has been transferred to " +accountNumber);
        }
    }
}
