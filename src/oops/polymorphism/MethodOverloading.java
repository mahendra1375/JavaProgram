package oops.polymorphism;

public class MethodOverloading {
    int ID;
    String Name;
    String City;

    // Method Overloading By changing number of pararmeter in method signature
    public void InsertRecord(int id, String Name){

        ID=id;
        this.Name=Name;
    }

    public void InsertRecord(int id, String Name, String City){
        ID=id;
        this.Name=Name;
        this.City=City;
    }

    // Method Overloading By changing sequence of pararmeter in method signature

    public void InsertRecord(String Name, String City, int id){
        ID=id;
        this.Name=Name;
        this.City=City;
    }

    public void DisplayData(){
        System.out.println(ID);
        System.out.println(Name);
        System.out.println(City);

    }

    public static void main(String [] arrgs){

        MethodOverloading MO= new MethodOverloading();
        MO.InsertRecord(100,"Mahendra");
        MO.DisplayData();

        MO.InsertRecord(101,"Kishor", "Gujrat");
        MO.DisplayData();

        MO.InsertRecord("Shankar", "Pune", 102);
        MO.DisplayData();
    }

}
