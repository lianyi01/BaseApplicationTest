package com.dhgate.buyermob.test.testcase.item; 

import com.dhgate.buyermob.test.BasicTestCase;
import com.dhgate.buyermob.test.BasicTestCaseWithSearch;

/** 
 * @author lijqi
 * @creation date 2017-6-19 下午4:41:41 
 * @desc
 */

public class TestSelectSKU extends BasicTestCaseWithSearch{
	
	
	
	
	public void testTestSelectSKU() {
		
		uiHelper.getElementsItemActivity().clickAddtoCart();
		uiHelper.getElementsSkuActivity().selectSkuRam();
		
		
		
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




