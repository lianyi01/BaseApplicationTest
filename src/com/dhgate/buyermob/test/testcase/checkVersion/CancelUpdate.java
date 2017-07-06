package com.dhgate.buyermob.test.testcase.checkVersion; 

import com.dhgate.buyermob.test.BasicTestCase;

/** 
 * @author lijqi
 * @creation date 2017-7-5 обнГ4:39:50 
 * @desc
 */

public class CancelUpdate extends BasicTestCase {
    @Override
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	
	public void testCancelUpdate(){
		
		//check if there is update info or not
		boolean checkOn ;
		checkOn = uiHelper.getElementsUpdateActivity().checkVersionInfo();
		if(checkOn==true){
			uiHelper.getElementsUpdateActivity().clickCancel();
		}

	}

}
