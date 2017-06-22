package com.dhgate.buyermob.test;

import com.dhgate.buyermob.test.utils.Util;
import com.robotium.solo.Solo;

import android.os.PowerManager;
import android.test.ActivityInstrumentationTestCase2;
//import com.dhgate.buyerAPP.LoginActivity;

//如果是基于apk的，不用在ActivityInstrumentationTestCase2<LoginActivity>
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
	 * 复写 setUP j进行异常捕获 截图处理
	 * 
	 * @throws Exception
	 * */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub

		try {
			super.setUp();
			init();
			//+截图2
			solo.takeScreenshot(this.getClass().getSimpleName());

		} catch (Throwable tr) {
			throw new SetUpException(tr);
		}
	}

	/*
	 * 复写 runTest,进行捕获异常了，截图处理 *
	 */

	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub

		try {
			super.runTest();
			//+成功了也需要截图1
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
	 * 复写 tearDown,进行异常捕获，截图处理
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
			//+截屏4
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
		//+截屏3
		solo.takeScreenshot(this.getClass().getSimpleName());

		//实例化uiHelper
		uiHelper =new UIHelper(solo);
		// 唤醒设备
		if (wakeScreenObject == null) {
			wakeScreenObject = Util.wakeScreen(this);

		}
		// 解锁
		Util.unlock(getInstrumentation());
	}

	/**
	 * 只有setUp 没有被包含在异常处理中，重写runBare，把异常处理加进去
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
	 * 3个自定义的异常类，分别对应 setUp 时，runTest发生时，tearDown发生时的异常
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
		

	