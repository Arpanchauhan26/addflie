class pen{
     String color;
    String type;
    public void write(){
     System.out.println("write");
    }
    public void paint(){
        System.out.println(color);
        System.out.println(type);
    }
}
class Student{
    String name;
    int age;
    public void info(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class pr {
  
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.paint();
        Student s1 = new Student();
        s1.name="arpan";
        s1.age=18;
        s1.info();
       
    }
}
 