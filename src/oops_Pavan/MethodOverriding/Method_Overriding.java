package oops_Pavan.MethodOverriding;

class Bank{

    double ROI(){
        return 0;
    }
}


class SBI extends Bank{

    double ROI(){                //overrided method
        return 10.5;
    }
}

class ICICI extends Bank{
    double ROI (){              //overrided method
        return 7.5;
    }
}



public class Method_Overriding {
    public static void main(String[] args) {
        Bank bk = new Bank();
        System.out.println(bk.ROI());

        SBI sb = new SBI();
        System.out.println(sb.ROI());

        ICICI ic = new ICICI();
        System.out.println(ic.ROI());


    }

}
