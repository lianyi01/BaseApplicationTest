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
 * @creation date 2017-5-22 下午4:46:28
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
	 * 初始化时，找到所有(多个sku组的产品)SKU选择页
	 */

	public void initViews() {
		String parentViewId ="com.dhgate.buyermob:id/lv_attribute";
		String skuGroupListId ="com.dhgate.buyermob:id/flowLayout";
		String skuListId ="com.dhgate.buyermob:id/tv_arr";
		 //获取ListView 的父节点
		//skuGroupList  = solo.(skuGroupListId);
		//skuList =(ListView) solo.getView(skuListId);
		
	    
	}
	
	
	/*
	 * 
	 * 选择itemcode：229518812
	 * 两个SKU组，选择两个SKU组中第一个SKU
	 * 顺序选择
	 * */
	
	public void selectSkuFirst(){
		
		//获取祖祖父节点，由于父节点和子节点中有id相同情况
		View view = solo.getView("com.dhgate.buyermob:id/lv_attribute");
		ListView listview = solo.getCurrentViews(ListView.class, view).get(0);//
		solo.sleep(100);
		//获取祖父view
		LinearLayout RL0 = (LinearLayout) listview.getChildAt(0);
		//获取父view
		ViewGroup  v0=(ViewGroup)RL0.getChildAt(1);
		//获取并点击目标节点
		solo.clickOnView( v0.getChildAt(0));
		
		LinearLayout RL1 = (LinearLayout) listview.getChildAt(1);
		//获取父view
		ViewGroup  v1=(ViewGroup)RL1.getChildAt(1);
		//获取并点击目标节点
		solo.clickOnView( v1.getChildAt(0));
//	
//		
		
	}
	/*
	 * 
	 * 选择itemcode：229518812
	 * 两个SKU组，选择两个SKU组中第一个SKU
	 * Two SKU groups, select the first SKU in the two SKU groups
	 * 按for循环选择sku
	 * Click for loop to select sku
	 * */
public void selectSkuFirstFor(){
	//listview->LinearLayout(2个sku)->view->LinearLayout
	View view = solo.getView("com.dhgate.buyermob:id/lv_attribute");
	ListView listview = solo.getCurrentViews(ListView.class, view).get(0);//
    int RListNum =listview.getChildCount();
		ViewGroup rlGr1=null;

	for (int i=0;i<RListNum;i++){
		LinearLayout RL=(LinearLayout) listview.getChildAt(i);
		ViewGroup  v1=(ViewGroup)RL.getChildAt(1);
		//获取并点击目标节点
		solo.clickOnView( v1.getChildAt(0));
	}
}
	
	/*
	 * 
	 * 选择itemcode：229518812
	 * 两个SKU组
	 * 按for循环选择sku组
	 * 选择两个SKU组中且随机选择SKU
	 * */
     public void selectSkuRam(){
	//listview->LinearLayout(2个sku)->view->LinearLayout
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
		
		//获取并点击目标节点
	   solo.clickOnView( v1.getChildAt(radnum));
	}
	
	
	}



	
}
