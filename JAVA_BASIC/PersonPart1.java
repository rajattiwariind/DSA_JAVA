public class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age=age;
        this.gender=gender;
    }

    public String getName(){
       return name;

   }
   public int getAge(){

       return age;
   }
   public char getGender(){
       return gender;
   }
}
