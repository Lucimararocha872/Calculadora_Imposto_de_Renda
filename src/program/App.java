package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		List<TaxPayer> list = new ArrayList<>();
		int N = 2;
		double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending;
		
		System.out.print("Informe a quantidade de contribuintes: ");
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Digite os dados do " + (i+1) + "º contribuinte: ");
			
			System.out.print("Renda anual com salário: R$ ");
			salaryIncome = sc.nextDouble();
			
			System.out.print("Renda com prestação de serviços: R$ ");
			servicesIncome = sc.nextDouble();
			
			System.out.print("Renda anual com ganho de capital: R$ ");
			capitalIncome = sc.nextDouble();
			
			System.out.print("Gastos médicos: R$ ");
			healthSpending = sc.nextDouble();
			
			System.out.print("Gastos educacionais: R$ ");
			educationSpending = sc.nextDouble();
			
			TaxPayer taxpayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			
			list.add(taxpayer);
			
		}
		
		for(int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Resumo do " + (i+1) + "º contribuinte: ");
			
			
			System.out.printf("Imposto bruto total: R$ %.2f%n", list.get(i).grossTax());
			System.out.printf("Abatimento: R$ %.2f%n ", list.get(i).taxRebate());
			System.out.printf("Imposto devido: R$ %.2f%n", list.get(i).netTax());			
		}
	
		
		
		sc.close();

	}

}
