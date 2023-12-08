package week5;

public class Teacher {
    private int id;
    private Branch branch;

    public Teacher(int id, Branch branch){
        this.id = id;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public Branch getBranch() {
        return branch;
    }
}
