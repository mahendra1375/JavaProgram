package oops.Inheritance;

public class Cat extends Animal{

    //Hierarchical Inheritance. In this type one class inherited by multiple classes eg. Animal class is inherited by dog and cat class

    public void meowing(){
        System.out.println("Cat meowing.............");
    }

    public static void main(String []args){
        Cat ct = new Cat();
        ct.meowing();
        ct.eating();
        //ct.barking  showing error because barking method is from dog class

    }
}
