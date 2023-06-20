package main;

public class Main {
	public static void main(String[] args) {
		Produto product = new Produto(1, "Panela elétrica");
		ProcessamentoPedido.processOrder(product);	
	}
}