package oops.waysToInitializethevariable;

public class Student1 {

    int studentID;
    String StudentFirstName;
    String StudentLastName;

    Student1(int ID, String Name, String Lname){
        studentID=ID;
        StudentFirstName=Name;
        StudentLastName=Lname;
    }



    //Method to Display data from variable
    public void DisplayStudentData(){
        System.out.println("First Name: "+studentID);
        System.out.println("Last Name: "+StudentFirstName);
        System.out.println("StudenID: "+StudentLastName);
    }

}
