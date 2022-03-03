package employees;

public class Employees {
	private String name;
	private int employeeNumber;
	private int hours;
	private float payPerHour;
	
	//constructor
	Employees(String name, int employeeNumber, int hours, float payPerHour){
		this.name = name;
		this.employeeNumber = employeeNumber;
		this.hours = hours;
		this.payPerHour = payPerHour;
	}
	
	//Getters and Setters
	String getName() {
		return this.name;
	}
	int getEmployeeNumber() {
		return this.employeeNumber;
	}
	int getHours() {
		return this.hours;
	}
	float getPayPerHour() {
		return this.payPerHour;
	}
	float getPayment() {
		return this.payPerHour*this.hours;
	}
	
	void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}
}
