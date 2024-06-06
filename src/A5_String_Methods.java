import java.util.Arrays;

public class A5_String_Methods {

    public  static  void  main(String [] args){

        //1.length-to find length of string

        String s1= "Mahendra";
        System.out.println("Length of string is: "+s1.length());

        //2. Concat

        String s2= "welcome";
        String s3= "java";
        String s4="Automation";

        System.out.println("Concatinated String: "+ (s2+s3));
        System.out.println("Concatinated String: "+ s2.concat(s3));

        // join  3 string by using concat
        System.out.println("Concatinated 3 String: "+ (s2+s3+s4));
        System.out.println("Concatinated String: "+ s2.concat(s3).concat(s4));

        //3. trim()= For removing empty spaces from string

        String s5= "   Mahendra   ";
        System.out.println("Before trimimg: "+s5);
        System.out.println("After triming: "+(s5.trim()));

        //4. CharAt()- Return specific character from string based on index

        String s6= "Automation";
        System.out.println("Character at 4th position is: "+s6.charAt(3));

        //5. cotains- check specific string is part of main string or not

        String s7= "Welcome to Automation";
        String s8= "come";

        boolean str_avilability=s7.contains(s8);

        System.out.println("Avilability: "+str_avilability);

        //6. equal and equalegnorecase

        String s9= "welcome";
        String s10= "Welcome";

        System.out.println("Output with equal: "+(s9.equals(s10)) );// false
        System.out.println("Output with equalignorecase: "+(s9.equalsIgnoreCase(s10)));//true

        //7. replace- replace single or multiple(Sequencial) character from string

        String s11="selenium java python selenium automation selenium";
        String replaced_value= s11.replace("e", "x");
        System.out.println("Replaced Value: "+replaced_value);

        String replace_string= s11.replace("selenium", "Cypress");
        System.out.println("Replaced String: "+replace_string);

        // Substrings- extract substring from main string

        String s12= "Welcome";

        System.out.println("Substring: "+s12.substring(3,6));

        //Uppercase and Lowercase

        String s13= "MaheNdRa";
        System.out.println("Uppercase_String: "+s13.toUpperCase());
        System.out.println("Lowercase _String: "+s13.toLowerCase());

        //spit- split string into multiple part based on delimeter

        //Example 1
        String s14= "MahendraShivaji@123";
        String [] str_Arr=s14.split("@");

        System.out.println("First Value after splitting: "+str_Arr[0]);
        System.out.println("Second Value after splitting: "+str_Arr[1]);

        //Example2
        String s15= "abc,123@xyz";

        String [] arr1=s15.split(",");
        System.out.println(Arrays.toString(arr1));
        String [] arr2=arr1[1].split("@");
        System.out.println(arr1[0]+ " " +Arrays.toString(arr2));

        String []arr3= new String[3];
        arr3[0]=arr1[0];
        arr3[1]=arr2[0];
        arr3[2]=arr2[1];

        System.out.println(Arrays.toString(arr3));

    }
}
