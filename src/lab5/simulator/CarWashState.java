package lab5.simulator;

public class CarWashState extends SimState{

	private int rejectedCars;
	private double idleTime;
	private double queueTime;
	
	public CarWashState() {
		
	}
	
	public double getIdleTime() {
		return idleTime;
	}
	
	public double getQueueTime() {
		return queueTime;
	}
	
	public int getRejectedCars() {
		return rejectedCars;
	}
	
}
