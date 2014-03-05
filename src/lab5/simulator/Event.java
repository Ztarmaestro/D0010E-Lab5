package lab5.simulator;

public abstract class Event {
	
	private double arrivalTime;
	private int eventID;
	private String eventName;
	
	public boolean compare(Event e) {
		if (this.arrivalTime < e.arrivalTime) {
			return true;
		}
		return false;
	}
	
	public double getArrivalTime() {
		return arrivalTime;
	}
	
	public int getEventID() {
		return eventID;
	}
	
	public String getEventName() {
		return eventName;
	}
	
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	
	public abstract void execute();

}
