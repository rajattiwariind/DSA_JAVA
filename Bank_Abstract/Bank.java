public  abstract class Bank {

    protected double depositAmount;

    protected abstract void getBalance();
    protected void setDepositAmount(double amount){
        this.depositAmount=amount;
    }
}
