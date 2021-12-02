package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.aula9.excecao.MeuControleExcecao;

public class ExecutarExcecoesComClasse {

	public static void main(String[] args) throws MeuControleExcecao {
		Scanner leitor = new Scanner(System.in);
		
		int valor1, valor2 = 0;
		try {
		System.out.println("Digite o valor 1: ");
		valor1 = leitor.nextInt();
		System.out.println("Digite o valor 2: ");
		valor2 = leitor.nextInt();
		
		if (valor1 == 0) {
			throw new Exception("N�o � permitido o valor " + valor1);
		}
		System.out.println("Divis�o: " + (valor1 / valor2));

	} catch (InputMismatchException ex) {
		System.out.println("Voc� digitou uma letra no lugar de n�mero.");
		
	} catch (Exception ex) {
	  throw new MeuControleExcecao("Erro no valor ", ex);	
	}
	}
}
