package br.com.aula9.implementacao;

import javax.swing.JOptionPane;

import br.com.aula9.beans.Login;

public class ExecutarLogin {

	public static void main(String[] args) {

		String usuario = JOptionPane.showInputDialog("Digite o usuário: ");
		String senha = JOptionPane.showInputDialog("Digite a senha: ");

		Login login = new Login();

		if (login.fazerLogin(usuario, senha)) {
			System.out.println("Credenciais aceitas...");

		} else {
			System.out.println("Credenciais inválidas...");
		}

	}

}
