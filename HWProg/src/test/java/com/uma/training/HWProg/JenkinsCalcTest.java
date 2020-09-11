package com.uma.training.HWProg;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addTest() {
		JenkinsCalculator mycalc = new JenkinsCalculator();
		assertEquals(10, mycalc.add(5, 5));
		System.out.println("addTest done");
	}

	public void subTest() {
		JenkinsCalculator mycalc = new JenkinsCalculator();
		assertEquals(5, mycalc.sub(10, 5));
		System.out.println("subTest done");
	}

}
