import java.util.*;
import java.lang.*;
class Student{
    int rollno;
    String name;
Student (int p1,String p2){
    rollno=p1;
    name=p2;
}
void getrollno()
{
System.out.println("Roll No.=" + rollno);

}
void getname()
{
System.out.println("Name=" + name);
}
}
public class Demo {
    public static void main(String[] args) {
        Student s1=new Student(10,"Aditi");
        Student s2=new Student(11,"Srishti");
        Student s3=new Student(12,"Vicky");
        Student s4=new Student(13,"Kusha");
        Student s5=new Student(14,"Emma");

        TreeSet<String> hs=new TreeSet<String>();
        hs.add("Aditi"); 
        hs.add("Srishti");
        hs.add("Vicky");
        hs.add("Kusha");
        hs.add("Emma");
        hs.size();
         
        for (Object o:hs){
            Student s=(Student)o;
            s.getname();
            s.getrollno();
        }
    }
    
}
