package com.dhgate.buyermob.test;

import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;


//����ǻ���apk�ģ�������ActivityInstrumentationTestCase2<LoginActivity>
public class BasicTestCaseWithSearch extends BasicTestCase {

	

	/**
	 * ��д setUP j�����쳣���� ��ͼ����
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


	
	
	

	