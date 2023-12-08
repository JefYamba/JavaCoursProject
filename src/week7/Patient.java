package week7;

public class Patient {
    private static int counter = 0;
    private int patientId;
    private String patientName;

    public Patient(String patientName) {
        Patient.counter++;
        this.patientId = counter;
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    @Override
    public String toString() {
        return "Id: " + patientId + "  - Name: " + patientName;
    }
}
