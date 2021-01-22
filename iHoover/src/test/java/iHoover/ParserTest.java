package iHoover;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import iHoover.Core;

public class ParserTest {
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
	public void testArgumentsNumberFail() {
		String[] args = { "10",
				"10",
				"5",
				"5",
				"N"};
		Core.main(args);
		assertEquals("Error arguments problems -h can help you", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testArgumentsSequence() {
		String[] args = { "10",
				"10",
				"5",
				"5",
				"N",
				"DADADADF"};
		Core.main(args);
		assertEquals("Error : Hoover's direction incorrect you can only use A, D, G characters", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testBadArgumentsNumberFail() {
		String[] args = { "10",
				"1A0",
				"5",
				"5",
				"N",
				"D"};
		Core.main(args);
		assertEquals("Error : Position argument can only be a number", outputStreamCaptor.toString().trim());
	}
	@Test
	public void testHelpArgument() {
		String[] args = { "-h"};
		Core.main(args);
		assertEquals("Help :\nUse arguments : GridX GridY HooverX HooverY HooverOrientation Sequence\n"
				  		  + "HooverOrientation posibility N, E, S, W\n"
						  + "Sequence posibility D, G, A\n"
						  + "(Example : 10 10 5 5 N DAGA)",
						  outputStreamCaptor.toString().trim());
	}

}
