package com.dhgate.buyermob.test.testcase.logout; 

import com.dhgate.buyermob.test.BasicTestCaseWithLogin;
import com.robotium.solo.Solo;

/** 
 * @author lijqi
 * @creation date 2017-5-19 上午11:52:13 
 * @desc：预期效果：在setting界面中，查看sign out按钮不存在即可
 */

public class Logout_1 extends BasicTestCaseWithLogin {
	@Override
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	public void testLogout_1(){
		//模拟菜单键
//		uiHelper.getSolo().sendKey(Solo.MENU);
//		uiHelper.getSolo().sleep(3000);
//		uiHelper.getSolo().clickOnText("退出");
	}

}
