public class ClassRoom {
    String name;
    int age;
    String address;
    public ClassRoom(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public static void main(String[] args){
        ClassRoom name=new ClassRoom("Krishna",15,"mumbai");
        name.printCategory();
        name.printDetails();

    }
    public void printCategory(){
        if(age>=5 && age<=12){
            System.out.println("Primary School");
        }else if(age>=13 && age<=15){
            System.out.println("High School");
        }
    }
    public void printDetails(){
        System.out.println(name);
        System.out.println(address);
    }

}
