package com.dhgate.buyermob.test.testcase.item; 

import com.dhgate.buyermob.test.BasicTestCaseWithSearch;

/** 
 * @author lijqi
 * @creation date 2017-6-20 ����3:52:56 
 * @desc
 */

public class TestAddtoCart extends  BasicTestCaseWithSearch{
	public void testTestSearch_firstItem() {
		
		
		uiHelper.getElementsItemActivity().clickAddtoCart();
	
		//��һ����������֤ʧ�ܵ�����£�Ҫ��ʾ��ʾ�ַ���
		//�ڶ����������������Եı��ʽ
		assertTrue("������ʾ��Ϣû�г��֣����ܳ���BUG",uiHelper.getSolo().searchText("�û����������������",true));
		
	}

}
