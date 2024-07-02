package oops_Pavan.ColllectionFramework;

import java.util.HashMap;

public class HashmapDemo {

    public  static void main(String []args){

        //store Hetrogenious data
        HashMap hm= new HashMap();

        hm.put("City", "Pune");
        hm.put("101", "Mahendra");


        for(Object k:hm.keySet()){
            System.out.println(k+ ":"+hm.get(k));
        }
    }
}
