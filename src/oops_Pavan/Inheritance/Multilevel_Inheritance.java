package oops_Pavan.Inheritance;



class class1{
    int A;

    void display(){
        System.out.println(A);
    }
}

class class2 extends class1{
    int B;

    void  show(){
        System.out.println(B);
    }
}

class class3 extends class2{
    int C;

    void print(){
        System.out.println(C);
    }
}




public class Multilevel_Inheritance {
    public static void main(String []args){

        class3 cl= new class3();

        cl.A=100;
        cl.B=200;
        cl.C=300;

        cl.display();
        cl.show();
        cl.print();

    }
}

