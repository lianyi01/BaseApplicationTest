package com.dhgate.buyermob.test.testsuites; 

import com.dhgate.buyermob.test.testcase.login.TestCase2;
import com.dhgate.buyermob.testcase.myAccount.TestCase1;
import com.dhgate.buyermob.testcase.myAccount.TestCase_Account_Mem;

import junit.framework.TestSuite;

/** 
 * @author lijqi
 * @creation date 2017-5-19 ÏÂÎç12:05:26 
 * @desc
 */

public class LoginSuite {
	public static TestSuite getTestSuite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestCase1.class);
		suite.addTestSuite(TestCase_Account_Mem.class);
		return suite;
		
	}
	 

}
