package BallonStatePattern;

public class CloseBallon implements State {
	
	CloseBallon(){
		this.close();
	}

	@Override
	public void locked() {
		 
		
	}

	@Override
	public void open() {
		 
		
	}

	@Override
	public void close() {
		 System.out.println("Ballon closed ");
		
	}

}
