public class ValidatePinCode {
    public static void main(String[] args){
        String pincodeOne="652314";
        String pincodeTwo="652314";
        if(pincodeOne.length()==6 &&pincodeTwo.length()==6){
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
