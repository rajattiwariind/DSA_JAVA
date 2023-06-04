public class BankC extends Bank{
    @Override
    protected void getBalance() {
        System.out.println("Bank C has " + depositAmount);
    }
}
