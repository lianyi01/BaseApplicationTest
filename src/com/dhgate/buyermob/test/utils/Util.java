package com.dhgate.buyermob.test.utils;

import android.app.Activity;
import android.app.Instrumentation;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.test.InstrumentationTestCase;
import android.util.Log;
import android.view.View;
/**
 * @author lijq
 * @version createTime：2017-5-13 下午2:36:27
 * class discription
 */


public class Util {
	/*
	 * 唤醒设备的方法
	 * @param owner
	 * @return
	*/
	
	public static WakeLock wakeScreen(InstrumentationTestCase owner){
		PowerManager pm =(PowerManager) owner.getInstrumentation().getTargetContext().getSystemService(Context.POWER_SERVICE);
		WakeLock wakeLock = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK | PowerManager.FULL_WAKE_LOCK|PowerManager.ACQUIRE_CAUSES_WAKEUP,owner.getClass().getSimpleName());
		wakeLock.acquire();
		return wakeLock;
		
	}
	
	/*
	 * 解锁方法
	 * @param instr
	 * 
	*/
	public static void unlock(Instrumentation instr){
		try{
			Context targetContext = instr.getTargetContext();
			KeyguardManager keyguardManager=(KeyguardManager)targetContext.getSystemService(Context.KEYGUARD_SERVICE);
			KeyguardLock mLock = keyguardManager.newKeyguardLock("");
			mLock.disableKeyguard();
			
		}
		catch(Throwable e){
			Log.e("Test", "unlock failed",e);
			
		}
	}
	/**
	 * 针对solo 找不到控件，断言失败，终止Case执行问题
	 *  * 
	 * */
	public static View getIDFromName(String id,Activity activity){
		String packageName = activity.getApplicationContext().getPackageName();
		int viewId =activity.getApplicationContext().getResources().getIdentifier(id, "id",packageName);
		return activity.findViewById(viewId);
		
	}

}
