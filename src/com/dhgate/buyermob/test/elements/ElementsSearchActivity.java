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
 * @creation date 2017-5-22 ����4:46:28
 * @desc
 */

public class ElementsSearchActivity {

	private Solo solo;
	// �ؼ����Զ����
	private AutoCompleteTextView search_keyword_autotv;
	// ȡ������
	private Button cancel_search_btn;
	// ����ʵ�չʾ�ؼ�
	private ListView suggestListView;
	// recent��Popular�������ؼ�
	private LinearLayout ll_recent_popular;

	// ���뷨������
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
	 * ��ʼ��ʱ���ҵ���������ҳ��Ŀؼ�
	 */

	public void initViews() {
		
		String SearchTitle = "Search DHgate";
		String autoTV_search_auto_textId ="autoTV_search_auto_text";
		String SearchBarId ="com.dhgate.buyermob:id/title_bar_center";
		//��ȡ
		//search_keyword_autotv = (AutoCompleteTextView) solo.getView(autoTV_search_auto_textId);
		//solo.sleep(2000);
	//	SearchTitle = Util.(SearchTitle, solo.getCurrentActivity());
		SearchBar = (TextView)solo.getView(SearchBarId);
	
	
	}

	public AutoCompleteTextView getSearch_keyword_autotv() {
		return search_keyword_autotv;
	}



	/**
	 * ����Categories���
	 * 
	 * */

	public void clickCategory() {
		// ͨ��solo.clickOnView ������Ҫ������view
		String Categories = "Categories";
		
		solo.clickLongOnText(Categories);

	}
	

	/**
	 * ���������ؼ���
	 * 
	 * @param text
	 * */
	public void enterSearchKey(String text) {
	
		// ��ȡ ��activity�е�һ��EditText
		// ҵ�������������������ؼ���
		solo.clickOnView(SearchBar);
		solo.sleep(1000);
		solo.enterText(0, text);
		solo.pressSoftKeyboardSearchButton();

	}
	/**
	 * ��λ�����б��е�һ����Ʒ�������
	 * */
	public void clickfirstItem() {
	
		String itemListId="com.dhgate.buyermob:id/item_container";
		itemList=(LinearLayout)solo.getView(itemListId);
       	solo.clickOnView(itemList);
		solo.sleep(100);

	}
	
	
	
	/**
	 * �����������ֻ��Ҫ�����ؼ���
	 * ������������б��е�һ��item
	 * 
	 * */
	public void doSearchWithKey(String keySearch){
		
		
		enterSearchKey(keySearch);
		clickfirstItem();
		
	}
	
}
