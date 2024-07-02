package oops_Pavan.ColllectionFramework;

import java.util.HashSet;

public class HashsetDemo {

    public static void main(String args[]){

        //Store Hetrogenious data
        HashSet hset= new HashSet();

        hset.add("10.7");
        hset.add("Mahendra");
        hset.add("pune");
        hset.add("100");
        hset.add("true");

        for (Object X:hset ){
            System.out.println("Data: "+X);
        }

        //Store Hemogenious data

        HashSet <String> city= new HashSet<String>();

        city.add("pune");
        city.add("Mumbai");
        city.add("Bangluru");
        city.add("Delhi");
        city.add("Chennai");

        for(String x: city){
            System.out.println("Data: "+x);
        }
    }
}
