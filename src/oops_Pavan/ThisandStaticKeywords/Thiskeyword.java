package oops_Pavan.ThisandStaticKeywords;

public class Thiskeyword {

    int Id;
    String Name;

//    Thiskeyword(int Id, String Name){
//        this.Id=Id;               // This keyword used to differntiate between class and Local variable
//        this.Name=Name;           // This keyword used to differntiate between class and Local variable
//    }

    void setData(int Id, String Name){
        this.Id=Id;
        this.Name=Name;
    }

    void display(){
        System.out.println("Id="+Id);
        System.out.println("Name="+Name);
    }

    public static void main(String []args){
        //Thiskeyword th= new Thiskeyword(100, "Mahendra");
        Thiskeyword th= new Thiskeyword();
        th.setData(100, "Mahendra");
        th.display();
    }

}
