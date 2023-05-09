package mediator;

public class Plane {
	private IMediator mediator;
	private String operation;
	
	public Plane(IMediator mediator) {
		this.mediator = mediator;
	}
	
	public Plane() {
		
	}
	
	public void planeOperation() {
		this.operation = "Avião pode pousar";
		System.out.println("Avião se preparando para pousar");
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
