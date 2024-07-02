import java.lang.foreign.SymbolLookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProgramPractice {

    public static void main(String[] args) {
        //1. Print 1 to 10 numbers
        //2. Swapping of Two Numbers
        //3. Check number is even or odd number
        //4. Largest of three numbers
        //5. Print only even numbers between 1 to 10
        //6. Print only odd numbers between 1 to 10
        //7. Print even & odd numbers between 1 to 10
        //8. Reverse the number
        //9. Verify number is palindrome
        //10. Count number of digit in a number
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


        String str= "MahendraShivajiGaikwad";
        char str_arr[]=str.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        for(int i=0;i<=str_arr.length-1;i++){
            char currentchar= str_arr[i];
            if(hm.containsKey(currentchar)){
                hm.put(currentchar,hm.get(currentchar)+1);
            } else {
                hm.put(currentchar, 1);
            }
        }

        for(Character x:hm.keySet()){
            System.out.println(x+ ":" +hm.get(x));
        }






    }
}
