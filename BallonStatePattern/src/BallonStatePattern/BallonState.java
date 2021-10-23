package BallonStatePattern;

public class BallonState {
	
	private State state;

	public State getState() {
		return state;BBallonallon
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void lockedState() {
		
	 state = new LockedBallon();
		
	}
	
	public void openState() {
		state =  new OpenBallon();
	}
	
	public void closeState() {
		state =  new CloseBallon();
	}

}
