package oops_Pavan.Inheritance;

class class4{
    int A;

    void display(){
        System.out.println(A);
    }
}

class class5 extends class4{
    int B;
    void Show(){
        System.out.println(B);
    }
}

class class6 extends class4{
    int C;

    void print(){
        System.out.println(C);
    }
}



public class Hirarcial_Inheritance {

public static void main(String args[]){

    class5 cl5=new class5();

    cl5.A=100;
    cl5.B=200;

    cl5.display();
    cl5.Show();


    class6 cl6=new class6();
    cl6.A=400;
    cl6.C=500;

    cl6.display();
    cl6.print();


}

}
