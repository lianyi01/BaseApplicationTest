package com.dhgate.buyermob.test.testcase.item; 

import com.dhgate.buyermob.test.BasicTestCase;
import com.dhgate.buyermob.test.BasicTestCaseWithSearch;

/** 
 * @author lijqi
 * @creation date 2017-6-19 ����4:41:41 
 * @desc
 */

public class TestSelectSKU extends BasicTestCaseWithSearch{
	
	
	
	
	public void testTestSelectSKU() {
		
		uiHelper.getElementsItemActivity().clickAddtoCart();
		uiHelper.getElementsSkuActivity().selectSkuRam();
		
		
		
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




