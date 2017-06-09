public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public Frame(){
		
		
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
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}
}
