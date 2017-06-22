package com.dhgate.buyermob.test.runners;

import com.dhgate.buyermob.test.testsuites.LoginSuite;

import junit.framework.TestSuite;
import android.test.InstrumentationTestRunner;

/**
 * @author lijqi
 * @creation date 2017-5-19 ÏÂÎç3:20:37
 * @desc
 */

public class Runner1 extends CommonRunner {

	@Override
	public TestSuite getAllTests(){
		// TODO Auto-generated method stub
		TestSuite suite = new TestSuite();
		suite.addTest(LoginSuite.getTestSuite());
		
		return suite;
		
	}
}
