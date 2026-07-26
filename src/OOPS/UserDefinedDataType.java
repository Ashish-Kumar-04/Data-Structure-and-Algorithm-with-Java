package OOPS;

//CLASSES:THESE ARE THE BLUEPRINT FOR ENTITIES 
//OBJECTS:THESE ARE THE REAL LIFE ENTITIES IN THE WORLD
public class UserDefinedDataType {
    public static class Student{ //khudka ek data type bana liya hai
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+"  "+cgpa);
        }
    }
    public static void main(String[] args) {
        Student s1=new Student();//declaration 
        s1.name="Ashish kumar";
        s1.rno=57;
        s1.cgpa=8.5;

        Student s2=new Student();//declaration 
        s2.name="Ashih giri";
        s2.rno=55;
        s2.cgpa=4.5;

        Student s3=new Student();//declaration 
        s3.name="Ashish kumar bind";
        s3.rno=58;
        s3.cgpa=8.95;

        // System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
        // System.out.println(s2.name+" "+s2.cgpa+" "+s2.rno);
        // System.out.println(s3.name+" "+s3.cgpa+" "+s3.rno);
        s1.print();
        s2.print();
        s3.print(); 
    }
}
