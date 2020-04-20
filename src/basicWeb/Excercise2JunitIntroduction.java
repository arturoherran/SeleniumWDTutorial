package basicWeb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Excercise2JunitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("I am the first message");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("I am the final message");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("lest run a test case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("We just ran a test case");
	}

	@Test
	public void test1() {
		System.out.println("I am the first test");
	}

	@Test
	public void test2() {
		System.out.println("I am the second test");
	}
}
