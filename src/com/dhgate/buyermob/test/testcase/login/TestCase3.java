package com.dhgate.buyermob.test.testcase.login;

import com.dhgate.buyermob.test.BasicTestCase;


public class TestCase3 extends BasicTestCase {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
		
	  
	    
	    
		
	}
    
	
	
	public void testTestCase2() {
		
	   
		uiHelper.getElementsHomeActivity().clickAccount();
		uiHelper.getElementsMyacountActivity().clickLoginAccessButton();
		
		
		assertTrue("错误提示信息没有出现，可能出现BUG",uiHelper.getSolo().searchText("用户名名或者密码错误！",true));
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		//关闭打开的Activity
		super.tearDown();
	}



}

