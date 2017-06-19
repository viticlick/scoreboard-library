package es.viticlick.scoreboard;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestCounter {

	Counter counter;
	
	@Before
	public void init(){
		counter = Counter.create();
	}
	
	@Test
	public void testAddToCounter(){
		counter = counter.add(5);
		counter = counter.add(3);
		assertThat(counter.value(), is(8));
	}
	
	@Test
	public void testSubstractionToCounter(){
		counter = counter.add(5);
		counter = counter.substract(2);
		assertThat(counter.value(), is(3));
	}
	
	@Test
	public void testCreateCouterOf(){
		assertThat(Counter.of(4).value(), is(4));
	}
}
