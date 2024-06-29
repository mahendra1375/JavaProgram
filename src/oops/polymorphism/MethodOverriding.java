package oops.polymorphism;

public class MethodOverriding {

     public static void main(String[] args) {

         SBI Sbi= new SBI();
         Axis axs= new Axis();
         ICICI ic= new ICICI();

         System.out.println("SBI ROI:  "+Sbi.getRateOfInterest());
         System.out.println("Axis ROI: "+axs.getRateofInterest());
         System.out.println("ICICI ROI: "+ic.getRateofInterest());
    }
}
