package view;

import model.ContaCorrente;
import model.ContaPoupanca;

public class UsuarioView {
    Mensagens mensagem = new Mensagens();
    
	public void InterfaceDoUsuario() {
    	int Opcao;
    	String OpcaoSelecionada = mensagem.
    			solicitarEntrada(""
    			+ "Selecione uma opção"
    			+ "\n1 - Criar conta"
    			+ "\n2 - Fazer saque"
    			+ "\n3 - Verificar saldo");
    	
    	Opcao = Integer.parseInt(OpcaoSelecionada);
    	switch(Opcao) {
    	case 1:
    	mensagem.solicitarConfirmacao(
    			"Qual tipo de conta você deseja?"
    			+ "\n1- Conta Poupança"
    			+ "\n2- Conta Corrente");
    	
    	String EmailUsuario;
    	
    	EmailUsuario = mensagem
    			.solicitarEntrada("Digite o seu email");
    	
    			
    	if(tipoDeConta.equals("1")) {
    		ContaPoupanca conta = new ContaPoupanca(EmailUsuario, 0.01);
    	}
    	
    	if(tipoDeConta.equals("2")) {
    		ContaCorrente conta = new ContaCorrente(EmailUsuario, 2);
    	} 
    	
    		 break;
    		
    	case 2:
        break;
    }
}
