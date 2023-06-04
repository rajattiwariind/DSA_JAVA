public class BankTestDrive {
    public static void main(String [] args){
        Bank bankA = new BankA();
        bankA.setDepositAmount(1000);
        bankA.getBalance();

        Bank bankB = new BankB();
        bankB.setDepositAmount(2000);
        bankB.getBalance();

        Bank bankC = new BankC();
        bankC.setDepositAmount(3030.44);
        bankC.getBalance();
    }
}
