package iHoover;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import iHoover.Core;

public class HooverTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@Before
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}

	@After
	public void restoreStreams() {
	    System.setOut(standardOut);
	}
	
	@Test
	public void testInTechnicalTest() {
		String[] args = { "10",
				"10",
				"5",
				"5",
				"N",
				"DADADADAA"};
		Core.main(args);
		assertEquals("x=5 y=6 orientation=N", outputStreamCaptor.toString().trim());
	}

	@Test
	public void testTwo() {
		String[] args = { "10",
				"10",
				"5",
				"5",
				"N",
				"GAGAGAGAA"};
		Core.main(args);
		assertEquals("x=5 y=6 orientation=N", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testTree() {
		String[] args = { "10",
				"10",
				"5",
				"5",
				"N",
				"AADAA"};
		Core.main(args);
		assertEquals("x=7 y=7 orientation=E", outputStreamCaptor.toString().trim());
	}
}
