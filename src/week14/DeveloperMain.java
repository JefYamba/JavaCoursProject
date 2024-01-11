package week14;

public class DeveloperMain {
    public static void main(String[] args) {
        RegularDeveloper regularDeveloper = new RegularDeveloper(1,"regular Developer",45000);
        System.out.println("\n" + regularDeveloper.id + " - " + regularDeveloper.fullName  + "\n" +
                            "Monthly salary : " + regularDeveloper.monthlySalary+ "\n" +
                            "Income : " + regularDeveloper.income());

        FreelanceDeveloper freelanceDeveloper = new FreelanceDeveloper(2,"freelance Developer",62);
        freelanceDeveloper.setUnitPrice(1000);
        System.out.println("\n" + freelanceDeveloper.id + " - " + freelanceDeveloper.fullName  + "\n" +
                            "Unite price : " + freelanceDeveloper.unitPrice + "\n" +
                            "Hours : " + freelanceDeveloper.hours + "\n" +
                            "Bonus Salary : " + freelanceDeveloper.getBonusSalary()+ "\n" +
                            "Income : " + freelanceDeveloper.income());

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(3,"regular Developer",50000);
        System.out.println("\n" + seniorDeveloper.id + " - " + seniorDeveloper.fullName  + "\n" +
                "Monthly salary : " + seniorDeveloper.monthlySalary + "\n" +
                "Promotion salary : " + seniorDeveloper.getPromotion() + "\n" +
                "Income : " + seniorDeveloper.income());
    }
}
