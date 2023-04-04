import java.util.ArrayList;
import java.util.List;

public class Game {
	public static void main(String[] args) {
		Location location;
		List<Enemy> enemies = new ArrayList<Enemy>();
		
		location = new Amazon();
		enemies = location.generateEnemies();
		
		location = new Hinterland();
		enemies = location.generateEnemies();
		
		location = new RioDeJaneiro();
		enemies = location.generateEnemies();
	}
}
