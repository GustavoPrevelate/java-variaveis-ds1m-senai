package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		double juros, capital, taxa, tempo, total;
		Scanner leitor;
		
		leitor = new Scanner(System.in);
		
		System.out.print("Qual é o capital? ");
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa de juro? ");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = (capital * taxa * tempo) / 100;
		
		total = juros + capital;
		
		System.out.println("O valor do juros é: " + juros);
				
		System.out.printf("você terá que pagar %s", total);

	}
}
