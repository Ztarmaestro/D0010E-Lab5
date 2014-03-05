package lab5;

import lab5.simulator.CarWashState;
import lab5.simulator.CarWashView;
import lab5.simulator.Simulator;

public class SimMain {

	public static void main(String[] args) {
		CarWashState cws = new CarWashState();
		new Simulator(cws, new CarWashView(cws));
	}

}
