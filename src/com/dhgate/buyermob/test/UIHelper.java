package com.dhgate.buyermob.test;

import com.dhgate.buyermob.test.elements.ElementsHomeActivity;
import com.dhgate.buyermob.test.elements.ElementsItemActivity;
import com.dhgate.buyermob.test.elements.ElementsLoginActivity;
import com.dhgate.buyermob.test.elements.ElementsMyacountActivity;
import com.dhgate.buyermob.test.elements.ElementsSearchActivity;
import com.dhgate.buyermob.test.elements.ElementsSkuActivity;
import com.dhgate.buyermob.test.elements.ElementsUpdateActivity;
import com.robotium.solo.Solo;

/**
 * @author lijq
 * @version createTime��2017-5-13 ����2:36:27
 * class discription��ͳһ����࣬��ȡ�ؼ���
 */
public class UIHelper {
	private  Solo  solo = null;
	private  ElementsLoginActivity  elementsLoginActivity;
	private  ElementsHomeActivity   elementsHomeActivity;
	private  ElementsMyacountActivity   elementsMyacountActivity;
	private  ElementsSearchActivity   elementsSearchActivity;
	private  ElementsItemActivity      elementsItemActivity;
	private  ElementsSkuActivity      elementsSkuActivity;
	private  ElementsUpdateActivity   elementsUpdateActivity;

	public UIHelper(Solo solo){
		this.solo = solo;
		
	}
	
	public Solo getSolo(){
		return solo;
	}
	
	/**
	 * ��ȡ��¼ҳ��ؼ���ķ���
	 * @return
	 * */
	
	public ElementsLoginActivity getElementsLoginActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		

		if(elementsLoginActivity == null){
			elementsLoginActivity = new ElementsLoginActivity(solo);
		}
		elementsLoginActivity.initViews();
		return elementsLoginActivity;
	}
	
	
	/**
	 * ��ȡhomeҳ��ؼ���ķ���
	 * @return
	 * */
	
	public ElementsHomeActivity getElementsHomeActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		
		if(elementsHomeActivity == null){
			elementsHomeActivity = new ElementsHomeActivity(solo);
		}
		elementsHomeActivity.initViews();
		return elementsHomeActivity;
	}
	
	
	/**
	 * ��ȡmy accountҳ��ؼ���ķ���
	 * @return
	 * */
	
	public ElementsMyacountActivity getElementsMyacountActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		
		if(elementsMyacountActivity == null){
			elementsMyacountActivity = new ElementsMyacountActivity(solo);
		}
		elementsMyacountActivity.initViews();
		return elementsMyacountActivity;
	}

	/**
	 * ��ȡnew  Searchҳ��ؼ���ķ���
	 * @return
	 * */
	
	public ElementsSearchActivity getElementsSearchActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		
		if(elementsSearchActivity == null){
			elementsSearchActivity = new ElementsSearchActivity(solo);
		}
		elementsSearchActivity.initViews();
		return elementsSearchActivity;
	}
	/**
	 * ��ȡitemҳ�ؼ���ķ���
	 * @return
	 * */
	
	public ElementsItemActivity getElementsItemActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		
		if(elementsItemActivity == null){
			elementsItemActivity = new ElementsItemActivity(solo);
		}
		elementsItemActivity.initViews();
		return elementsItemActivity;
	}

	/**
	 * ��ȡitem-SKUҳ��ؼ���ķ���
	 * @return
	 * */
	
	public ElementsSkuActivity getElementsSkuActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		
		if(elementsSkuActivity == null){
			elementsSkuActivity = new ElementsSkuActivity(solo);
		}
		elementsSkuActivity.initViews();
		return elementsSkuActivity;
	}

	
	/**
	 * ��ȡupdate����ҳ��ؼ���ķ���
	 * @return
	 * */
	
	public  ElementsUpdateActivity getElementsUpdateActivity() {
		
		//�ؼ������Ϊ��ʱ��ʵ����
		
		if(elementsUpdateActivity == null){
			elementsUpdateActivity = new ElementsUpdateActivity(solo);
		}
		elementsUpdateActivity.initViews();
		return elementsUpdateActivity;
	}



}
