package com.dhgate.buyermob.testcase.myAccount;

import com.dhgate.buyermob.test.BasicTestCase;
import com.dhgate.buyermob.test.BasicTestCaseWithLogin;

/**
 * @author lijq
 * @version createTime��2017-5-14 ����1:37:57
 * class discription��ִ�����������Ҫ��¼ ����̳� BasicTestCaseWithLogin 
 */
public class TestCase1 extends BasicTestCaseWithLogin {
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
	
	}
  
	
	
	public void testTestCase1() {
		
	
		//����membership��ť
		uiHelper.getElementsMyacountActivity().clickmembership();
		
		
		//��һ����������֤ʧ�ܵ�����£�Ҫ��ʾ��ʾ�ַ���
		//�ڶ����������������Եı��ʽ
		assertTrue("������ʾ��Ϣû�г��֣����ܳ���BUG",uiHelper.getSolo().searchText("�û����������������",true));
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		//�رմ򿪵�Activity
		super.tearDown();
	}



}

