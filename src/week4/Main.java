package week4;

public class Main {
    public static void main(String[] args){

        try {
            // First part
            /*
            Worker week2 = new Worker();
            week2.setName("joph");
            week2.setSalary(-2000);
             */

            // Second part
            Worker worker1 = new Worker("jef",15000);
            Worker worker2 = new Worker("clhoe", 22000);
            Worker worker3 = new Worker("geordy", 11000);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Total number of week2 : " + Worker.counter);
    }
}
