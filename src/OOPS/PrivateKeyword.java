package OOPS;
class Student{
    String name;
   private int rno;
    double cgpa;
    // void print(){//getter
    //     System.out.println(name+" "+cgpa+" "+rno);
    // }
     
    //HM AGAR PRINT KO PRIVATE KR DE
    //AUR EK ALG FUNCTION BNA KR PRINT KO CALL KR DE TB BHI YE PRINT KREGA
    
    int getRno(){//getter
        return rno;
    }

    void setRno(int r){//setter
       rno=r;
    }
    void print(){
        System.out.println(name+" "+cgpa+" "+rno);
     }
    public void p(){
        print();
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ashish";
        s1.cgpa=9.5;
        //s1.rno=34;//ERROR
        s1.setRno(34);
        System.out.println(s1.name+" "+s1.cgpa+" ");//YHA PR PRIVATE HONE KI WJH SE ROLL NO NHI PRINT HOGA AUR NA TOH HM CHANGES KR SKTE HAI
       // s1.print();//AGAR HM STUDENT CLASS KE ANDAR EK METHOD PRINT BNATE HAI TB YE PRINT KR DEGA
       s1.print(); 
       s1.p();
    }
}
