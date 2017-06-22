package com.dhgate.buyermob.test.testcase.search; 

import com.dhgate.buyermob.test.BasicTestCase;

/** 
 * @author lijqi
 * @creation date 2017-6-19 下午4:41:41 
 * @desc
 */

public class TestSearch_firstItem extends BasicTestCase{
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
		
	}
    
	
	
	public void testTestSearch_firstItem() {
		
		//uiHelper.getElementsSearchActivity();
		
		
		//单击搜索框
		//uiHelper.getElementsSearchActivity().focusSearchForm();
		uiHelper.getElementsSearchActivity().enterSearchKey("dress");
		//uiHelper.getElementsSearchActivity().PressSoftKeyboard();
		uiHelper.getElementsSearchActivity().clickfirstItem();
		
		
		
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




