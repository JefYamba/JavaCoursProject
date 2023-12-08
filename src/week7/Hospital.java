package week7;

public class Hospital {
    public static Patient[] patients;

    public static void main(String[] args) {
        Patient clhoe = new Patient("Clhoe");
        Patient john = new Patient("John");
        Patient david = new Patient("David");
        Patient liza = new Patient("Liza");

        Hospital.patients = new Patient[]{clhoe, john, david, liza};


        /*Hospital.patients = new Patient[]{
                new Patient("Clhoe"),
                new Patient("Clhoe"),
                new Patient("Clhoe"),
                new Patient("Clhoe")
        };*/



        for (Patient patient: patients) {
            System.out.println(patient);
        }
    }
}
