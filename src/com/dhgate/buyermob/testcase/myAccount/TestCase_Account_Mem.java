package com.dhgate.buyermob.testcase.myAccount;

import com.dhgate.buyermob.test.BasicTestCase;

/**
 * @author lijq
 * @version createTime：2017-5-14 下午1:37:57
 * class discription：执行这个用例前，APP已经登录 父类继承 BasicTestCase
 */
public class TestCase_Account_Mem extends BasicTestCase {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
		
	}
    
	
	
	public void testTestCase_Account_Mem() {
		
		uiHelper.getElementsHomeActivity().clickAccount();
		uiHelper.getElementsMyacountActivity().clickmembership();
		assertTrue("错误提示信息没有出现，可能出现BUG",uiHelper.getSolo().searchText("用户名名或者密码错误！",true));
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		//关闭打开的Activity
		super.tearDown();
	}



}

