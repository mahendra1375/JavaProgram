package oops.Abstraction;

abstract class Shape {
    abstract void Draw();

    //Abstract class may have non abstract method
    void Drawing(){
        System.out.println("Creating Drawing............");
    }
}
