package model;

public class Configuracao {

	private String email;
	private String senha;
	private String NomeUsuario;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNomeUsuario() {
		return NomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		NomeUsuario = nomeUsuario;
	}
	@Override
	public String toString() {
		return "Configuracao [email=" + email + ", senha=" + senha + ", NomeUsuario=" + NomeUsuario + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

