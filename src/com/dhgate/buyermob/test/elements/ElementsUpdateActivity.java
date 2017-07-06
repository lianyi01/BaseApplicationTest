package com.dhgate.buyermob.test.elements; 

import android.R.string;
import android.widget.Button;
import android.widget.TextView;

import com.robotium.solo.Solo;

/** 
 * @author lijqi
 * @creation date 2017-7-4 下午6:25:03 
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
	 * 判断是否包含升级信息
	 * 
	 * */
	public boolean checkVersionInfo() {
		//version info include：New version
		
		String updateWarn=updateTitle.toString();
		boolean checkOn=updateWarn.contains("New version");
		return checkOn;
		}  
	/**
	/**
	 * 点击cancel按钮
	 * 
	 * 
	 * */

	public void clickCancel() {
		
		solo.sleep(1000);
		solo.clickOnView(cancelButton);

	}
	
	
	
	/**
	/**
	 * 点击update按钮
	 * 
	 * 
	 * */

	public void clickUpdate() {
		
		solo.sleep(1000);
		solo.clickOnView(updateButton);

	}
	

}
