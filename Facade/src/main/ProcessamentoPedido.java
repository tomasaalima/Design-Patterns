package main;

public class ProcessamentoPedido {
	public static void processOrder(Produto product) {
		if (ServicoEstoque.isAvaliable(product)) {
			System.out.println("Produto disponível");
			if (ServicoPagamento.makePayment()) {
				System.out.println("Pagamento realizado");
				ServicoRemessa.shipProduct(product.name);
			} else 
				System.out.println("Pagamento pendente");		
		} else 
			System.out.println("Produto indisponível");		
	}
}
