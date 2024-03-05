package app;

import model.Banco;
import model.Usuario;
import view.Mensagens;

public class Main {
	
	public static void main (String[] args) {
       
		Mensagens mensagem = new Mensagens();
	
		String Nome, CPF, Celular, Email, Senha;
		String opcao;
		int opcaoNum;
		
	mensagem.mostrarInformacao("Seja Bem vindo");
	
	do {
		opcao = mensagem.solicitarEntrada("Sistema Bancário"
		+ "\nDigite a opção desejada"
		+ "\n1. Cadastrar Banco"
		+ "\n2. Cadastrar Usuário"
		+ "\n3. Sair"
		);
		
		opcaoNum = Integer.parseInt(opcao);
		switch(opcaoNum) {
		case 1:
			String nomeBanco;
			nomeBanco = mensagem
					 .solicitarEntrada("Digite o nome do Banco");
					 Banco novoBanco = new Banco(nomeBanco);
					 mensagem.mostrarMensagemDeSucesso(
							 "Banco Cadastrado com sucesso"
							 + novoBanco.getBanco()
							 );
					 
			break;
		case 2:
	Nome = mensagem.solicitarEntrada("Digite o seu Nome");
	CPF = mensagem.solicitarEntrada("Digite o seu CPF");
	Celular = mensagem.solicitarEntrada("Digite o seu Celular");
	Email = mensagem.solicitarEntrada("Digite o seu Email");
	Senha = mensagem.solicitarEntrada("Digite a sua Senha");
	opcao = mensagem.solicitarEntrada("Digite a Opção");
	Usuario usuario = new Usuario(Nome, CPF, Celular, Email, Senha);
	mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
	opcao = "ok";
	break;
	
		case 3:
		System.exit(0);
		break;
		
		}


 }while(opcaoNum == 3);
	
	
   }	
	

}	