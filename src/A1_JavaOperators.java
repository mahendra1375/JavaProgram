public class A1_JavaOperators {

    public  static void  main(String[] args){

        //Arithmetic Operators

        //1. Plus operator "+"
        int a=10, b=20;

        System.out.println("Sum :"+(a+b));

        //2. Minus operator "-"
        int c=15, d=10;

        System.out.println("Substrction: "+(c-d));

        //3. Multiplication operator "*"

        int e=4, f=5;

        System.out.println("Multiplication: "+(e*f));

        //4. Division operator "/"

        int g=8, h=4;

        System.out.println("Division: "+(g/h));

        //5. Modular Division operator "%"

        int i=7, j=2;

        System.out.println("Modular Division: "+(i%j));

        //----------------------------------------------------
        // Ralational/Comparison Operators

        int AB=5, CD= 10;

        //Less than <

        boolean less= AB<CD;

        System.out.println("Less than operator: "+less);

        //Greater than <

        boolean greater= CD>AB;

        System.out.println("Greater than operator: "+greater);

        // Not Equal to !=

        boolean notequal= AB != CD;

        System.out.println("Not equal operator: "+notequal);

        // Less than equal to
        int ef=5, gh=5;

        boolean lessthanequal= ef<=gh;
        System.out.println("Lessthanequal: "+lessthanequal);

        // Greater than equal to operator

        boolean greaterthanequal= ef>=gh;
        System.out.println("Greaterthanequalto: "+greaterthanequal);


        //Equal to

        boolean equalequalto= ef==gh;
        System.out.println("EqualEqualto: "+equalequalto);

        //------------------------------------------------

        //Logical Operator

        //&& operator

        int ij=5,lm=6,no=5, pq=5;

        if(ij==no && ij==pq){
            System.out.println("ij,no and pq are same");
        } else {
            System.out.println("ij,no and pq are same");
        }

        // || operator

        if (ij==no || ij==lm){
            System.out.println("Cotains 5 number");
        } else {
            System.out.println("Not Cotains 5 number");
        }

        // ! operator
        boolean x= true;
        System.out.println(!x);

        boolean y= false;

        System.out.println(!y);


        //-------------------------------------------

        //Increment/decrement operators

        int ac=10;
        ac= ac+1;

        System.out.println("Increment Value :"+ac);

        ac++;
        System.out.println("Increment Value By using ++ operator :"+ac);

        //Decrement Operator
        int ad=10;
        ad=ad-1;
        System.out.println("Decrement: "+ad);

        ad--;
        System.out.println("Decrement Value By using -- operator :"+ad);




        //--------------------------------

        //Assisgment/shorthand operator

        //Increment by 2 (+=)

        int AE=10;

        AE+=2;
        System.out.println("Increment by 2 :"+AE);

        //Decrement by 2 (-=)
        int AF=10;
        AF-=2;
        System.out.println("Decrement by 2 :" +AF);

        // *= operator
        int AG= 10;

        AG*=2; // replacement for AG= AG*2
        System.out.println("Multiplication: "+AG);

        int AH=10;
        AH/=2;   //replacement for AH= AH/2;

        System.out.println("Division assisgment: "+AH);

        int AI=10;
        AI%=3;  //Replacement for AI=AI%3
        System.out.println("Modular Division Assignment operator:"+AI);

        //Ternary operators

        int AJ=200, AK=100;

        int ax=(AJ>AK)? AJ:AK; // if condition is true then assign first value eg. AJ to ax
        System.out.println("Value by ternary operator:" +ax);

    }
}
