package assignmentpackage;

public class EmployeeSalary extends EmployeeInput {
	
	public double hra;
	public double pf;
	
	public void calculateSalary()
	{
        hra = 0.05 * basicPay; // HRA is 5% of basic pay
        pf = 0.20 * basicPay;  // PF is 20% of basic pay
    }
}


