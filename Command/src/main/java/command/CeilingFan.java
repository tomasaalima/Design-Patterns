package command;

public class CeilingFan implements Parameter{
	public String state;
	private int speed;
	
	public CeilingFan(String state, int speed) {
		this.state = state;
		this.speed = speed;
	}
	
	public CeilingFan() {
		this.state = "Ventilador desligado";
	}
	
	public String getState() {
		return state + ", velocidade:" + speed;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void high() {
		setState("Ventilador no Alto!");
		System.out.println(state);
		this.speed = 80;
	}
	
	public void medium() {
		setState("Ventilador no médio!");
		System.out.println(state);
		this.speed = 50;
	}
	

	public void low() {
		setState("Ventilador no baixo!");
		System.out.println(state);
		this.speed = 20;
	}
	
	public void off() {
		setState("Ventilador desligado!");
		System.out.println(state);
		this.speed = 0;
	}
	
	public int getSpeed() {
		setState(speed + "rotações por minuto");
		System.out.println(state);
		return speed;
	}
	
	@Override
	public String toString() {
		return "CeilingFan [state=" + state + ", speed=" + speed + "]";
	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getFrequency() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDvd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

