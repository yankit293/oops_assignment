package employeePayRoll;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetUserInput {

	public String getEmpNameInput(Scanner sc) {
		while (true) {
			try {
				System.out.println("Please enter the employee’s name?");
				String empName = sc.nextLine();
				if (Validator.validateName(empName)) {
					return empName;
				}

			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
		}

	}

	public int getEmpIdInput(Scanner sc) {

		while (true) {
			try {
				System.out.println("Please enter the employee’s ID?");
				int empId = sc.nextInt();
				if (Validator.validateId(empId))
					return empId;
			} catch (InputMismatchException e) {
				System.out.println("Employee Id must be number only!");
				sc.nextLine();

			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			}

		}
	}

	public char getWorkTypeInput(Scanner sc) {
		while (true) {
			try {
				System.out.println("Please enter the employee’s work type (T,C,F) only?");
				char workType = sc.next().charAt(0);
				if (Validator.validateWorkType(workType))
					return workType;
			} catch (InputMismatchException e) {
				System.out.println("Employee Work Type must be Character only!");
				sc.nextLine();

			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			}

		}
	}

	public double getWageInput(Scanner sc, char workType) {
		while (true) {
			try {
				System.out.println("Please enter the employee’s wage?");
				double wage = sc.nextDouble();
				if (Validator.validateWage(wage, workType))
					return wage;
			} catch (InputMismatchException e) {
				System.out.println("Employee Wage must be number only!");
				sc.nextLine();

			} catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			}
		}
	}
}
