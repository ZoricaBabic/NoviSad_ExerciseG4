public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}

	public Frame(){
		
		
	}
	
	public Frame(int firstThrow, int secondThrow, int thirdThrow) throws BowlingException{
		
		throw new BowlingException();
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}
	
	

	//returns the score of a single frame
	public int score(){
		
		return firstThrow + secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		
		if(firstThrow == 10){
			
			return true;
		}
		return false;
	}
	
	public void loops(int count,int firstThrow, int secondThrow){
		
		for(int i=0; i<count; i++){
			
			BowlingGame game = new BowlingGame();
			game.addFrame(new Frame(firstThrow,secondThrow));
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		
		if(firstThrow + secondThrow == 10){
			
			return true; 
		}
		return false;
	}
}
