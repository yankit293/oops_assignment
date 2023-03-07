package employeePayRoll;

import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) throws Exception {
		char choice = 'Y';
		double totalWage = 0, totalTaxWage = 0, taxWage = 0;
		int countTemp = 0, countCon = 0, countFull = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		GetUserInput input = new GetUserInput();

		while (true) {

			// Choice Y
			// Take input From user.
			String empName = input.getEmpNameInput(sc);
			int empId = input.getEmpIdInput(sc);
			char workType = input.getWorkTypeInput(sc);
			double wage = input.getWageInput(sc, workType);

			// create instance of class
			Employee employee = new Employee(empName, empId, workType, wage);
			employees.add(employee);
			taxWage = calculateTaxWage(workType, wage);
			employee.setTaxWage(taxWage);
			System.out.println("Employee’s wage after tax:" + taxWage);
			System.out.println("**********************************************");
			while (true) {
				System.out.println("Do you want to register another employee (Y/N)?");
				choice = sc.next().charAt(0);
				if (choice == 'Y' || choice == 'N') {
					break;
				} else {
					System.out.println("Choice should be Y or N!");
					sc.nextLine();
				}
			}
			sc.nextLine();

			// Choice N output
			if (choice == 'N') {
				for (int i = 0; i < employees.size(); i++) {
					Employee emp = employees.get(i);

					// Display Employees details
					System.out.println((i + 1) + ". " + emp.getEmpName() + ", " + emp.getEmpId() + ", "
							+ emp.getWorkType() + ", " + "$" + emp.getWage() + "," + "$" + emp.getTaxWage());

					// Count Temporary , Contract and Full Time Employees
					if (emp.getWorkType() == 'T') {
						countTemp++;
					} else if (emp.getWorkType() == 'C') {
						countCon++;
					} else if (emp.getWorkType() == 'F') {
						countFull++;
					}

					// Calculate wage before Tax
					totalWage = totalWage + emp.getWage();

					// Calculate total wage after Tax
					totalTaxWage = totalTaxWage + emp.getTaxWage();

				}
				System.out.println("Total employees: " + employees.size());
				System.out.printf("Work types: (%d) Temporary, (%d) Contract, (%d) Full-time", countTemp, countCon,
						countFull).println();
				System.out.println("Total wages before tax:$" + totalWage);
				System.out.println("Total wages After tax:$" + totalTaxWage);
				break;
			}
		}

	}

	// calculate wage based on work type
	public static double calculateTaxWage(char workType, double wage) {
		double taxWage = 0;
		if (workType == 'T') {
			taxWage = wage - (wage * 15 / 100);
		} else if (workType == 'C') {
			taxWage = wage - (wage * 18 / 100);
		} else if (workType == 'F') {
			double benifits = wage * 10 / 100;
			taxWage = wage - (wage * 20 / 100) - benifits;

		}
		return taxWage;
	}

}
