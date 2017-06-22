package com.dhgate.buyermob.test.testcase.login;

import com.dhgate.buyermob.test.BasicTestCase;

/**
 * @author lijq
 * @version createTime：2017-5-14 下午1:37:57
 * class discription
 */
public class TestCase1 extends BasicTestCase {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
	}
	
	
	public void testTestCase1() {
		
		uiHelper.getElementsHomeActivity().clickAccount();
		uiHelper.getElementsMyacountActivity().clickLoginAccessButton();
		
	
		
		//在用户名输入框中输入 201610261@163.com
		uiHelper.getElementsLoginActivity().enterName("201610261@163.com");
		
		//定位用户名控件
		//在密码框中输入 qwerty1
		uiHelper.getElementsLoginActivity().enterPwd("qwerty1");


		//单击登录按钮
		uiHelper.getElementsLoginActivity().clickLoginButton();
		
		
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

