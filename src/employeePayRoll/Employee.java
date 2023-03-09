package employeePayRoll;

public class Employee {
	/*
	 * Instance variables: • Employee Name - String • Employee ID - int • Work Type-
	 * char • Wage - double
	 */
	private String empName;
	private int empId;
	private char workType;
	private double wage;
	private double taxWage;

	public Employee(String empName, int empId, char workType, double wage) {
		this.empName = empName;
		this.empId = empId;
		this.workType = workType;
		this.wage = wage;
	}

	// setter methods to update data if needed
	public void setEmpName(String empName) { this.empName = empName; }
	public void setEmpId(int empId) { this.empId = empId; }
	public void setWorkType(char workType) { this.workType = workType; }
	public void setWage(double wage) { this.wage = wage; }
	public void setTaxWage(double taxWage) { this.taxWage = taxWage; }

	// getter methods to access the data
	public String getEmpName() { return this.empName; }
	public int getEmpId() { return this.empId; }
	public double getWage() { return this.wage; }
	public char getWorkType() { return this.workType; }
	public double getTaxWage() { return this.taxWage; }
}
