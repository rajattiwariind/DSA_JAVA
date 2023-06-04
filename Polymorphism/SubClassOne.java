public class SubClassOne extends Parent {

    public SubClassOne(){
        System.out.println("SubClass One const");
    }

    @Override
    protected void print() {

        System.out.println("Print from Subclass one");
    }
}
