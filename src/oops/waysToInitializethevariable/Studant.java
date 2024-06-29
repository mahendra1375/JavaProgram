package oops.waysToInitializethevariable;

public class Studant {
    int studentID=0;
    String StudentFirstName;
    String StudentLastName;


    //Method to initialize variable
    public void intiaziseStudentData(int id, String Fname, String LastName){
        Studant std1= new Studant(103,"Sanket","Karpe");
        studentID=id;
        StudentFirstName=Fname;
        StudentLastName=LastName;

    }

    //Method to Display data from variable
    public void DisplayStudentData(){
        System.out.println("First Name: "+studentID);
        System.out.println("Last Name: "+StudentFirstName);
        System.out.println("StudenID: "+StudentLastName);
    }

    //Constructor to initialize variables
    public Studant(int id1, String FirstName, String LastNamee){

        studentID=id1;
        StudentFirstName=FirstName;
        StudentLastName=LastNamee;
    }
}
