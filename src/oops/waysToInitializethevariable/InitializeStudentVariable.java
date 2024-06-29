package oops.waysToInitializethevariable;

public class InitializeStudentVariable {

    public static void main(String [] args){
        //--------------Initialization by using referance Varriable-----------------------------------------------
        Studant std = new Studant();
        std.StudentFirstName="Vikas";
        std.StudentLastName="TMT";
        std.studentID=12051;

        std.DisplayStudentData();


        //--------------Initialization by using Method-----------------------------------------------

        Studant std1= new Studant();
        std1.intiaziseStudentData(12054, "Mahendra", "Gaikwad");
        std1.DisplayStudentData();

        //--------------Initialization by using Constructor-----------------------------------------------

        Student1 std2= new Student1(12055, "Kishor", "Wabale");
            std2.DisplayStudentData();

    }

}
