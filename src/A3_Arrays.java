public class A3_Arrays {

    public  static  void main(String[] args){

        //Single Dimensional Array
        //---------------------------------------------------------------------------------------
        // Declaration of an array- Approch1

        int a[]= new int[5];
        a[0]= 100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        // Declaration of an array- Approch2
        int b[]= {100,200,300,400,500};

        // Length of array
        System.out.println("Array a Length: "+a.length);
        System.out.println("Array b Length: "+b.length);

        //Read Data from array

        System.out.println("Value at 3rd position of array a: "+a[2]);
        System.out.println("Value at 4th position of array b: "+b[3]);

        // Read all values from array

        //Normal for loop
        for(int i=0; i<a.length;i++){
            System.out.println("Value at "+i+"th position: "+a[i]);
        }

        //Enhanced for loop
        int counter=0;
        for(int val:a ){
            System.out.println("Value at "+ counter++ +"th position: "+val);
        }

        //Two Dimensional Array
        //---------------------------------------------------------------------------------------

        // Declaration of an 2D-array- Approch1
        int c[][]= new int[3][2];
        c[0][0]=100;
        c[0][1]=200;

        c[1][0]=300;
        c[1][1]=400;

        c[2][0]=500;
        c[2][1]=600;

        // Declaration of an 2D-array- Approch2

        int d[][]={
                    {100,200},
                    {300,400},
                    {500,600}
                   };


        // Find the size of array

        System.out.println("length of row: "+c.length);
        System.out.println("Length of column: "+c[0].length);


        //Read specific data from 2D array

        System.out.println(c[0][1]);

        // Read the all data from array

        for(int r=0;r<c.length;r++){
            for(int col=0;col<c[0].length;col++){
                System.out.println(c[r][col]);
            }
        }

        // Read the all data from array and print in row and column format

        for(int r=0;r<c.length;r++){
            for(int col=0;col<c[0].length;col++){
                System.out.print(c[r][col]+ " ");
            }
            System.out.println();
        }

        // Read the all data from array by using enhabced for loop

        for(int arr[]:c){
            for(int x:arr){
                System.out.println(x);
            }
        }

        // Read the all data from array by using enhanced for loop and print in row and column format
        for(int arr[]:c){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }


        // Object type array- For storing different datatype data

        Object e[]= new Object[5];
        e[0]= 12345;
        e[1]=15.95;
        e[2]="Mahendra";
        e[3]='A';
        e[4]= true;

        for(Object x:e){
            System.out.println(x);
        }



    }

}
