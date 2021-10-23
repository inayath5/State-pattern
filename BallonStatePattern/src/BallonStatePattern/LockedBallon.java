package BallonStatePattern;

public class LockedBallon implements State {
	
	LockedBallon(){
		locked();
	}
Ballon
	@Override
	public void locked() {
		 
		System.out.println("Ballon locked ");
		
	}

	@Override
	public void open() {
		 
		
	}

	@Override
	public void close() {
		 
		
	}

}
