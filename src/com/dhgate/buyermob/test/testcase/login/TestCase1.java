package com.dhgate.buyermob.test.testcase.login;

import com.dhgate.buyermob.test.BasicTestCase;

/**
 * @author lijq
 * @version createTime��2017-5-14 ����1:37:57
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
		
	
		
		//���û�������������� 201610261@163.com
		uiHelper.getElementsLoginActivity().enterName("201610261@163.com");
		
		//��λ�û����ؼ�
		//������������� qwerty1
		uiHelper.getElementsLoginActivity().enterPwd("qwerty1");


		//������¼��ť
		uiHelper.getElementsLoginActivity().clickLoginButton();
		
		
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

