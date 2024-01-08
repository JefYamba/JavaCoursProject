package week14;

public class FreelanceDeveloper extends Developer implements BonusSalaryBehavior{
    int unitPrice;
    int hours;

    public FreelanceDeveloper(int id, String fullName, int hours) {
        super(id, fullName);
        this.hours = hours;
    }

    @Override
    public double getBonusSalary() {
        return hours * 1.5;
    }

    @Override
    double income() {
        return hours * unitPrice + getBonusSalary();
    }
}
