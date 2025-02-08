public class Main {
	public static void main(String[] args) {
	int num = 12;
	if ( num < 2 || num > 100 ){
	    System.out.println("Invalid");
	   }else{
	       for (int i=1;i<=num;i++){
	           if (num %i == 0){
	               System.out.println(i);
	           }
	       } 
	   }
	

	}
	
	
}
