package mediator;

public class Main {
	public static void main(String[] args) {
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();
		Plane plane = new Plane();
		TwinEngine twinEngine = new TwinEngine();
		
		ConcreteMediator mediator = new ConcreteMediator(helicopter, jet, plane, twinEngine);
		
		helicopter.getMediator().communicate("pedindo autorização para pousar");
		mediator.reactOnHelicopter();
		helicopter.getMediator().communicate("pouso realizado com sucesso");
		
		jet.getMediator().communicate("pedindo autorização para pousar");
		
	}
}
