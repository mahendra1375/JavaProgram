package oops_Pavan.Inheritance;

interface I1{
   void m1();
}

interface I2{
    void m1();
    void m2();
}

class class7 implements I1,I2{
    public void m1(){
        System.out.println("eating...........");
    }

    public  void m2(){
        System.out.println("Drinking...........");
    }

}

class class8 implements I1,I2{
    public void m1(){
        System.out.println("playing...........");
    }

    public void m2(){
        System.out.println("Studying...........");
    }
}

public class Multiple_Inheritance {

    public static void main(String [] args){
    class7 cl7=new class7();
    cl7.m1();
    cl7.m2();

        class8 cl8= new class8();
        cl8.m1();
        cl8.m2();
    }


}
