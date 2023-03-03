package employeePayRoll;

import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		char choice = 'Y', workType;
		double totalWage = 0, totalTaxWage = 0, taxWage = 0, wage;
		int countTemp = 0, countCon = 0, countFull = 0, empId;
		String empName;
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		do {
			// Reading inputs
			while (true) {
				try {
					System.out.println("Please enter the employee’s name?");
					empName = sc.nextLine();
					Validator.validateName(empName);
					break;
				} catch (InvalidNameException e) {
					System.out.println(e);
				}
			}

			while (true) {
				try {
					System.out.println("Please enter the employee’s ID?");
					empId = sc.nextInt();
					Validator.validateId(empId);
					break;
				} catch (InvalidIdException e) {
					System.out.println(e);
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}

			}
			System.out.println("Please enter the employee’s work type (T,C,F) only?");
			workType = sc.next().charAt(0);

			while (true) {
				try {
					System.out.println("Please enter the employee’s wage?");
					wage = sc.nextDouble();
					Validator.validateWage(wage, workType);
					break;
				} catch (InvalidWageException e) {
					System.out.println(e);
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}

			// create instance of class
			Employee employee = new Employee(empName, empId, workType, wage);
			employees.add(employee);
			taxWage = calculateTaxWage(workType, wage);
			employee.setTaxWage(taxWage);
			System.out.println("Employee’s wage after tax:" + taxWage);
			System.out.println("**********************************************");
			System.out.println("Do you want to register another employee (Y/N)?");
			choice = sc.next().charAt(0);
			sc.nextLine();

		} while (choice == 'Y' || choice == 'y');

		// loop employee array and count work type also calculate total wage before tax
		// and total wage after tax
		for (int i = 0; i < employees.size(); i++) {
			Employee emp = employees.get(i);
			System.out.println((i + 1) + ". " + emp.getName() + ", " + emp.getEmpId() + ", " + emp.getWorkType() + ", "
					+ "$" + emp.getWage() + "," + "$" + emp.getTaxWage());
			if (emp.getWorkType() == 'T')
				countTemp++;
			else if (emp.getWorkType() == 'C')
				countCon++;
			else if (emp.getWorkType() == 'F')
				countFull++;
			totalWage = totalWage + emp.getWage();
			totalTaxWage = totalTaxWage + emp.getTaxWage();

		}
		sc.close();
		// option N output in console
		System.out.println("Total employees: " + employees.size());
		System.out.printf("Work types: (%d) Temporary, (%d) Contract, (%d) Full-time", countTemp, countCon, countFull)
				.println();
		System.out.println("Total wages before tax:$" + totalWage);
		System.out.println("Total wages After tax:$" + totalTaxWage);

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
