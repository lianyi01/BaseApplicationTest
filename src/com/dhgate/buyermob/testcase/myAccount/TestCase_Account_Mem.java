package com.dhgate.buyermob.testcase.myAccount;

import com.dhgate.buyermob.test.BasicTestCase;

/**
 * @author lijq
 * @version createTime��2017-5-14 ����1:37:57
 * class discription��ִ���������ǰ��APP�Ѿ���¼ ����̳� BasicTestCase
 */
public class TestCase_Account_Mem extends BasicTestCase {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
		
	}
    
	
	
	public void testTestCase_Account_Mem() {
		
		uiHelper.getElementsHomeActivity().clickAccount();
		uiHelper.getElementsMyacountActivity().clickmembership();
		assertTrue("������ʾ��Ϣû�г��֣����ܳ���BUG",uiHelper.getSolo().searchText("�û����������������",true));
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		//�رմ򿪵�Activity
		super.tearDown();
	}



}

