package com.dhgate.buyermob.test.testcase.search; 

import com.dhgate.buyermob.test.BasicTestCase;

/** 
 * @author lijqi
 * @creation date 2017-6-19 ����4:41:41 
 * @desc
 */

public class TestSearch_firstItem extends BasicTestCase{
	
	@Override
	protected   void setUp() throws Exception{
		super.setUp();
		
	}
    
	
	
	public void testTestSearch_firstItem() {
		
		//uiHelper.getElementsSearchActivity();
		
		
		//����������
		//uiHelper.getElementsSearchActivity().focusSearchForm();
		uiHelper.getElementsSearchActivity().enterSearchKey("dress");
		//uiHelper.getElementsSearchActivity().PressSoftKeyboard();
		uiHelper.getElementsSearchActivity().clickfirstItem();
		
		
		
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




