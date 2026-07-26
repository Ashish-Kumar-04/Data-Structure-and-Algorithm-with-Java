package OOPS;
//POLYMORPHISM:Means many forms (same name alg kaam);
public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau...");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow meow...");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("Lion roars....");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello...");
        }
    }
    public static void main(String[] args) {
        Human h=new Human();
        Cat c=new Cat();
        Lion l=new Lion();
        Dog d=new Dog();
        d.speak();
        c.speak();
        l.speak();
        h.speak();
    }
}
