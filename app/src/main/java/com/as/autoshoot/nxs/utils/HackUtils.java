package com.as.autoshoot.nxs.utils;

import android.util.Log;
import com.topjohnwu.superuser.Shell;
import android.content.Context;

public class HackUtils {

	private static String D_PATH = null;
	
	public static int WALLSTONE = 1;
    public static int NIGHTMODO = 2;
    public static int HEAD = 3;
    public static int WALLKILL = 4;
	public static int BALAMAGICA = 5;
	public static int NECK = 6;
	public static int GHOSTHACK = 7;
    public static int SAFE = 007;
	
	public static void setD_PATH (String _d_path){
		D_PATH = _d_path;
	}
	public static void syncHack(int no_feature, boolean about){
		if (D_PATH != null){
		if (Shell.rootAccess()) {
			if (about){
				Shell.sh(D_PATH + " " + no_feature + " " + 1).submit();
			} else {
				Shell.sh(D_PATH + " " + no_feature + " " + 0).submit();
			}
		}
	}
}
	public static void syncHackSEEK(int no_feature, int about){
		if (D_PATH != null){
			Shell.sh(D_PATH + " " + no_feature + " " + about).submit();
			Log.d("RCG", D_PATH + " " + no_feature + " " + about);
		}
	}
}
