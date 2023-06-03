public class Child implements Father, Mother {
    @Override
    public void height() {
        double height = (Father.height + Mother.height) / 2;
        System.out.println(height);
    }
}
