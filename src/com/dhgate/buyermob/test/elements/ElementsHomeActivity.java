package com.dhgate.buyermob.test.elements;
/**
 * @author lijq:
 * @version createTime��2017-5-13 ����2:36:27
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

	// ������������ ���洢
	
	private TextView homeTextView, categoryTextView,dealsTextView,storeTextView,myAccountTextView;
	private ImageView homeImageView, categoryImageView,dealsImageView,storeImageView,myAccountImageView;
    
	//private Button loginButton;

	public ElementsHomeActivity(Solo solo) {
		this.solo = solo;
	}

	/*
	 * ��ʼ��ʱ���ҵ����е�¼ҳ��Ŀؼ�
	 */

	public void initViews() {
		
	
		
		
		// ͨ��ID�ҳ��ؼ�����ֵ������-����Դ�����
		
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
	 * ��ȡhome ��my accountͼ��
	 * 
	 * @return
	 */

	public ImageView myAccountImageView() {
		return myAccountImageView;

	}
	


	/**
	 * ����my account���
	 * 
	 * */

	public void clickAccountButton() {
		// ͨ��solo.clickOnView ������Ҫ������view
		solo.takeScreenshot(this.getClass().getSimpleName());

		solo.clickOnView(myAccountImageView);

	}
	/**
	 * ����my account���
	 * 
	 * */

	public void clickAccount() {
		// ͨ��solo.clickOnView ������Ҫ������view
		String myAccountText = "Account";
		solo.clickLongOnText(myAccountText);

	}

}
