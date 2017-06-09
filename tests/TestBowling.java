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

}
