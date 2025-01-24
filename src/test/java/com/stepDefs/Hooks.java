package com.stepDefs;



import com.pages.BaseClassAppium;

import io.cucumber.java.After;
import io.cucumber.java.Before;




public class Hooks {

	private final BaseClassAppium base = new BaseClassAppium();

	@Before
	public void setUp() {
		base.setUp();
	}

	@After
	public void tearDown() {
		base.tearDown();
	}
}
