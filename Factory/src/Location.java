import java.util.ArrayList;
import java.util.List;

public abstract class Location {
	private String description;
	private EnemyFactory enemyFactory = new EnemyFactory();
	
	public String getDescription() {
		return this.description;
	};
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public EnemyFactory getFactory() {
		return this.enemyFactory;
	}
	
	public abstract List<Enemy> generateEnemies();
}

class Amazon extends Location {
	public Amazon() {
		setDescription("Você entrou em um terreno localizado na Amazônia");
		System.out.println(getDescription());
	}

	@Override
	public List<Enemy> generateEnemies() {
		List<Enemy> temp = new ArrayList<Enemy>();
		
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		
		// TODO Auto-generated method stub
		for (int i = 0; i <= (Math.random() * range) + min; i++) {
			temp.add(getFactory().createEnemy(EnemyType.MutantAnimal));
			temp.get(i).attack();
		}
		
		return temp;
	}
}

class Hinterland extends Location {
	public Hinterland() {
		setDescription("Você entrou em um terreno localizado no Sertão Brasileiro");
		System.out.println(getDescription());
	}
	
	@Override
	public List<Enemy> generateEnemies() {
		List<Enemy> temp = new ArrayList<Enemy>();
		
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		
		// TODO Auto-generated method stub
		for (int i = 0; i <= (Math.random() * range) + min; i++) {
			temp.add(getFactory().createEnemy(EnemyType.Cangaceiro));
			temp.get(i).attack();
		}
		
		return temp;
	}
}

class RioDeJaneiro extends Location {
	public RioDeJaneiro() {
		setDescription("Você entrou em um terreno localizado no Rio de Janeiro");
		System.out.println(getDescription());
	}
	
	@Override
	public List<Enemy> generateEnemies() {
		List<Enemy> temp = new ArrayList<Enemy>();
		
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		
		// TODO Auto-generated method stub
		for (int i = 0; i <= (Math.random() * range) + min; i++) {
			temp.add(getFactory().createEnemy(EnemyType.Criminal));
			temp.get(i).attack();
		}
		
		return temp;
	}
}

