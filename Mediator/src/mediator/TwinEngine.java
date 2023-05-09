package mediator;

public class TwinEngine {
	private IMediator mediator;
	private String operation;
	
	public TwinEngine(IMediator mediator) {
		this.mediator = mediator;
	}
	
	public TwinEngine() {
		
	}
	
	public void twinEngineOperation() {
		this.operation = "Bi-motor pode pousar";
		System.out.println("Bi-motor se preparando para pousar");
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
