package oops_Pavan.ThisandStaticKeywords;

public class StaticKeyword {


    static int a=10;
            int b=20;


    static void m1(){
                System.out.println("M1 is static method");
            }


    void m2(){
        System.out.println("M2 is non-static method");
    }

    void m3(){                          // non static method can acess static as well as non static methods and variable directly
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }



    public static void main(String []args){

        System.out.println(a);              //Static variable can invoke without creating object
        m1();                                //Static Method can invoke without creating object

        StaticKeyword sk= new StaticKeyword();
        System.out.println(sk.b);                //Non Static variable can invoke only after creating object
        sk.m2();                                //Non Static Method can invoke only after creating object
        sk.m3();

    }


}
