package week11;

public class StudentApp {
    public static void main(String[] args) {

        System.out.println("*********************************************************************");
        System.out.println("***********************    Student App    ***************************");
        System.out.println("*********************************************************************");
        System.out.println('\n');

        BachelorStudent bachelorStudent = new BachelorStudent(1,70,65);
        System.out.println("Bachelor Student : ");
        System.out.println("Base score : " + bachelorStudent.computeBaseScore());
        System.out.println("Project Score : " + bachelorStudent.projetScore());
        System.out.println("Total Score : " + bachelorStudent.computeTotalScore());
        System.out.println('\n');

        MasterStudent masterStudent = new MasterStudent(2,71,89,4);
        System.out.println("Master Student : ");
        System.out.println("Base score : " + masterStudent.computeBaseScore());
        System.out.println("Conference Score : " + masterStudent.conferenceScore());
        System.out.println("Total Score : " + masterStudent.computeTotalScore());
        System.out.println('\n');

        PhDStudent phDStudent = new PhDStudent(3,80,90,9,2);
        System.out.println("PhD Student : ");
        System.out.println("Base score : " + phDStudent.computeBaseScore());
        System.out.println("Conference Score : " + phDStudent.conferenceScore());
        System.out.println("Article Score : "  + phDStudent.articleScore());
        System.out.println("Total Score : " + phDStudent.computeTotalScore());
        System.out.println('\n');
    }
}
