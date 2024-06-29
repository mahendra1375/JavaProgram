import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StingProgram {

    public static void main(String[] args) {

        //1. Reverse the string
        //2. Reverse the word in string. Scenario1: Reverse only word, Scenario2: Reverse word and characters both
        //3. Check whether string is palindrome
        //4. Remove junk/special characters from string
        //5. Count occurrences of character in string
        //6. count number of words in string
        //7. Program for generate Random String
        //8. Remove White spaces from string
        //9. Count occurrences of character in a string



        //1. Reverse the string

        String s1 = "Welcome";

        String rev = "";

        //Approch1

        for (int i = s1.length() - 1; i >= 0; i--) {
            //System.out.println(s1.charAt(i));

            rev = rev + s1.charAt(i);
        }

        System.out.println("Reverse string is: " + rev);

        //Approch2

        String s2 = "Mahendra";
        String rev2 = "";
        char[] arr = s2.toCharArray();
        for (int i = s2.length() - 1; i >= 0; i--) {
            rev2 = rev2 + arr[i];
        }

        System.out.println("Rev2 Value is: " + rev2);


        //approch3- using StringBuffer class

        StringBuffer s3 = new StringBuffer("Shital");

        System.out.println("Rev3 value is: " + s3.reverse());

        //Approch4 - Using stringbuilder class

        StringBuilder s4 = new StringBuilder("Raju");
        System.out.println("Strig 4 rev value is: " + s4.reverse());


        //2. Reverse the word in string

        //Scenario1: Reverse the only word in string
        String s5 = "Welcome to Java";
        String[] arr5 = s5.split(" ");
        StringBuilder revString5= new StringBuilder();
        for(int i=arr5.length-1; i>=0;i--){
            revString5.append(arr5[i]).append(" ");
        }
        System.out.println("Reversed Only words is :" +revString5);

        //Scenario2: Reverse the word and character from a string
        StringBuilder revStringword= new StringBuilder();
        String []str5= new String[arr5.length];
        for(int i=0; i<=arr5.length-1;i++){
            String rev5="";
            for(int k=arr5[i].length()-1; k>=0;k--){
                rev5=rev5+arr5[i].charAt(k);
            }
            str5[i]=rev5;
        }
        for(int x= str5.length-1; x>=0; x--){
            revStringword.append(str5[x]).append(" ");
        }
        System.out.println("Rev word and character from string: "+revStringword);


        //3. Check whether string is palindrome
        String s6 = "ADMDA";
        String rev6 = "";
        for (int i = s6.length() - 1; i >= 0; i--) {
            rev6 = rev6 + s6.charAt(i);
        }

        System.out.println("String 6 reverse value is: " + rev6);
        if (s6.equals(rev6)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

        //4. Remove junk/special characters from string
        String s7 = "Mah%hen$jlsf@";
        String replace_str = s7.replaceAll("[%$@]", "");
        System.out.println("String is: " + replace_str);

        //5. Count occurrences of character in string

        //Scenario1
        String s8 = "Mahendra";
        char c8 = 'a';
        int occ = 0;
        for (int i = 0; i <= s8.length() - 1; i++) {
            if (c8 == s8.charAt(i)) {
                System.out.println("String occurred ");
                occ++;
            }
        }
        System.out.println("occurances Count: " + occ);

        //6. count number of words in string
        String s9 = "Automation test Java";
        String[] arr9 = s9.split(" ");
        System.out.println("Count of words in string: " + arr9.length);


        //7. Program for generate Random String

        System.out.println("Generated random string is: "+generateRandomString(10));


        //8. Remove White spaces from string

        String s12 = "M ah  end    ra";
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<=s12.length()-1;i++){
            char currentchar=s12.charAt(i);

            if(!Character.isWhitespace(currentchar)){
                sb.append(currentchar);
            }
        }

        System.out.println("Removed spaces: "+sb);


        // Hash Map

        HashMap map= new HashMap();

        map.put("First Name", "Mahendra");
        map.put("Last Name", "Gaikwad");

        System.out.println("First Name is: "+map.get("First Name"));
        System.out.println("Last Name is: "+map.get("Last Name"));


        //9. Count occurrences of character in a string

        String str11= "MahendraShivajiGaikwad";

        char []arr11= str11.toCharArray();

        Map<Character, Integer> countcharocc= new HashMap<>();

        for (char x:arr11){

            if(countcharocc.containsKey(x)){
                countcharocc.put(x,countcharocc.get(x)+1);
            } else {
                countcharocc.put(x,1);
            }
        }

        //for( Map.Entry<Character, Integer> entry: countcharocc.entrySet()){
          // System.out.println(entry.getKey() + ": " +entry.getValue());
        //}

        for (Object x:countcharocc.keySet()){
            System.out.println(x+":"+countcharocc.get(x));
        }


    }


    public static String generateRandomString(int lenght){
        StringBuilder randomString= new StringBuilder();
        Random rand = new Random();
        String charaters= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrst";

        for (int i=0; i<lenght; i++){
            int randomIndex= rand.nextInt(charaters.length());
            randomString.append(charaters.charAt(randomIndex));
        }
        return randomString.toString();
    }
}





