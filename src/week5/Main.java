package week5;

public class Main {
    public static void main(String[] args){
        System.out.println("#********* First part *********#");
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        Circle[] circleList = {circle1, circle2, circle3};

        for (Circle circle : circleList) {
            circle.computeArea();
        }

        System.out.println("\n*******************************");
        System.out.println("\n#*********Second part*********#");
        Teacher teacher1 = new Teacher(1,Branch.MATH);
        Teacher teacher2 = new Teacher(2,Branch.CS);
        Teacher teacher3 = new Teacher(3,Branch.ENG);
        Teacher teacher4 = new Teacher(4,Branch.PHYSICS);

        Teacher[] teacherList = {teacher1,teacher2,teacher3,teacher4};
        for (Teacher teacher : teacherList) {
            System.out.println("Teacher(" + teacher.getId() + ") : " + teacher.getBranch());
        }
    }
}
