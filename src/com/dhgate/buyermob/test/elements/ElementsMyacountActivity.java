package com.dhgate.buyermob.test.elements;
/**
 * @author lijq:
 * @version createTime��2017-5-13 ����2:36:27
 * class discription
 */
import android.R;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;

public class ElementsMyacountActivity {
	private Solo solo;

	// ��������������
	
	
	private TextView homeTextView, categoryTextView,dealsTextView,storeTextView,myAccountTextView,loginAccessTextView;
	private ImageView homeImageView, categoryImageView,dealsImageView,storeImageView,myAccountImageView;
	private RelativeLayout rl_profile_messages, rl_profile_orders, rl_profile_recent,
     rl_profile_favorites, rl_profile_coupons, rl_profile_address,
     rl_profile_invite, rl_profile_setting, rl_profile_2Vip,
     rl_profile_recently_viewed, rl_profile_personalize, rl_profile_1step,
     rl_profile_review,rl_profile_feedback,rl_profile_rate_app;
	
	//private View membershipTextView;
	

	public ElementsMyacountActivity(Solo solo) {
		this.solo = solo;
	}

	/*
	 * ��ʼ��ʱ���ҵ�����my accountҳ��Ŀؼ�
	 */

	public void initViews() {
		
		
 
		String loginAccessTextViewId  = "com.dhgate.buyermob:id/account_user_login_button";
		String membership_profile_2Vip ="com.dhgate.buyermob:id/rl_profile_2Vip";
		String profile_recently_viewId  = "com.dhgate.buyermob:id/rl_profile_recently_viewed";
		String profile_messagesId  = "com.dhgate.buyermob:id/rl_profile_messages";
		String profile_ordersId  = "com.dhgate.buyermob:id/rl_profile_orders";
		String profile_reviewId  = "com.dhgate.buyermob:id/rl_profile_review";
		String profile_favoritesId  = "com.dhgate.buyermob:id/rl_profile_favorites";
		String rl_profile_coupons  = "com.dhgate.buyermob:id/rl_profile_coupons";
		String rl_profile_address  = "com.dhgate.buyermob:id/rl_profile_address";
		String rl_profile_invite  = "com.dhgate.buyermob:id/rl_profile_invite";
		String rl_profile_setting  = "com.dhgate.buyermob:id/rl_profile_setting";
		String rl_profile_personalize  = "com.dhgate.buyermob:id/rl_profile_personalize";
		String rl_profile_1step  = "com.dhgate.buyermob:id/rl_profile_1step";
		String rl_profile_feedback  = "com.dhgate.buyermob:id/rl_profile_feedback";
		String rl_profile_rate_app ="com.dhgate.buyermob:id/rl_profile_rate_app";
		
		loginAccessTextView = (TextView) solo.getView(loginAccessTextViewId);
		rl_profile_2Vip = (RelativeLayout) solo.getView(membership_profile_2Vip);
//		loginAccessTextView = (TextView) solo.getView(loginAccessTextViewId);
//		loginAccessTextView = (TextView) solo.getView(loginAccessTextViewId);
//		loginAccessTextView = (TextView) solo.getView(loginAccessTextViewId);
//		loginAccessTextView = (TextView) solo.getView(loginAccessTextViewId);

	}

	
	public void clickLoginAccessButton() {
		// ͨ��solo.clickOnView ������Ҫ������view
		solo.clickOnView(loginAccessTextView);

	}
	
	
	public void clickmembership() {
		// ͨ��solo.clickOnView ������Ҫ������view
		solo.clickOnView(rl_profile_2Vip);

	}
}