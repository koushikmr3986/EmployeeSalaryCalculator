
public class SalaryCalculator {

    public double calculateHRA(double basic) {
        return basic * 20 / 100;
    }

    public double calculateDA(double basic) {
        return basic * 10 / 100;
    }

    public double calculateGross(double basic) {
        return basic + calculateHRA(basic) + calculateDA(basic);
    }

    public double calculateDeduction(double basic) {
        return calculateGross(basic) * 5 / 100;
    }

    public double calculateNet(double basic) {
        return calculateGross(basic) - calculateDeduction(basic);
    }

    public void validateSalary(double basic) {
        if (basic < 0) {
            throw new IllegalArgumentException("Invalid Salary");
        }
    }

    public static void main(String[] args) {

        SalaryCalculator s = new SalaryCalculator();

        double basic = 30000;

        s.validateSalary(basic);

        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + s.calculateHRA(basic));
        System.out.println("DA: " + s.calculateDA(basic));
        System.out.println("Gross Salary: " + s.calculateGross(basic));
        System.out.println("Deduction: " + s.calculateDeduction(basic));
        System.out.println("Net Salary: " + s.calculateNet(basic));
    }
}
