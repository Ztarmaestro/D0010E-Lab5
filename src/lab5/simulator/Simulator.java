package lab5.simulator;

public class Simulator {
	
	private SimState state;
	private SimView view;
	private EventQueue events;
	
	public Simulator(SimState state, SimView view) {
		this.state = state;
		this.view = view;
		this.events = new EventQueue();
	}
}
