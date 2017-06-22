package com.dhgate.buyermob.test.elements;

import com.dhgate.buyermob.test.testcase.login.R;
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
import android.widget.TextView;

/**
 * @author lijqi
 * @creation date 2017-5-22 下午4:46:28
 * @desc
 */

public class ElementsSearchActivity {

	private Solo solo;
	// 关键字自动填充
	private AutoCompleteTextView search_keyword_autotv;
	// 取消搜索
	private Button cancel_search_btn;
	// 联想词的展示控件
	private ListView suggestListView;
	// recent和Popular的容器控件
	private LinearLayout ll_recent_popular;

	// 输入法管理器
	private InputMethodManager inM;
	private int from;
	private boolean isAppExclusive = false;
	private String key;
	private View  SearchTitle;
	private TextView  SearchBar;
   private  LinearLayout  itemList;
   
   
	public ElementsSearchActivity(Solo solo) {
		this.solo = solo;
	}
	
	
	/*
	 * 初始化时，找到所有搜索页面的控件
	 */

	public void initViews() {
		
		String SearchTitle = "Search DHgate";
		String autoTV_search_auto_textId ="autoTV_search_auto_text";
		String SearchBarId ="com.dhgate.buyermob:id/title_bar_center";
		//获取
		//search_keyword_autotv = (AutoCompleteTextView) solo.getView(autoTV_search_auto_textId);
		//solo.sleep(2000);
	//	SearchTitle = Util.(SearchTitle, solo.getCurrentActivity());
		SearchBar = (TextView)solo.getView(SearchBarId);
	
	
	}

	public AutoCompleteTextView getSearch_keyword_autotv() {
		return search_keyword_autotv;
	}



	/**
	 * 单击Categories入口
	 * 
	 * */

	public void clickCategory() {
		// 通过solo.clickOnView 单击你要单击的view
		String Categories = "Categories";
		
		solo.clickLongOnText(Categories);

	}
	

	/**
	 * 输入搜索关键词
	 * 
	 * @param text
	 * */
	public void enterSearchKey(String text) {
	
		// 获取 该activity中第一个EditText
		// 业务：搜索框中输入搜索关键词
		solo.clickOnView(SearchBar);
		solo.sleep(1000);
		solo.enterText(0, text);
		solo.pressSoftKeyboardSearchButton();

	}
	/**
	 * 定位搜索列表中第一个产品，并点击
	 * */
	public void clickfirstItem() {
	
		String itemListId="com.dhgate.buyermob:id/item_container";
		itemList=(LinearLayout)solo.getView(itemListId);
       	solo.clickOnView(itemList);
		solo.sleep(100);

	}
	
	
	
	/**
	 * 调用这个方法只需要搜索关键词
	 * 点击进入搜索列表中第一个item
	 * 
	 * */
	public void doSearchWithKey(String keySearch){
		
		
		enterSearchKey(keySearch);
		clickfirstItem();
		
	}
	
}
