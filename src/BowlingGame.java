import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 21:00
// Student ID: IT21/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	

	private Frame bonus=new Frame(0,0);
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		Frame frame = new Frame(firstThrow, secondThrow);
		if(frame.isStrike() == true){
			
			addFrame(bonus);
		} else if(frame.isSpare() == true){
			
			addFrame(bonus);
		}
		

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
				
			} else if(frames.get(i).isSpare() == true && frames.get(i+1).isSpare() == true){
				
				s = s + frames.get(i).score() + frames.get(i+1).getFirstThrow() + frames.get(i+1).score() + frames.get(i+2).getFirstThrow();
				
				
			}else {
				
				s = s + frames.get(i).score();
			}
					
					
					
			
			
		}
		
		return s;
	}
	
	
	
	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public Frame getBonus() {
		return bonus;
	}

	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}
}
