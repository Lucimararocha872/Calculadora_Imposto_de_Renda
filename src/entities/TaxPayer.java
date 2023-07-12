package entities;

public class TaxPayer {

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer() {
		
	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double salaryTax = salaryIncome / 12;
		
		if(salaryTax < 3000.00) {
			return 0;
		}
		else if(salaryTax >= 3000.00 && salaryTax <= 5000.00) {
			return salaryIncome * 0.10;
		}
		else{
			return salaryIncome * 0.20;
		}
	}
		
	public double servicesTax() {
		return servicesIncome * 0.15;
	}

	public double capitalTax() {
		return capitalIncome * 0.2;
	}
	
	public double grossTax() {
		return salaryTax() + capitalTax() + servicesTax();
	}
	
	public double taxRebate() {
		double incomes = healthSpending + educationSpending; 
		double rebate = grossTax() * 0.3;
		double taxRebate = grossTax() - (grossTax() * 30) / 100;
		if (incomes > grossTax()) {
			return rebate;
		}
			taxRebate = healthSpending + educationSpending;
			return taxRebate;
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	
	
	
}
