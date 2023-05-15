public class Student {
    String name;
    String  dob;
    String bloodGroup;
    public Student(String name,String dob, String bloodGroup){
        this.name=name;
        this.dob=dob;
        this.bloodGroup=bloodGroup;
    }
    public static void main(String []args){
        Student ayush=new Student("Ayush","19-05-1999","o+ve");
        int age=ayush.calculateAge(ayush.dob);
        System.out.println("Student Age is "+age);
        ayush.printDetails(ayush);

    }
    public int calculateAge(String dob){
        int currentYear=2023;
         String[] splitDob=dob.split("-");
         String yearString=splitDob[2];
         int year=Integer.parseInt(yearString);
         int age=currentYear-year;
         return age;
    }
    public void printDetails(Student student){
        System.out.println("Student name is "+student.name);
        System.out.println("Student blood Group is "+student.bloodGroup);

    }
}
