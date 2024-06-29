package oops.waysToInitializethevariable;

public class InitializeStudentVariable {

    public static void main(String [] args){
        //--------------Initialization by using referance Varriable-----------------------------------------------
        Studant std = new Studant(100, "Mahendra", "Gaikwad");
        std.StudentFirstName="Vikas";
        std.StudentLastName="TMT";
        std.studentID=12051;



        System.out.println("First Name: "+std.StudentFirstName);
        System.out.println("Last Name: "+std.StudentLastName);
        System.out.println("StudenID: "+std.studentID);



        //--------------Initialization by using Method-----------------------------------------------

        Studant std1= new Studant(101, "Shubham", "Jagtap");
        std1.intiaziseStudentData(12054, "Mahendra", "Gaikwad");
        std1.DisplayStudentData();

        //--------------Initialization by using Constructor-----------------------------------------------
        Studant std2= new Studant(104,"Kishor", "Wabale");
        std2.DisplayStudentData();


    }

}
