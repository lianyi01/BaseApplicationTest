package com.dhgate.buyermob.test.elements;
/**
 * @author lijq:
 * @version createTime：2017-5-13 下午2:36:27
 * class discription
 */
import android.R;

import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.robotium.solo.Solo;
import com.robotium.solo.Timeout;

public class ElementsHomeActivity {
	private Solo solo;

	// 声明两个变量 来存储
	
	private TextView homeTextView, categoryTextView,dealsTextView,storeTextView,myAccountTextView;
	private ImageView homeImageView, categoryImageView,dealsImageView,storeImageView,myAccountImageView;
    
	//private Button loginButton;

	public ElementsHomeActivity(Solo solo) {
		this.solo = solo;
	}

	/*
	 * 初始化时，找到所有登录页面的控件
	 */

	public void initViews() {
		
	
		
		
		// 通过ID找出控件，赋值给变量-基于源码测试
		
//		nameEditText = (EditText) solo.getCurrentActivity().findViewById(
//				R.id.text1);
//		pwdEditText = (EditText) solo.getCurrentActivity().findViewById(
//				R.id.text2);
//		loginButton = (Button) solo.getCurrentActivity().findViewById(
//				R.id.button1);
		//com.dhgate.buyermob:id/tabbaritem_btn
		String myAccountImageViewId = "tabbaritem_btn";
		//String 
     
	//	myAccountImageView = (ImageView) solo.getView(myAccountImageViewId);
		myAccountImageView = (ImageView) Util.getIDFromName(myAccountImageViewId, solo.getCurrentActivity());
	

	}

	

	/**
	 * 获取home 中my account图标
	 * 
	 * @return
	 */

	public ImageView myAccountImageView() {
		return myAccountImageView;

	}
	


	/**
	 * 单击my account入口
	 * 
	 * */

	public void clickAccountButton() {
		// 通过solo.clickOnView 单击你要单击的view
		solo.takeScreenshot(this.getClass().getSimpleName());

		solo.clickOnView(myAccountImageView);

	}
	/**
	 * 单击my account入口
	 * 
	 * */

	public void clickAccount() {
		// 通过solo.clickOnView 单击你要单击的view
		String myAccountText = "Account";
		solo.clickLongOnText(myAccountText);

	}

}
