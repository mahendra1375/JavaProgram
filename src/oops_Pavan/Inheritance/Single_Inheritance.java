package oops_Pavan.Inheritance;

class A{
    int A;

    void display(){
        System.out.println(A);
    }
}

class B extends A{
    int B;

    void  show(){
        System.out.println(B);
    }
}

public class Single_Inheritance {

    public static void main(String []args){

        B b= new B();

        b.A=100;
        b.B=200;

        b.display();
        b.show();

    }
}
