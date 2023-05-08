package command;

public class Sound implements Parameter{
	public String state;
	public int volume;
	public float frequency;
	public String cd;
	public String dvd;
	
	public Sound(String state, float frequency, int volume, String cd, String dvd) {
		this.state = state;
		this.frequency = frequency;
		this.volume = volume;
		this.cd = cd;
		this.dvd = dvd;
	}
	
	public Sound() {
		this.state = "Som desligado";
	}
	
	public String getState() {
		return state + ", Frequência: " + frequency + ", Volume: " + volume + ", CD: " + cd + ", DVD: " + dvd;
	}

	public void setState(String state) {
		this.state = state;
	}
	public void on() {
		setState("Som ligado!");
		System.out.println(state);
	}
	
	public void off() {
		setState("Som desligado!");
		System.out.println(state);
	}
	
	public void setCd(String cd) {
		setState("Carregando CD: " + cd);
		this.cd = cd;
		System.out.println(state);
	}
	
	public void setDvd(String dvd) {
		setState("Carregando DVD: " + dvd);
		this.dvd = dvd;
		System.out.println(state);
	}
	
	public void setRadio(float frequency) {
		setState("Sincronizando Rádio: " + frequency);
		this.frequency = frequency;
		System.out.println(state);
	}
	
	public void setVolume(int volume) {
		setState("Volume sincronizado: " + volume);
		this.volume = volume;
		System.out.println(state);
	}

	@Override
	public String toString() {
		return "Sound [state=" + state + ", volume=" + volume + ", frequency=" + frequency + ", cd=" + cd + ", dvd="
				+ dvd + "]";
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getChannel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

	@Override
	public float getFrequency() {
		// TODO Auto-generated method stub
		return frequency;
	}

	@Override
	public String getCd() {
		// TODO Auto-generated method stub
		return cd;
	}

	@Override
	public String getDvd() {
		// TODO Auto-generated method stub
		return dvd;
	}

	@Override
	public float getTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}
}

