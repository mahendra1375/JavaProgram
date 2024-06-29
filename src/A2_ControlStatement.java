public class A2_ControlStatement {

    public  static void  main (String[] args){

        // if--------------------------------------------------------------------------------

        int age= 25;

        if(age>=18){
            System.out.println("Eligible for vote");
        }

        // if else---------------------------------------------------------------------------

        if (age>=18){
            System.out.println("Eligible not eligible for vote");
        } else {
            System.out.println("Not Eligible");
        }

        // Nested if else-------------------------------------------------------------------

        if(true){
            if(true){
                System.out.println("ABC");
            }else {
                System.out.println("123");
            }
        }

        //Switch Case--------------------------------------------------------------------------

        int weekno=5;

        switch (weekno){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thurday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            default:System.out.println("Sunday");

        }



        //Looping statement
        //-----------------------------------------------------------------------------------------

        //1.while loop

        int BA= 1;

        while (BA<=10){
            System.out.println(BA);  // priting 1 to 10 number
            BA++;
        }

        int BB=10;
        while (BB>=1){
            System.out.println(BB); //printing 10 to 1 number
            BB--;
        }

        //2. Do while loop
        int BE= 1;

        do {
            System.out.println("Num: "+BE);
            BE++;
        } while (BE<=10);


        // For Loop

        for (int i=1; i<=10; i++){
            System.out.println("ForNum: "+i);
        }

        for(int k=2; k<=20; k+=2){
            System.out.println("Even Number: "+k);
        }


        // jumping statement

        //1. break

        for(int k=1; k<=10; k++){

            if(k==5){
                break;
            }

            System.out.println("Break: "+k);
        }

        //2. Continue

        for (int k=1; k<=10; k++){
            if(k==5){
                continue;
            }
            System.out.println("Continue: "+k);   //Number 5 will be miss in output because a sson as condition is true execution goes to initial point again
        }








    }
}
