package com.dhgate.buyermob.test.elements;
/**
 * @author lijq:
 * @version createTime：2017-5-13 下午2:36:27
 * class discription
 */
import android.R;
import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;
import com.robotium.solo.Timeout;

public class ElementsLoginActivity {
	private Solo solo;

	// 声明两个变量 来存储
	private EditText nameEditText, pwdEditText;

	private Button loginButton;

	public ElementsLoginActivity(Solo solo) {
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
		
		//solo.waitForActivity("LoginActivity2",2000);
		
		
		String nameEditorId = "lg_email";
		String pwdEditorId = "lg_password";
		String loginButtonId ="lg_login";
		
		solo.sleep(2000);
		nameEditText = (EditText) solo.getView(nameEditorId);
		//等待2秒
		solo.sleep(2000);
		//solo.waitForView(pwdEditorId);
		pwdEditText = (EditText) solo.getView(pwdEditorId);
		solo.sleep(2000);
		//com.dhgate.buyermob:id/lg_login
		loginButton = (Button) solo.getButton("Sign in");
		
		solo.sleep(2000);
		//com.dhgate.buyermob:id/lg_email
		

	}
	
	
	/**
	 * 获取用户名输入值
	 * 
	 * @return
	 */

	public EditText nameEditText() {
		return nameEditText;

	}

	/**
	 * 获取pwd输入值
	 * 
	 * @return
	 */
	public EditText pwdEditText() {
		return pwdEditText;
	}

	/**
	 * 获取登录按钮输入值
	 * 
	 * @return
	 */
	public Button getLoginButton() {
		return loginButton;
	}
	
	
	/**
	 * 定位输入用户名框
	 * */
	public void focusNameEdit() {
		solo.clickOnView(nameEditText);
	}
	
	/**
	 * 输入用户名
	 * 
	 * @param text
	 * */
	public void enterName(String text) {
		//solo.sleep(10000);
		solo.enterText(nameEditText, text);

	}
	
	/**
	 * 定位输入pwd框
	 * */
	public void focuspwdEdit() {
		solo.clickOnView(pwdEditText);
	}
	
	/**
	/**
	 * 输入密码
	 * 
	 * @param text
	 * */

	public void enterPwd(String text) {
		// 通过solo.enterText 可以往输入框中输入值，第一个参数指定要输入的输入框
		// 第二个参数是往输入框中输入的值
		solo.sleep(2000);
		solo.enterText(pwdEditText, text);

	}

	/**
	 * 单击登录按钮
	 * 
	 * */

	public void clickLoginButton() {
		// 通过solo.clickOnView 单击你要单击的view
		solo.clickOnView(loginButton);
		

	}
	
	/**
	 * 给当前页面拍照
	 * 
	 * */

	
//	public void takePic() {
//		// 通过solo.takeScreenshot() 对当前页面
//		solo.takeScreenshot();
//		
//	}
	
	/**
	 * 调用这个方法只需要传入账号密码的字符串数值 即可
	 * account【0】存放的是账号信息
	 * account【1】存放的密码信息
	 * 
	 * */
	public void doLoginWithAccount(String[] account){
		
		//调用这个控件类的enterName方法，传入account[0]，账号信息，实现输入账号动作
		enterName(account[0]);
		//调用这个控件类的enterPwd方法，传入account[1]，账号信息，实现输入密码动作
		enterPwd(account[1]);
		//调用这个控件类的登录方法
		clickLoginButton();
		//等待主页面出现
		solo.sleep(1500);
		
	}


}
