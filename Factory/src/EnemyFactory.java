
public class EnemyFactory {
	
	public Enemy createEnemy(EnemyType enemyType) {
		if (enemyType.equals(enemyType.MutantAnimal)) {
			return new MutantAnimal();
		} else if (enemyType.equals(enemyType.Cangaceiro)) {
			return new Cangaceiro();
		} else if (enemyType.equals(enemyType.Criminal)) {
			return new Criminal();
		}
		throw new IllegalArgumentException("Inimigos não avistados");
	}
}
