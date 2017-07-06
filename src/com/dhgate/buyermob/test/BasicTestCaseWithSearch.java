package com.dhgate.buyermob.test;

import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;


//如果是基于apk的，不用在ActivityInstrumentationTestCase2<LoginActivity>
public class BasicTestCaseWithSearch extends BasicTestCase {

	

	/**
	 * 复写 setUP j进行异常捕获 截图处理
	 * 
	 * @throws Exception
	 * */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub

		super.setUp();
		uiHelper.getElementsSearchActivity().doSearchWithKey("dress");
	}

	
	
}


	
	
	

	