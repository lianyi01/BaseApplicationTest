package com.dhgate.buyermob.test.elements;
/**
 * @author lijq:
 * @version createTime��2017-5-13 ����2:36:27
 * class discription
 */
import android.R;
import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.Solo;
import com.robotium.solo.Timeout;

public class ElementsLoginActivity {
	private Solo solo;

	// ������������ ���洢
	private EditText nameEditText, pwdEditText;

	private Button loginButton;

	public ElementsLoginActivity(Solo solo) {
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
		
		//solo.waitForActivity("LoginActivity2",2000);
		
		
		String nameEditorId = "lg_email";
		String pwdEditorId = "lg_password";
		String loginButtonId ="lg_login";
		
		solo.sleep(2000);
		nameEditText = (EditText) solo.getView(nameEditorId);
		//�ȴ�2��
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
	 * ��ȡ�û�������ֵ
	 * 
	 * @return
	 */

	public EditText nameEditText() {
		return nameEditText;

	}

	/**
	 * ��ȡpwd����ֵ
	 * 
	 * @return
	 */
	public EditText pwdEditText() {
		return pwdEditText;
	}

	/**
	 * ��ȡ��¼��ť����ֵ
	 * 
	 * @return
	 */
	public Button getLoginButton() {
		return loginButton;
	}
	
	
	/**
	 * ��λ�����û�����
	 * */
	public void focusNameEdit() {
		solo.clickOnView(nameEditText);
	}
	
	/**
	 * �����û���
	 * 
	 * @param text
	 * */
	public void enterName(String text) {
		//solo.sleep(10000);
		solo.enterText(nameEditText, text);

	}
	
	/**
	 * ��λ����pwd��
	 * */
	public void focuspwdEdit() {
		solo.clickOnView(pwdEditText);
	}
	
	/**
	/**
	 * ��������
	 * 
	 * @param text
	 * */

	public void enterPwd(String text) {
		// ͨ��solo.enterText �����������������ֵ����һ������ָ��Ҫ����������
		// �ڶ�����������������������ֵ
		solo.sleep(2000);
		solo.enterText(pwdEditText, text);

	}

	/**
	 * ������¼��ť
	 * 
	 * */

	public void clickLoginButton() {
		// ͨ��solo.clickOnView ������Ҫ������view
		solo.clickOnView(loginButton);
		

	}
	
	/**
	 * ����ǰҳ������
	 * 
	 * */

	
//	public void takePic() {
//		// ͨ��solo.takeScreenshot() �Ե�ǰҳ��
//		solo.takeScreenshot();
//		
//	}
	
	/**
	 * �����������ֻ��Ҫ�����˺�������ַ�����ֵ ����
	 * account��0����ŵ����˺���Ϣ
	 * account��1����ŵ�������Ϣ
	 * 
	 * */
	public void doLoginWithAccount(String[] account){
		
		//��������ؼ����enterName����������account[0]���˺���Ϣ��ʵ�������˺Ŷ���
		enterName(account[0]);
		//��������ؼ����enterPwd����������account[1]���˺���Ϣ��ʵ���������붯��
		enterPwd(account[1]);
		//��������ؼ���ĵ�¼����
		clickLoginButton();
		//�ȴ���ҳ�����
		solo.sleep(1500);
		
	}


}
