package com.dhgate.buyermob.test;

import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;


//如果是基于apk的，不用在ActivityInstrumentationTestCase2<LoginActivity>
public class BasicTestCaseWithLogin extends BasicTestCase {

	

	/**
	 * 复写 setUP j进行异常捕获 截图处理
	 * 
	 * @throws Exception
	 * */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub

		super.setUp();
		uiHelper.getElementsHomeActivity().clickAccount();
		uiHelper.getElementsMyacountActivity().clickLoginAccessButton();
		//因为用户名 20161026@163.com，密码为qwerty1，所以构造账号密码字符串数组 new String[]{" 20161026@163.com","qwerty1"}
		uiHelper.getElementsLoginActivity().doLoginWithAccount(new String[]{"20161026@163.com","qwerty1"});
	}

	
	
}


	
	
	

	