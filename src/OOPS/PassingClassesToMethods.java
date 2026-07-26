package OOPS;

public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+" "+type+" "+torque);
        }
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.length=3.99;
        c.name="Defender";
        c.seats=5;
        c.type="SUV";
        c.torque=178;
        System.out.println(c.seats);
        change(c);//POORE OBJECT KO HM FUNCTION KO BHEJ RHE HAI
        System.out.println(c.seats);//VALUE YHA PR 4 AAYEGI KYUNKI SHALLOW COPY HO RHA MTLB KI PASS BY REFERENCE 
        c.print();
    }
    public static void change(Car c){//CHANGE FUNCTION
        c.seats=4;
    }
    

}
