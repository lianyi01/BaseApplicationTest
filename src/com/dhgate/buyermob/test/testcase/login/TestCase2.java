package com.dhgate.buyermob.test.testcase.login;

import com.dhgate.buyermob.test.BasicTestCase;


public class TestCase2 extends BasicTestCase {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
	
	}
    
	
	
	public void testTestCase2() {
		
	   
		
		uiHelper.getElementsHomeActivity().clickAccount();
		
		
		assertTrue("������ʾ��Ϣû�г��֣����ܳ���BUG",uiHelper.getSolo().searchText("�û����������������",true));
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		//�رմ򿪵�Activity
		super.tearDown();
	}



}
