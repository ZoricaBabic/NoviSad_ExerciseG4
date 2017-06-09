import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		
		int s=0;
		
		for(int i = 0; i<frames.size(); i++){
			
			if(frames.get(i).isStrike() == true && frames.get(i+1).isStrike() == false){
				
				s = s+frames.get(i).score() + frames.get(i+1).score();
				
			}else if(frames.get(i).isStrike() == true && frames.get(i+1).isStrike() == true){
				
				s = s + frames.get(i).score() + frames.get(i+1).score() + frames.get(i+2).getFirstThrow();
				
				
			}else if(frames.get(i).isSpare() == true && frames.get(i+1).isSpare() == false){
				
				s = s + frames.get(i).score() + frames.get(i+1).getFirstThrow();
				
			}else {
				
				s = s + frames.get(i).score();
			}
					
					
					
			
			
		}
		
		return s;
	}
}
