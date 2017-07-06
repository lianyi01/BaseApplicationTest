package com.dhgate.buyermob.test.elements; 

import android.R.string;
import android.widget.Button;
import android.widget.TextView;

import com.robotium.solo.Solo;

/** 
 * @author lijqi
 * @creation date 2017-7-4 ����6:25:03 
 * @desc
 */

public class ElementsUpdateActivity {
	private Solo solo;
	private TextView  updateTitle;
	private Button  cancelButton;
	private Button  updateButton;
	
	
	public ElementsUpdateActivity(Solo solo) {
		this.solo = solo;
	}
	public void initViews() {
		String  updateTitleId ="android:id/alertTitle";
		updateTitle = (TextView) solo.getView(updateTitleId);
		Button  updateButton = (Button)solo.getButton("Upgrade");
		Button cancelButton  = (Button)solo.getButton("Cancel");
	    
	}
	
	
	
	


	
	/**
	/**
	 * �ж��Ƿ����������Ϣ
	 * 
	 * */
	public boolean checkVersionInfo() {
		//version info include��New version
		
		String updateWarn=updateTitle.toString();
		boolean checkOn=updateWarn.contains("New version");
		return checkOn;
		}  
	/**
	/**
	 * ���cancel��ť
	 * 
	 * 
	 * */

	public void clickCancel() {
		
		solo.sleep(1000);
		solo.clickOnView(cancelButton);

	}
	
	
	
	/**
	/**
	 * ���update��ť
	 * 
	 * 
	 * */

	public void clickUpdate() {
		
		solo.sleep(1000);
		solo.clickOnView(updateButton);

	}
	

}
