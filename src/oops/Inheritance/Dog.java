package oops.Inheritance;

public class Dog extends Animal {

    public void barking(){
        System.out.println("Dod is barking");
    }

    public static  void  main(String []args){
        Dog d= new Dog();
        d.barking();
        d.eating();

    }
}
