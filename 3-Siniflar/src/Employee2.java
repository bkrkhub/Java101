
public class Employee2 {

	private String name;
	public double salary;
	private int workHour,hireYear;
	
	// Bu değerleri dışarıdan girmeyeceğimiz ve constructor method ile alacağımız için nesneler private oldu.
	// Dışarıdan extra bir değiştirme yapmayacağım.
	
	
	Employee2(int hireYear, int workHour, double salary, String name) {
		this.name = name;
		this.salary = salary;
		this.workHour = workHour;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		
		if(this.salary >= 1000) {
			return this.salary * 0.03;
		} else {
			return 0.0;
		}
	}
	
	public double bonus() {
		int extraHours = workHour - 40;
		if(extraHours > 0) {
			return 30 * extraHours;
		}
		return 0.0;
	}
	
	public double increase() {
		int workYear = 2020- this.hireYear;
		if(workYear < 10) {
			return this.salary * 0.05;
		}else if(workYear >= 10 && workYear < 20){
			return salary * 0.10;
		}else {
			return salary * 0.15;
		}
	}
	
	public void toString(Employee2 emp) {
		
		// String methodlar her zaman void'dir.
		System.out.println("Tax: " + emp.tax());
		System.out.println("Bonus: " + emp.bonus());
		System.out.println("Increase Salary: " + emp.increase());
		System.out.println("Increase Salary: " + emp.increase());
		double totalSalary = emp.salary - emp.tax() + emp.bonus();
		System.out.println("Total Salary with Tax and Bonus: " + totalSalary);
		System.out.println("Total Salary with the Raise of Salary: " + (emp.salary + emp.increase()));
		
	}
	
	
}
