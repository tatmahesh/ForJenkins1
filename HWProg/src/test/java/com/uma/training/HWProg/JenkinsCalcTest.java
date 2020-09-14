package com.uma.training.HWProg;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator mycalc = new JenkinsCalculator();
		assertEquals(20, mycalc.add(15, 5));
		System.out.println("addTest done");
	}

	public void subTest() {
		JenkinsCalculator mycalc = new JenkinsCalculator();
		assertEquals(25, mycalc.sub(30, 5));
		System.out.println("subTest done");
		
	}

}
