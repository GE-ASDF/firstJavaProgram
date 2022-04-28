package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Entre com o nome: ");
		String name = sc.nextLine();
		pessoa.setName(name);
		
		System.out.print("Entre com a idade: ");
		int idade = sc.nextInt();
		pessoa.setIdade(idade);
		
		System.out.print("Entre com o salário: ");
		double salario = sc.nextDouble();
		pessoa.setSalary(salario);
		
		System.out.println(pessoa);
		sc.close();

	}

}
