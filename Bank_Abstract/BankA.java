public class BankA extends Bank {
    @Override
    protected void getBalance() {
        System.out.println("Bank A has " + depositAmount);
    }
}
