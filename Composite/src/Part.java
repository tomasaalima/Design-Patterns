class Part implements Component {
	private String name;
	private double weight;
	
	public Part(String name, double weight) {
		this.name = name;
		this.weight = weight;
		System.out.printf("Adicionado: %-20s Pesando: %.2f Kg \n", name, weight);
	}

	@Override
	public double weightCalculator() {
		// TODO Auto-generated method stub
		return this.weight;
	}
}