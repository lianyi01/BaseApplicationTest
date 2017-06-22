package com.dhgate.buyermob.test;

import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;
//import com.dhgate.buyerAPP.LoginActivity;

//����ǻ���apk�ģ�������ActivityInstrumentationTestCase2<LoginActivity>
public class BasicTestCase extends ActivityInstrumentationTestCase2 {

	private Solo solo;
	private PowerManager.WakeLock wakeScreenObject = null;
    protected UIHelper uiHelper = null;
    
    private static final  String LAUCHER_ACTIVTIY_FULL_CLASS ="com.dhgate.buyermob.activity.SplashActivity";
    		
	private static Class<?> launcherAcivityClass;
	private static String packageName = "com.dhgate.buyermob";
	static {
		try {
			launcherAcivityClass = Class.forName(LAUCHER_ACTIVTIY_FULL_CLASS);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public BasicTestCase() {
		//super(LoginActivityClass.class);
		super(launcherAcivityClass);
		// TODO Auto-generated constructor stub
	}

	/**
	 * ��д setUP j�����쳣���� ��ͼ����
	 * 
	 * @throws Exception
	 * */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub

		try {
			super.setUp();
			init();
			//+��ͼ2
			solo.takeScreenshot(this.getClass().getSimpleName());

		} catch (Throwable tr) {
			throw new SetUpException(tr);
		}
	}

	/*
	 * ��д runTest,���в����쳣�ˣ���ͼ���� *
	 */

	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub

		try {
			super.runTest();
			//+�ɹ���Ҳ��Ҫ��ͼ1
			solo.takeScreenshot(this.getClass().getSimpleName());

		} catch (junit.framework.AssertionFailedError afe) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw afe;
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new RunTestException(th);
		}
	}

	/**
	 * ��д tearDown,�����쳣���񣬽�ͼ����
	 * 
	 * @throws Exception
	 * **/

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (wakeScreenObject != null) {
				wakeScreenObject.release();
				wakeScreenObject = null;
			}
			//+����4
			solo.takeScreenshot(this.getClass().getSimpleName());
			super.tearDown();
		} catch (Throwable th) {
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw new TearDownException(th);

		} finally {
			solo.finishOpenedActivities();
		}

	}

	private void init() {
		solo = new Solo(getInstrumentation(), getActivity());
		//+����3
		solo.takeScreenshot(this.getClass().getSimpleName());

		//ʵ����uiHelper
		uiHelper =new UIHelper(solo);
		// �����豸
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);

		}
		// ����
		Util.unlock(getInstrumentation());
	}

	/**
	 * ֻ��setUp û�б��������쳣�����У���дrunBare�����쳣����ӽ�ȥ
	 * 
	 * @throws Throwable
	 * **/

	@Override
	public void runBare() throws Throwable {
		try {
			super.runBare();
		} catch (SetUpException smte) {
			solo.takeScreenshot(this.getClass().getSimpleName());
		}
	}
	
}

	/*
	 * 3���Զ�����쳣�࣬�ֱ��Ӧ setUp ʱ��runTest����ʱ��tearDown����ʱ���쳣
	 * 	 * *
	 */
	
	
	
	class SetUpException extends Exception {
		private static final long serialVersionUID = 1L;

		SetUpException(Throwable e) {
			super("Errow in BasicTestCase.SetUp()!", e);

		}
	}

	class RunTestException extends Exception {
		private static final long serialVersionUID = 2L;

		RunTestException(Throwable e) {
			super("Error in BasicTestCase.RunTest()!", e);

		}
		
	}

	class TearDownException extends Exception {
		private static final long serialVersionUID = 3L;
		TearDownException(Throwable e) {
			super("Error in MultiTestCase.TearDown()!", e);
			}
	}
		

	