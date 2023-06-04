public class BankB extends Bank{
    @Override
    protected void getBalance() {
        System.out.println("Bank B has " + depositAmount);
    }
}
