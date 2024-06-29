import java.util.*;

public class NumberProgram {

    //1. Print 1 to 10 numbers
    //2. Swapping of Two Numbers
    //3. Check number is even or odd number
    //4. Largest of three numbers
    //5. Print only even numbers between 1 to 10
    //6. Print only odd numbers between 1 to 10
    //7. Print even & odd numbers between 1 to 10
    //8. Reverse the number
    //9. Verify number is palindrome
    //10. Count number of didit in a number
    //11. Count even and odd digit in number
    //12. Sum of digits in number
    //13. Find sum of numbers in array
    //14. Find Even and Odd  numbers in array
    //15. Find the prime number
    //16. sorting of number in array(ascending)
    //17. Searching how many times value is reapeated in array
    //18. Searching required value from array
    //19. find missing number in array
    //20. Find Largest number in array
    //21. Find lowest number in array
    //22. Printing numbebrs ending with 7 or 8 from 0 to 100





    public static void main(String[] args){

       //1. Print 1 to 10 numbers
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        //2.Swapping of numbers

        int a=5, b=7;

        //Approch1
        /*int c;
        c=a;
        a=b;
        b=c;*/

        //Approch2
        /*a=a+b;
        b=a-b;
        a=a-b;*/

        //Approch3
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("A:"+a);
        System.out.println("B:"+b);

        //3.Check number is even or odd number

        int d=10;

        if(d%2==0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }

        //4. Largest of three numbers

        int AA=10, BB=30, CC=50;

        if(AA>BB && AA>CC){
            System.out.println("AA having largest number");
        } else if (BB>AA && BB>CC) {
            System.out.println("BB having largest number");
        } else if(CC>AA && CC>BB){
            System.out.println("CC having largest number");
        }


        //5. Print only even numbers between 1 to 10

        //approch1
        int BC=1;

        while(BC<=10){
            if(BC%2==0){
                System.out.println(BC);
            }
            BC++;
        }

        //Approch2
        for(int k=2; k<=20; k+=2){
            System.out.println("Even Number: "+k);
        }

        //6. Print only odd numbers between 1 to 10
        int BD=1;
        while (BD<=10){
            if(BD%2!=0){
                System.out.println(BD);
            }
            BD++;
        }

        //7. Print even & odd numbers between 1 to 10

        int BE=1;

        while (BE<=10){
            if(BE%2==0){
                System.out.println(BE+ " __________Even");
            } else {
                System.out.println(BE+ " __________odd");
            }

            BE++;
        }

        //8. Reverse the number
        int Num1=1245;
        int rev = 0;
        while (Num1 != 0){
            int digit=Num1%10;
            rev= rev*10 +digit;
            Num1/=10;
        }
        System.out.println(rev);


        //9. Verify number is palindrome
        int original_num=1221;
        int num2=original_num;
        int rev_num=0;

        while(num2!=0){
         int digit=num2%10;
         rev_num= rev_num*10 + digit;
         num2/=10;
        }
        System.out.println(rev_num);

        if (original_num==rev_num){
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

        //10. Count number of didit in a number
        int num3= 1237858895;
        int count = 0;
        while(num3!=0){
            num3/=10;
            count++;
        }
        System.out.println("Digit Count: "+count );


        //11. Count even and odd digit in number

        int num4= 1237858895;
        int evenCount=0;
        int oddCount=0;

        while (num4!=0){
            int digit= num4%10;
            num4/=10;
            if (digit%2==0){
                System.out.println("Number is even");
                evenCount++;
            } else {
                System.out.println("Number is odd");
                oddCount++;
            }
        }
        System.out.println("EvenCount: "+evenCount);
        System.out.println("OddCount: "+oddCount);

        //12. Sum of digits in number

        int num5=24556;
        int sum=0;
        while(num5!=0){
            int digit= num5%10;
            sum=sum+digit;
            num5/=10;
        }
        System.out.println("Sum: "+sum);



        //13. Find sum of numbers in array
        int num6[]={10,20,30,40};
        int sum6=0;
        for (int x:num6){
            sum6=sum6+x;
        }

        System.out.println("Sum of numbers in array: "+sum6);

        //14. Find Even and Odd  numbers in array

        int num7[]= {4,7,3,6,8,10,38,31,47,45,48,57};
        int evenCount7=0;
        int oddCount7=0;
        for (int x:num7){
            if(x%2==0){
                System.out.println(x+" is a even number");
                evenCount7++;
            } else {
                System.out.println(x+" is a odd number");
                oddCount7++;
            }
        }

        System.out.println("EvenCount7: "+evenCount7);
        System.out.println(("OddCount7: "+oddCount7));

        //15. Find the prime number
        int num8= 8;
        int count8=0;

        if(num8>1){

            for (int i8=1; i8<=7;i8++){
                if(num8%i8==0){
                    count8++;
                }
            }

        } else {
            System.out.println("Number is not prime");
        }

        if(count8==2){
            System.out.println(num8+" is prime number");
        } else {
            System.out.println(num8+" is not a prime number");
        }

        //15. Find the prime number from array

        int []num9= {4,7,6,8,9,13,17,3,24,78};
        int Prime_count=0;
        for(int x:num9){
            int factor_count=0;
            if(x>1){
                for(int i9=1;i9<=x;i9++){
                    if (x%i9==0){
                        factor_count++;
                    }
                }
            }
            if(factor_count==2){
                System.out.println(x+" is prime number");
                Prime_count++;
            }
        }

        System.out.println("Prime Count from array is: "+Prime_count);

        //16. sorting of number in array(ascending)

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

        //17. Searching how many times value is reapeted in array

        //Approch1
        int ba[]= {10,20,30,10,40,10};
        int value=10;
        int reapeted_count=0;

        for(int x:ba){
            if(x==value){
                reapeted_count++;
            }
        }
        System.out.println(value+" Reapeted "+reapeted_count+" times");

        //Approch1
        HashMap<Integer, Integer> countacc= new HashMap<>();
        for(int p:ba){
            if (countacc.containsKey(p)){
                countacc.put(p, countacc.get(p)+1);
            } else {
                countacc.put(p,1);
            }
        }
        for(Map.Entry<Integer, Integer> entry:countacc.entrySet()){
            System.out.println(entry.getKey()+ ":"+entry.getValue());
        }

        //18. Searching required value from array
        int ab[]= {10, 30, 40, 50 , 60 , 80};
        int SearchValue= 60;
        boolean status= false;

        for(int x:ab){
            if(x==SearchValue){
                System.out.println("Expected element found. Element is: "+x);
                status=true;
                break;
            }
        }
        if(status==false) {
            System.out.println("Element not found");
        }


        //19. find missing number in array

        int missnum[]={1,4,3,5};
        int Number_sum=0;


        for(int x:missnum){
            Number_sum=Number_sum+x;
        }
        System.out.println("Sum of Number in array: "+Number_sum);
        int Expectedsum=0;
        for(int m=1;m<=5;m++){
            Expectedsum=Expectedsum+m;
        }


        System.out.println("Sum of Number in array: "+Expectedsum);

        System.out.println("Missing number is: "+(Expectedsum-Number_sum));

        //20. Find Highet number in array

        int ad[]={50,30,40,60,10};
        int max=ad[0];

        for (int n=0;n<=ad.length-1;n++){
            if(ad[n]>max){
                max=ad[n];
            }
        }

        System.out.println("Max Value is: "+max);

        //21. Find lowest number in array

        int ae[]= {39,15,4,9,48,45};
        int min= ae[0];

        for(int p=0;p<=ae.length-1;p++){
            if(ae[p]<min){
                min=ae[p];
            }
        }

        System.out.println("Min Value is: "+min);

        //22. Printing numbebrs ending with 7 or 8 from 0 to 100


        for(int j=0; j<=100;j++){
            int digit=j%10;
            if(digit==7 || digit==8){
                System.out.println(j);
            }
        }



    }
}
