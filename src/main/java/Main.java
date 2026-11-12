
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SalaryCalculator s = new SalaryCalculator();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        try {
            s.validateSalary(basic);

            System.out.println("HRA: " + s.calculateHRA(basic));
            System.out.println("DA: " + s.calculateDA(basic));
            System.out.println("Gross Salary: " + s.calculateGross(basic));
            System.out.println("Deduction: " + s.calculateDeduction(basic));
            System.out.println("Net Salary: " + s.calculateNet(basic));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
