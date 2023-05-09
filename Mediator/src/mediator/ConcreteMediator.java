package mediator;

public class ConcreteMediator implements IMediator{
	private Helicopter helicopter;
	private Jet jet;
	private Plane plane;
	private TwinEngine twinEngine;
	private String airstrip = "livre";
	
		
	public ConcreteMediator(Helicopter helicopter, Jet jet, Plane plane, TwinEngine twinEngine) {
		this.helicopter = helicopter;
		this.jet = jet;
		this.plane = plane;
		this.twinEngine = twinEngine;
		
		helicopter.setMediator(this);
		jet.setMediator(this);
		plane.setMediator(this);
		twinEngine.setMediator(this);
	}

	public void communicate(String whisper) {
		if (whisper == "pedindo autorização para pousar" && airstrip == "livre") {
			System.out.println("Você tem permissão pra pousar");
		} else if (whisper == "pouso realizado com sucesso") {
			System.out.println("Pista liberada");
			setAirstrip("livre");
		} else {
			System.out.println("Pista ocupada");
		}
	}
	
	public String getAirstrip() {
		return airstrip;
	}

	public void setAirstrip(String airstrip) {
		this.airstrip = airstrip;
	}

	public void reactOnHelicopter() {
		if (airstrip == "livre") {
			helicopter.helicopterOperation();
			setAirstrip("Pista ocupada");
		} else {
			System.out.println("Pista de pouso ocupada");
		}
	}
	public void reactOnJet() {
		if (airstrip == "livre") {		
			jet.jetOperation();
			setAirstrip("Pista ocupada");
		} else {
			System.out.println("Pista de pouso ocupada");
		}
	}
	public void reactOnPlane() {
		if (airstrip == "livre") {			
			plane.planeOperation();
			setAirstrip("Pista ocupada");
		} else {
			System.out.println("Pista de pouso ocupada");
		}
	}
	public void reactOnTwinEngine() {
		if (airstrip == "livre") {		
			twinEngine.twinEngineOperation();
			setAirstrip("Pista ocupada");
		} else {
			System.out.println("Pista de pouso ocupada");
		}
	}
}
