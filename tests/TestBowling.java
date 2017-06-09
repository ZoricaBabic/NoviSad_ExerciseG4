import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		
		Frame frame = new Frame();
		assertNotNull(frame);
	}
	
	@Test
	public void testFrame1(){
		
		Frame frame = new Frame(2,3);
		assertEquals(5,frame.score());
	}
	
	@Test
	public void testFrame2(){
		
		Frame frame = new Frame(10,0);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void testFrame3(){
		
		Frame frame = new Frame(5,5);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void testGame(){
		
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(5,3);
		game.addFrame(frame);
		assertEquals(8, game.score());
	}
	
	@Test
	public void testGame1(){
		
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(1,4);
		Frame frame1 = new Frame(4,5);
		assertEquals(9,game.score());
	}

}
