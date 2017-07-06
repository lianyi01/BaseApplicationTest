package com.dhgate.buyermob.test.elements;

import java.util.ArrayList;
import java.util.Random;


import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.view.View;
import android.view.ViewGroup;
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
 * @creation date 2017-5-22 ����4:46:28
 * @desc
 */

public class ElementsSkuActivity {

	
   
	private Solo solo;
	// Shipping specifics description reviews
	    
	    private ArrayList<View> skuGroupList;
	    private ArrayList<View> skuList;
	    private TextView  sku_view;
	   	       
	    private Button sku_bt_sku_continue;
	    private Button sku_bt_sku_soldout;
	    private LinearLayout sku_bg_popup;
	    private LinearLayout sku_ll_footerView;
	    private LinearLayout ll_item_sku_footer_wholeprice;
	    private ImageView sku_title_bar_back, sku_title_bar_search;
	    private TextView sku_title_bar_cart;
	    
     

    
    
	public ElementsSkuActivity(Solo solo) {
		this.solo = solo;
	}
	
	
	/*
	 * ��ʼ��ʱ���ҵ�����(���sku��Ĳ�Ʒ)SKUѡ��ҳ
	 */

	public void initViews() {
		String parentViewId ="com.dhgate.buyermob:id/lv_attribute";
		String skuGroupListId ="com.dhgate.buyermob:id/flowLayout";
		String skuListId ="com.dhgate.buyermob:id/tv_arr";
		 //��ȡListView �ĸ��ڵ�
		//skuGroupList  = solo.(skuGroupListId);
		//skuList =(ListView) solo.getView(skuListId);
		
	    
	}
	
	
	/*
	 * 
	 * ѡ��itemcode��229518812
	 * ����SKU�飬ѡ������SKU���е�һ��SKU
	 * ˳��ѡ��
	 * */
	
	public void selectSkuFirst(){
		
		//��ȡ���游�ڵ㣬���ڸ��ڵ���ӽڵ�����id��ͬ���
		View view = solo.getView("com.dhgate.buyermob:id/lv_attribute");
		ListView listview = solo.getCurrentViews(ListView.class, view).get(0);//
		solo.sleep(100);
		//��ȡ�游view
		LinearLayout RL0 = (LinearLayout) listview.getChildAt(0);
		//��ȡ��view
		ViewGroup  v0=(ViewGroup)RL0.getChildAt(1);
		//��ȡ�����Ŀ��ڵ�
		solo.clickOnView( v0.getChildAt(0));
		
		LinearLayout RL1 = (LinearLayout) listview.getChildAt(1);
		//��ȡ��view
		ViewGroup  v1=(ViewGroup)RL1.getChildAt(1);
		//��ȡ�����Ŀ��ڵ�
		solo.clickOnView( v1.getChildAt(0));
//	
//		
		
	}
	/*
	 * 
	 * ѡ��itemcode��229518812
	 * ����SKU�飬ѡ������SKU���е�һ��SKU
	 * Two SKU groups, select the first SKU in the two SKU groups
	 * ��forѭ��ѡ��sku
	 * Click for loop to select sku
	 * */
public void selectSkuFirstFor(){
	//listview->LinearLayout(2��sku)->view->LinearLayout
	View view = solo.getView("com.dhgate.buyermob:id/lv_attribute");
	ListView listview = solo.getCurrentViews(ListView.class, view).get(0);//
    int RListNum =listview.getChildCount();
		ViewGroup rlGr1=null;

	for (int i=0;i<RListNum;i++){
		LinearLayout RL=(LinearLayout) listview.getChildAt(i);
		ViewGroup  v1=(ViewGroup)RL.getChildAt(1);
		//��ȡ�����Ŀ��ڵ�
		solo.clickOnView( v1.getChildAt(0));
	}
}
	
	/*
	 * 
	 * ѡ��itemcode��229518812
	 * ����SKU��
	 * ��forѭ��ѡ��sku��
	 * ѡ������SKU���������ѡ��SKU
	 * */
     public void selectSkuRam(){
	//listview->LinearLayout(2��sku)->view->LinearLayout
	View view = solo.getView("com.dhgate.buyermob:id/lv_attribute");
	ListView listview = solo.getCurrentViews(ListView.class, view).get(0);//
    int RListNum =listview.getChildCount();
		ViewGroup rlGr1=null;
		Random rand =new Random(25);
		
	for (int i=0;i<RListNum;i++){
		LinearLayout RL=(LinearLayout) listview.getChildAt(i);
		int radnum,num;
		
		ViewGroup  v1=(ViewGroup)RL.getChildAt(1);
		num=v1.getChildCount();
		radnum=rand.nextInt(num);
		
		//��ȡ�����Ŀ��ڵ�
	   solo.clickOnView( v1.getChildAt(radnum));
	}
	
	
	}



	
}
