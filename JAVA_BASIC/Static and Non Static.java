public class Statics {
   static int staticValue=0;
   int nonStaticValue=0;
   public static void main(String []args){
       Statics statics=new Statics();
       statics.increment();
       statics.increment();
       statics.increment();
       Statics statics1=new Statics();
       statics1.increment();
       Statics statics2=new Statics();
       statics2.increment();
   }
   public void increment(){
       staticValue++;
       nonStaticValue++;
       System.out.println("Static Value "+staticValue);
       System.out.println("Non Static Value "+nonStaticValue);
       System.out.println("-----------------------------------");

   }
}
