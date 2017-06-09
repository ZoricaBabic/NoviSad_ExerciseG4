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

}
