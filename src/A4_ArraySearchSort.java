import java.util.Arrays;
import java.util.Scanner;

public class A4_ArraySearchSort {

    public static void main (String[] args){

        //Searching required value from array

        int a[]= {10, 30, 40, 50 , 60 , 80};
        int SearchValue= 60;
        boolean status= false;

        for(int x:a){
            if(x==SearchValue){
                System.out.println("Expected element found. Element is: "+x);
                status=true;
                break;
            }
        }
        if(status==false) {
            System.out.println("Element not found");
        }

        //Searching how many times value is reapeated in array
        int b[]= {10,20,30,10,40,10};
        int value=10;
        int reapeted_count=0;

        for(int x:b){
            if(x==value){
                reapeted_count++;
            }
        }
        System.out.println(value+" Reapeted "+reapeted_count+" times");

        //sorting of number in array(ascending)
        int c[]={10,100,3,67,26,14,44,89,51};

        System.out.println("Before Sorting");
        for(int x:c){
            System.out.println(x);
        }

        Arrays.sort(c);
        System.out.println("After Sorting");

        System.out.println(Arrays.toString(c));

        for(int x:c){
            System.out.println(x);
        }

        //sorting of String in array(ascending/descending)

        String s[]= {"Mahendra", "Kishor","Anjali","Jyoti","Rajitha","Amol"};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(s));

        //Print array element in reverse order

        int d[]={1,2,3,4,5,6,7,8};
        int rev[];

        for(int i=d.length-1; i>=0;i--){
            System.out.println(d[i]);

        }

        //How to take values from user

        //Number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(num);

        //String
        System.out.println("Enter the city:");
        String city=sc.next();
        System.out.println(city);

        //Taking value from user and storing in array

        int e[]= new int[5];
//        System.out.println("Enter the number:");
//        e[0]=sc.nextInt();
//        System.out.println("Enter the number:");
//        e[1]=sc.nextInt();
//        System.out.println("Enter the number:");
//        e[2]=sc.nextInt();

        for (int i=0;i<e.length;i++){
            System.out.println("Enter the number for position: "+i);
            e[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(e));


        //Find missing number in array

    }
}
