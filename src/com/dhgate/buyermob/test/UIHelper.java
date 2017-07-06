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
 * @version createTime：2017-5-13 下午2:36:27
 * class discription：统一入口类，获取控件类
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
	 * 获取登录页面控件类的方法
	 * @return
	 * */
	
	public ElementsLoginActivity getElementsLoginActivity() {
		
		//控件类对象为空时再实例化
		

		if(elementsLoginActivity == null){
			elementsLoginActivity = new ElementsLoginActivity(solo);
		}
		elementsLoginActivity.initViews();
		return elementsLoginActivity;
	}
	
	
	/**
	 * 获取home页面控件类的方法
	 * @return
	 * */
	
	public ElementsHomeActivity getElementsHomeActivity() {
		
		//控件类对象为空时再实例化
		
		if(elementsHomeActivity == null){
			elementsHomeActivity = new ElementsHomeActivity(solo);
		}
		elementsHomeActivity.initViews();
		return elementsHomeActivity;
	}
	
	
	/**
	 * 获取my account页面控件类的方法
	 * @return
	 * */
	
	public ElementsMyacountActivity getElementsMyacountActivity() {
		
		//控件类对象为空时再实例化
		
		if(elementsMyacountActivity == null){
			elementsMyacountActivity = new ElementsMyacountActivity(solo);
		}
		elementsMyacountActivity.initViews();
		return elementsMyacountActivity;
	}

	/**
	 * 获取new  Search页面控件类的方法
	 * @return
	 * */
	
	public ElementsSearchActivity getElementsSearchActivity() {
		
		//控件类对象为空时再实例化
		
		if(elementsSearchActivity == null){
			elementsSearchActivity = new ElementsSearchActivity(solo);
		}
		elementsSearchActivity.initViews();
		return elementsSearchActivity;
	}
	/**
	 * 获取item页控件类的方法
	 * @return
	 * */
	
	public ElementsItemActivity getElementsItemActivity() {
		
		//控件类对象为空时再实例化
		
		if(elementsItemActivity == null){
			elementsItemActivity = new ElementsItemActivity(solo);
		}
		elementsItemActivity.initViews();
		return elementsItemActivity;
	}

	/**
	 * 获取item-SKU页面控件类的方法
	 * @return
	 * */
	
	public ElementsSkuActivity getElementsSkuActivity() {
		
		//控件类对象为空时再实例化
		
		if(elementsSkuActivity == null){
			elementsSkuActivity = new ElementsSkuActivity(solo);
		}
		elementsSkuActivity.initViews();
		return elementsSkuActivity;
	}

	
	/**
	 * 获取update升级页面控件类的方法
	 * @return
	 * */
	
	public  ElementsUpdateActivity getElementsUpdateActivity() {
		
		//控件类对象为空时再实例化
		
		if(elementsUpdateActivity == null){
			elementsUpdateActivity = new ElementsUpdateActivity(solo);
		}
		elementsUpdateActivity.initViews();
		return elementsUpdateActivity;
	}



}
