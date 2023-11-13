package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta {

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Robson Vaamonde");
		cc3.setSaldo(9000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
		System.out.println("--------------------");
		SeguroPessoaFisica cc4 = new SeguroPessoaFisica();
		cc4.setCliente("Sirlen Sanches");
		cc4.setSaldo(8500);
		System.out.println("Cliente: " + cc4.getCliente());
		cc4.exibirSaldo();

	}

}
