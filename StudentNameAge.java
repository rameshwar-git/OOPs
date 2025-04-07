public class StudentNameAge {
    String name;
    int age;
        
    public StudentNameAge(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println(name+" age is "+age);
    
    }
    public static void main(String[] a){

        StudentNameAge stu1=new StudentNameAge("Sahu", 17);
        StudentNameAge stu2=new StudentNameAge("Modi", 16);

        stu1.display();
        stu2.display();
    }
}
