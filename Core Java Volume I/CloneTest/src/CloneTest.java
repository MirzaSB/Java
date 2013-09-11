import java.util.*;

/**
 * This program demonstrates cloning
 */

public class CloneTest {
	
	public static void main (String[] args) {
		
		try {
			Employee original = new Employee("John Q. Public", 50000);
			original.setHireDay(2000, 01, 01);
			Employee copy = original.clone();
			copy.raiseSalary(10);
			copy.setHireDay(2002, 12, 31);
			System.out.println("Original: " + original);
			System.out.println("Copy: " + copy);
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class Employee implements Cloneable {
	
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		hireDay = new Date();
	}
	
	public Employee clone() throws CloneNotSupportedException {
		
		//call Object.clone()
		Employee cloned = (Employee) super.clone();
		
		//clone mutable fields
		cloned.hireDay = (Date) hireDay.clone();
		
		return cloned;
	}
	
	/**
	 * Set the hire day to a given date
	 * @param year of the year of the hire day
	 * @param month the month of the hire day
	 * @param day of the day of the hire day
	 */
	
	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month-1, day).getTime();
		
		//Example of instance field mutation
		hireDay.setTime(newHireDay.getTime());
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String toString() {
		return "Employee[Name: " + name + " | " + "Salary: " + salary + " | " + "Date of Hire: " + hireDay + "]";
	}
}