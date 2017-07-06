package com.dhgate.buyermob.test.elements;


import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * @author lijqi
 * @creation date 2017-5-22 下午4:46:28
 * @desc
 */

public class ElementsItemActivity {

	
   
	private Solo solo;
	// Shipping specifics description reviews
    private RelativeLayout rl_item_shipping;
    private RelativeLayout rl_item_specifics;
    private RelativeLayout rl_item_description;
    private RelativeLayout rl_item_reviews;
 
    //button
    private Button bt_buyitnow;//buy it now OR  1 step buy
    private Button bt_pay_addtocart;//add to cart
    private Button  bt_get_sample;//sample

    //textView
    private TextView btn_buy;
    private TextView btn_addtocart;
    
    
	public ElementsItemActivity(Solo solo) {
		this.solo = solo;
	}
	
	
	/*
	 * 初始化时，找到所有搜索页面的控件
	 */

	public void initViews() {
		String btn_addtocartId ="com.dhgate.buyermob:id/btn_addtocart";
		String bt_pay_addtocartId ="com.dhgate.buyermob:id/bt_buyitnow";
		
		bt_pay_addtocart =(Button) solo.getView(bt_pay_addtocartId);
	
	}
	
	
	/*
	 * 定位到button后点击该button
	 * 
	 * */
	
	public void clickAddtoCart(){
		solo.clickOnView(bt_pay_addtocart);
		solo.sleep(100);
	}

	
	
}
