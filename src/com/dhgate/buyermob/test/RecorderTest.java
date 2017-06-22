package com.dhgate.buyermob.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class RecorderTest extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.dhgate.buyermob.activity.SplashActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public RecorderTest() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
		// Wait for activity: 'com.dhgate.buyermob.activity.SplashActivity'
		solo.waitForActivity("SplashActivity", 2000);
		// Wait for activity: 'com.dhgate.buyermob.activity.GuideActivity'
		assertTrue("GuideActivity is not found!", solo.waitForActivity("GuideActivity"));
		// Click on (394.48636, 433.6612)
//		solo.clickOnScreen(394.48636F, 433.6612F);
//		// Click on (407.46945, 872.3185)
//		solo.clickOnScreen(407.46945F, 872.3185F);
//		// Click on (206.73082, 461.63934)
//		solo.clickOnScreen(206.73082F, 461.63934F);
//		// Click on (419.45383, 1109.1335)
//		solo.clickOnScreen(419.45383F, 1109.1335F);
		// Wait for activity: 'com.dhgate.buyermob.activity.NewHomeActivity'
		assertTrue("NewHomeActivity is not found!", solo.waitForActivity("NewHomeActivity"));
		// Wait for activity: 'com.dhgate.buyermob.activity.MainControllerActivity'
		assertTrue("MainControllerActivity is not found!", solo.waitForActivity("MainControllerActivity"));
		// Click on (685.1079, 1141.1085)
		solo.clickOnScreen(685.1079F, 1141.1085F);
		// Wait for activity: 'com.dhgate.buyermob.activity.ProfileActivity'
		assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Wait for dialog to close
		solo.waitForDialogToClose(5000);
		// Click on (446.41873, 269.7892)
		solo.clickOnScreen(446.41873F, 269.7892F);
		// Wait for activity: 'com.dhgate.buyermob.activity.LoginActivity2'
		assertTrue("LoginActivity2 is not found!", solo.waitForActivity("LoginActivity2"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (619.1937, 691.4598)
		solo.clickOnScreen(619.1937F, 691.4598F);
		// Click on (439.42783, 531.5847)
		solo.clickOnScreen(439.42783F, 531.5847F);
		// Click on Empty Text View
		solo.clickOnView(solo.getView("lg_email"));
		// Set default small timeout to 11585 milliseconds
		Timeout.setSmallTimeout(11585);
		// Enter the text: 'sofort1@163.com'
		solo.clearEditText((android.widget.EditText) solo.getView("lg_email"));
		solo.enterText((android.widget.EditText) solo.getView("lg_email"), "sofort1@163.com");
		// Click on (319.58386, 598.976)
		solo.clickOnScreen(319.58386F, 598.976F);
		// Click on Empty Text View
		solo.clickOnView(solo.getView("lg_password"));
		// Enter the text: '8440ljq'
		solo.clearEditText((android.widget.EditText) solo.getView("lg_password"));
		solo.enterText((android.widget.EditText) solo.getView("lg_password"), "8440ljq");
		// Click on (340.55658, 707.4473)
		solo.clickOnScreen(340.55658F, 707.4473F);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (72.90507, 1148.103)
		solo.clickOnScreen(72.90507F, 1148.103F);
		// Click on (251.6723, 79.937546)
		solo.clickOnScreen(251.6723F, 79.937546F);
		// Wait for activity: 'com.dhgate.buyermob.activity.NewSearchActivity'
		assertTrue("NewSearchActivity is not found!", solo.waitForActivity("NewSearchActivity"));
		// Click on (207.72952, 287.77518)
		solo.clickOnScreen(207.72952F, 287.77518F);
		// Wait for activity: 'com.dhgate.buyermob.activity.NewCommodityActivity'
		assertTrue("NewCommodityActivity is not found!", solo.waitForActivity("NewCommodityActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (466.39273, 980.2342)
		solo.clickOnScreen(466.39273F, 980.2342F);
		// Click on (413.46164, 916.2842)
		solo.clickOnScreen(413.46164F, 916.2842F);
		// Click on (447.41742, 463.6378)
		solo.clickOnScreen(447.41742F, 463.6378F);
		// Wait for activity: 'com.dhgate.buyermob.activity.ItemActivity'
		assertTrue("ItemActivity is not found!", solo.waitForActivity("ItemActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (483.3706, 894.30133)
		solo.clickOnScreen(483.3706F, 894.30133F);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Wait for dialog to close
		solo.waitForDialogToClose(5000);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (707.07935, 93.92662)
		solo.clickOnScreen(707.07935F, 93.92662F);
		// Wait for activity: 'com.dhgate.buyermob.activity.NewCartActivity'
		assertTrue("NewCartActivity is not found!", solo.waitForActivity("NewCartActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (707.07935, 187.85324)
		solo.clickOnScreen(707.07935F, 187.85324F);
		// Click on (481.3732, 408.68073)
		solo.clickOnScreen(481.3732F, 408.68073F);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (609.2068, 1135.1132)
		solo.clickOnScreen(609.2068F, 1135.1132F);
		// Wait for activity: 'com.dhgate.buyermob.activity.OrderPreviewActivity'
		assertTrue("OrderPreviewActivity is not found!", solo.waitForActivity("OrderPreviewActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (287.6255, 324.74628)
		solo.clickOnScreen(287.6255F, 324.74628F);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on (187.75552, 618.5168)
		solo.clickOnScreen(187.75552F, 618.5168F);
		// Enter the text: '4'
		solo.clearEditText((android.widget.EditText) solo.getView("dialog_content"));
		solo.enterText((android.widget.EditText) solo.getView("dialog_content"), "4");
		// Click on (587.23535, 726.4325)
		solo.clickOnScreen(587.23535F, 726.4325F);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Wait for dialog to close
		solo.waitForDialogToClose(5000);
	}
}
