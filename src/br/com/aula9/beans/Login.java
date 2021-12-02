package br.com.aula9.beans;

public class Login {
	private String usuario;
	private String senha;
	
	//Construtor
	public Login() {}
	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	//Getters e Setters
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean fazerLogin (String usuario, String senha) {
		String user = "root";
		String pwd = "java";
		
		try {
		if (usuario.equalsIgnoreCase(user) && senha.equalsIgnoreCase(pwd)) {
			return true;
		}else {
			throw new Exception("Credenciais inválidas: " + usuario);
		}
		
	}catch (Exception ex) {
		System.out.println(ex.getMessage());
		return false;
	}
	}
}
