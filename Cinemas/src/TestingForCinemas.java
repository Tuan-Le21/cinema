import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class TestingForCinemas {

	Service service = new Service();
	@Before
	public void before() {
		
		
	}
	@Test
	public void test() {
		service.generateMap();
		int expectedCount= 2;
		int actualCount = service.countGenre("Action");
		assertEquals(actualCount,expectedCount);
		
		
	}

}
