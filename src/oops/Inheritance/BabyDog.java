package oops.Inheritance;

public class BabyDog extends Dog {

    //Multilevel inheritance Baby dog extending dog class and dog extending animal class

    public void weeping(){
        System.out.println("Baby dog weeping.................");
    }

    public static void main(String [] args){
        BabyDog BD= new BabyDog();
        BD.weeping();
        BD.barking();
        BD.eating();
    }

}
