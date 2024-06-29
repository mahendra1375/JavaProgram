package oops.Abstraction.Interface;

 class TestMultipleInheritance implements printable,Showable{

     public void show() {
       System.out.println("Showable..............");
     }

     public void print() {
         System.out.println("Printable..............");
     }

     public static void main(String [] args){
         TestMultipleInheritance obj = new TestMultipleInheritance();
         obj.show();
         obj.print();
     }
 }
