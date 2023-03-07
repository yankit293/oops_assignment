package employeePayRoll;

public class Validator {

	// validate name
	public static boolean validateName(String empName) {

		if (empName.length() < 5) {
			System.out.println("Employee name cannot be less than 5 characters!");
			return false;
		} else if (!(empName.trim().contains(" "))) {
			System.out.println("Employee name must have at least one space!");
			return false;
		}
		return true;
	}

	// validate ID
	public static boolean validateId(int empId) {
		if (empId < 0) {
			System.out.println("Employee ID must be a positive integer!");
			return false;
		}

		return true;

	}

	public static boolean validateWorkType(char workType) {
		if (workType == 'T' || workType == 'C' || workType == 'F') {
			return true;
		} else {
			System.out.println("Wpork Type can only be (T, C, F)!");
			return false;
		}
	}

	// validate Wage
	public static boolean validateWage(double wage, char workType) {
		if (workType == 'T') {
			if (wage > 90) {
				System.out.println("The hourly pay cannot exceed 90.00 but can be 0!");
				return false;
			}
		} else if (workType == 'C') {
			if (wage < 1000 || wage > 3500) {
				System.out.println("The bi-weekly pay cannot be below 1000.00 or more than 3500.00!");
				return false;
			}
		} else if (workType == 'F') {
			if (wage < 3000) {
				System.out.println("The monthly pay cannot be less than 3000.00!");
				return false;
			}
		}
		return true;
	}
}
