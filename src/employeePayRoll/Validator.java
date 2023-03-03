package employeePayRoll;

class InvalidNameException extends Exception {

	public InvalidNameException(String str) {
		super(str);
	}
}

class InvalidIdException extends Exception {
	public InvalidIdException(String str) {
		super(str);
	}
}

class InvalidWageException extends Exception {
	public InvalidWageException(String str) {
		super(str);
	}
}

public class Validator {

	// validate name
	public static void validateName(String empName) throws InvalidNameException {

		if (!(empName.length() > 5)) {
			throw new InvalidNameException("Employee name cannot be less than 5 characters!");
		} else if (!(empName.trim().contains(" "))) {
			throw new InvalidNameException("Employee name must have at least one space!");
		}
	}

	// validate ID
	public static void validateId(int empId) throws InvalidIdException {
		if (empId < 0) {
			throw new InvalidIdException("Employee ID must be a positive integer!");
		}

	}

	// validate Wage
	public static void validateWage(double wage, char workType) throws InvalidWageException {
		if (workType == 'T') {
			if (wage > 90) {
				throw new InvalidWageException("The hourly pay cannot exceed 90.00 but can be 0!");
			}
		} else if (workType == 'C') {
			if (wage < 1000 || wage > 3500) {
				throw new InvalidWageException("The bi-weekly pay cannot be below 1000.00 or more than 3500.00!");
			}
		} else if (workType == 'F') {
			if (wage < 3000) {
				throw new InvalidWageException("The monthly pay cannot be less than 3000.00!");
			}
		}
	}
}
