package br.com.aula9.excecao;

public class MeuControleExcecao extends Exception {
	
	public MeuControleExcecao(String msg, Exception e) {
		super(msg, e);
		// Agora � minha implementa��o
		System.out.println("========== Meu Exception ==========");
		System.out.println(msg);
				
	}

}
