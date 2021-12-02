package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExecutarExcecoes {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		/*
		try {
			
		System.out.println("Digite o valor 1: ");
		int valor1 = leitor.nextInt();
		System.out.println("Digite o valor 2: ");
		int valor2 = leitor.nextInt();
		
		System.out.println("Soma: " + (valor1 + valor2));
		
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Você digitou algo errado...!");
			ex.printStackTrace();
			System.out.println("Log: Classe de erro = " + ex.getClass());
			
		}	
	
		
		*/
		
/*		String senha = "Java";
		
		try {
			System.out.println("Digite a palvra secreta: ");
			String palavraSecreta = leitor.nextLine();
			
			if (!senha.equalsIgnoreCase(palavraSecreta)) {
				throw new Exception("Palavra errada!");	
				
			}
			System.out.println("Senha correta, liberado.");
			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		} */
		
		// Utilizando outros tipos de Exception
		int valor1, valor2 = 0;
		try {
			
			System.out.println("Digite o valor 1: ");
			valor1 = leitor.nextInt();
			System.out.println("Digite o valor 2: ");
			valor2 = leitor.nextInt();
			
			if (valor1 == 0) {
			throw new Exception("Não é permitido o valor " + valor1);
			}
			
			System.out.println("Divisão: " + (valor1 / valor2));
			
		} catch (InputMismatchException ex) {
			System.out.println("Não é permitido digitar letras...!");
			
		} catch (ArithmeticException ex) {
			System.out.println("O valor " + valor2 + " deve ser > que zero...! ");	
			
	    } catch (Exception ex) {				
				JOptionPane.showMessageDialog(null, "Você digitou algo errado...!");
				System.out.println(ex.getMessage());
				
			}	
	}
	
}
