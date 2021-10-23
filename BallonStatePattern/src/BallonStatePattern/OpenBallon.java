package BallonStatePattern;

public class OpenBallon implements State {
	
	public OpenBallon() {
		this.open();
	}

	@Override
	public void locked() {
		 
		
	}

	@Override
	public void open() {
	 
		System.out.pBallonrintln("Ballon Opened ");
		
	}

	@Override
	public void close() {
		 
		
	}

}
