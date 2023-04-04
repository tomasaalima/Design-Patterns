
public interface Enemy {
	void attack();
}

class MutantAnimal implements Enemy {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Animal Mutante te deu uma mordida radioativa!");
	}
	
}

class Cangaceiro implements Enemy {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Cangaceiro te deu uma peixerada no bucho!");
	}
	
}

class Criminal implements Enemy {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("Criminoso levou seu celular!");
	}
	
}
