package week14;

public class SeniorDeveloper extends RegularDeveloper implements PromotionBehavior{
    public SeniorDeveloper(int id, String fullName, double monthlySalary) {
        super(id, fullName, monthlySalary);
    }

    @Override
    double income() {
        return monthlySalary + getPromotion();
    }

    @Override
    public double getPromotion() {
        return  1.5 * monthlySalary;
    }
}
