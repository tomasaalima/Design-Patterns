package mediator;

public class Helicopter {
	private IMediator mediator;
	private String operation;
	
	public Helicopter(IMediator mediator) {
		this.mediator = mediator;
	}
	
	public Helicopter() {
		
	}
	
	public void helicopterOperation() {
		this.operation = "Helicóptero pode pousar";
		System.out.println("Helicóptero se preparando para pousar");
	}

	public IMediator getMediator() {
		return mediator;
	}

	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
}
