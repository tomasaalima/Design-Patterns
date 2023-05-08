package command;

public class Json {
	private String type = "teste";
	private DefaultParameter parameter;
	
	public Json() {
		
	}
	
	public Command commandTransform() {
		switch (type) {
		case "GarageDoorOpenCommand": {
			return new GarageDoorOpenCommand(new GarageDoor(parameter.getState()));
		}
		case "LightOnCommand": {
			return new LightOnCommand(new Light(parameter.getState()));
		}
		case "CeilingFanOnCommand": {
			return new CeilingFanOnCommand(new CeilingFan(parameter.getState(), parameter.getSpeed()));
			
		}
		case "TvOnCommand": {
			return new TvOnCommand(new TV(parameter.getState(), parameter.getChannel(), parameter.getVolume()));
			
		}
		case "SoundOnCommand": {
			return new SoundOnCommand(new Sound(parameter.getState(), parameter.getFrequency(), parameter.getVolume(), parameter.getCd(), parameter.getDvd()));
			
		}
		case "HottubOnCommand": {
			return new HottubOnCommand(new Hottub(parameter.getState(), parameter.getTemperature()));
			
		}
		default: {
			System.out.println("typo não reconhecido");
			break;
		}
		}
		return null;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public void setParameter(Parameter parameter) {
		this.parameter = (DefaultParameter) parameter;
	}

	@Override
	public String toString() {
		return "Json [type=" + type + ", parameter=" + parameter + "]";
	}
}
