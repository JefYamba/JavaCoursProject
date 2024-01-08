package week14;

public abstract class Developer {
    int id;
    String fullName;

    Developer(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    abstract double income();
}
