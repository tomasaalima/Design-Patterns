package mediator;

public class Jet {
	private IMediator mediator;
	private String operation;
	
	public Jet(IMediator mediator) {
		this.mediator = mediator;
	}
	
	public Jet() {
		
	}
	
	public void jetOperation() {
		this.operation = "Jato pode pousar";
		System.out.println("Jato se preparando para pousar");
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
