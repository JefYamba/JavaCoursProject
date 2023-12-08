package week6;

public class Person {
    private int Id;
    private String firstName;
    private String lastName;
    private int age;


    public Person(int id, String firstName, String lastName, int age) {
        this.Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this(0, firstName, lastName, 0);
        ++this.Id;
    }

    public Person(int id) {
        this(id, "Joph", "Yamba", 23);
    }

    public Person() {
        this(0,"Joph", "Yamba", 23);
        ++this.Id;
    }

    @Override
    public String toString() {
        return "Person{ " +
                "Id : " + this.Id + '\t'+
                "FirstName : " + this.firstName + '\t' +
                "LastName : " + this.lastName + '\t' +
                "Age : " + this.age +
                " }";
    }
}
