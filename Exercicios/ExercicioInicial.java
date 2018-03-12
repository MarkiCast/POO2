// Aula 1

package Exercicios;

public class ExercicioInicial {

}

class Cliente {
}

class Conta {
	void imprimir() {
	}

	void depositar(double qtia) {
	}

	void sacar(double qtia) {
	}

	double saldo() {
	}

}

class Banco {
	void abrirConta(Cliente cliente) {
	}

	// Abrir uma conta para um cliente
	Conta conta(Cliente cliente) {
	}

	// retorna a conta do cliente
	Conta[] contas() {
	}
	// retorna a lista das contas abertas no banco
}

class Sistema {
	private Banco banco;

	// item a: depositar uma quantia na conta do cliente
	void depositarEmConta(Cliente cliente, double quantia) {
		banco.conta(cliente).depositar(quantia);
	}

	// item b: sacar uma quantia da conta do cliente
	// se o saldo for suficiente
	void sacarDaConta(Cliente cliente, double quantia) {
		if (banco.conta(cliente).saldo() >= quantia) {
			banco.conta(cliente).sacar(quantia);
		}
	}

	// item c: imprimir todas as contas do banco
	void imprimirTodas() {
		for (int i = 0; i < banco.contas().length; i++) {
			banco.contas()[i].imprimir();
		}
	}
}
