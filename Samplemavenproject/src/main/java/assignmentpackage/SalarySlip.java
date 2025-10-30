package assignmentpackage;

public class SalarySlip extends EmployeeSalary {
	
	protected double totalSalary;

    public void calculateTotalSalary() {
        // Total Salary = basicPay + hra - pf - deduction + bonus
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }
    
    public void displaySalarySlip() {
        calculateSalary();
        calculateTotalSalary();
        System.out.println("\n--- Salary Slip ---");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Deduction: " + deduction);
        System.out.println("HRA (5%): " + hra);
        System.out.println("PF (20%): " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("--------------------");
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("--------------------");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalarySlip employee = new SalarySlip();
        employee.calculateTotalSalary();
        employee.displaySalarySlip();        

	}

}
