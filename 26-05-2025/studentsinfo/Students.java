package studentsinfo;

public class Students {
    int rollno;
    String name;
    String course;
    Students(){
    }
    public Students(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
        
    }
    void display(){
        System.out.println(rollno+" "+name+" "+course);
    }
}