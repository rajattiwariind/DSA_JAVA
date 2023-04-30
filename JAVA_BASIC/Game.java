public class Game {
    public static void main(String[]args){
      boolean game1=true && true && !(false) || false;
        System.out.println(game1);
       boolean game2= true || !(false) && (!false || false);
        System.out.println(game2);
        boolean game3=true || (true && false) || false;
        System.out.println(game3);
        boolean game4=(3>4) || ((4<=4 || true) && !false) || false;
        System.out.println(game4);
    }
}
