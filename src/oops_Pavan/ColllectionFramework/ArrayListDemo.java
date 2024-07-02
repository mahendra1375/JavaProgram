package oops_Pavan.ColllectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String args[]){


        //Store Hetrogineous data

        ArrayList al = new ArrayList();
        al.add("Mahendra");
        al.add("10.5");
        al.add("true");
        al.add("100");

        System.out.println(al);

        // Store Homogenious data

        ArrayList<Integer> al_Homo= new ArrayList<Integer>();

        al_Homo.add(100);
        al_Homo.add(299);

        System.out.println(al_Homo);


        //retrive data using for loop

        for (int i=0;i<=al.size()-1;i++){
            System.out.println("Data at index "+ i + " : " +al.get(i));
        }

        //retrive data using enhanced for loop


        for(Object x:al){
            System.out.println("Data: "+x);
        }
    }
}
