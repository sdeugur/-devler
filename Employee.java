
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() {
		if (this.salary > 1000) {
			return (this.salary * 0.03);
		} else {
			return 0;
		}

	}

	public int bonus() {
		if (workHours > 40) {
			return ((workHours - 40) * 30);
		} else {
			return 0;
		}
	}

	public double raiseSalary() {

		if (2021 - this.hireYear < 10) {
			return (this.salary * 0.05);
		} else if (this.hireYear == 10 && this.hireYear < 20) {
			return (this.salary * 0.1);
		} else {
			return (this.salary * 0.15);
		}
	}

	void printInfo() {
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma saati: " + this.workHours);
		System.out.println("Başlangıç yılı: " + this.hireYear);
		System.out.println("vergi: " + this.tax());
		System.out.println("Bonus: " + this.bonus());
		System.out.println("Maaş artışı: " + this.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary + this.bonus() - this.tax()));
		System.out.println("Toplam maaş: " + (this.salary + this.bonus() - this.tax() + this.raiseSalary()));
	}
}