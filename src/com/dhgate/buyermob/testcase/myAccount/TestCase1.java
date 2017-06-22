package com.dhgate.buyermob.testcase.myAccount;

import com.dhgate.buyermob.test.BasicTestCase;
import com.dhgate.buyermob.test.BasicTestCaseWithLogin;

/**
 * @author lijq
 * @version createTime：2017-5-14 下午1:37:57
 * class discription：执行这个用例需要登录 父类继承 BasicTestCaseWithLogin 
 */
public class TestCase1 extends BasicTestCaseWithLogin {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
	
	}
  
	
	
	public void testTestCase1() {
		
	
		//单击membership按钮
		uiHelper.getElementsMyacountActivity().clickmembership();
		
		
		//第一个参数在验证失败的情况下，要显示提示字符串
		//第二个参数是用来断言的表达式
		assertTrue("错误提示信息没有出现，可能出现BUG",uiHelper.getSolo().searchText("用户名名或者密码错误！",true));
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		//关闭打开的Activity
		super.tearDown();
	}



}

