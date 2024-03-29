/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.pelluch.${MODULE_NAME};

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
//import org.appcelerator.kroll.common.Log;



import android.app.Activity;
import android.content.Intent;
//import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;

@Kroll.module(name="${UPPER_MODULE_NAME}", id="com.pelluch.${MODULE_NAME}")
public class ${UPPER_MODULE_NAME}Module extends KrollModule
{

	// Standard Debugging variables
	//private static final String TAG = "${UPPER_MODULE_NAME}Module";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public ${UPPER_MODULE_NAME}Module()
	{
		super();
	}
	
	// @Kroll.method
	// public boolean isPackageInstalled(String packageName)
	// {
	// 	TiApplication appContext = TiApplication.getInstance();
	// 	Activity activity = appContext.getCurrentActivity();
		
	// 	PackageManager pm = activity.getPackageManager();
	// 	try {
	// 		pm.getPackageInfo(packageName, PackageManager.GET_META_DATA);
	// 		return true;
	// 	}
	// 	catch (NameNotFoundException e) {
	// 		return false;
	// 	}
	// }
	
	// @Kroll.method
	// public void openPlayStore(String packageName)
	// {
		
	// 	TiApplication appContext = TiApplication.getInstance();
	// 	try 
	// 	{
	// 		Intent marketIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName));
	// 		marketIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	// 		appContext.startActivity(marketIntent);
	// 	} 
	// 	catch (android.content.ActivityNotFoundException e) 
	// 	{
	// 		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + packageName));
	// 		browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	// 		appContext.startActivity(browserIntent);
	// 	}
	// }

}

