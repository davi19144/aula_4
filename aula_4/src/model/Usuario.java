package model;

public class Usuario {
public String Nome, CPF, Celular, Email, Senha;

private boolean EstaLogado= false;

 public Usuario (String Nome, String CPF, String Celular, String Email, String Senha) {
	this.Nome = Nome;
	this.CPF = CPF;
	this.Celular = Celular;
	this.Email = Email;
	this.Senha = Senha;
  }

void autenticacao (String Email,String Senha) {
	if (this.Email == Email
			&& this.Senha == Senha) {
		EstaLogado = true;
  }
}
public String getUsuario() {
	return (
			"\nNome" + this.Nome
			+"\nCPF" + this.CPF
			+"\nCelular" + this.Celular
			+"\nEmail" + this.Email
			+"\nSenha" + this.Senha
			+"\nEstaLogado" + this.EstaLogado
			);			
 }

}
