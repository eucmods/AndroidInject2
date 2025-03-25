package com.as.autoshoot.nxs;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import java.io.File;
import com.as.autoshoot.nxs.utils.FileUtils;
import android.util.Log;
import android.os.Build;
import android.content.DialogInterface;
import android.provider.Settings;
import android.net.Uri;
import android.annotation.Nullable;
import android.app.AlertDialog;
import com.as.autoshoot.nxs.Charger;
import android.widget.Toast;

public class MainActivity extends Activity { 


	private static boolean TestRoot;
	static String GameActivity = "hack.GameActivity";
	private static int REQUEST_OVERLAY = 2929;
	private String TAG = "Tekashi CMods";
	public static String libdeleted;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		haveRoot();
		requestOverlayPermission();
		InitDaemon();
    }
	public void INJECT(View v){
		//coringa.Start(this);
		startService(new Intent(this, Charger.class));
		Intent GAMEFREEFIRE = getPackageManager().getLaunchIntentForPackage("com.dts.freefireth");
		startActivity(GAMEFREEFIRE);
	}
	private void InitDaemon() {
		FileUtils.copyFromAssets(this, getFilesDir().getPath(), "NXSBypass");
		File file = new File(getFilesDir().getPath(), "NXSBypass");
		if (file.exists())
			file.setExecutable(true, true);
	}
	public void ClearAll(View v){
	    File filec = new File(getFilesDir().getPath(), "NXSBypass");
		if (filec.exists())
			Charger.cmods_exec("rm -rf /data/data/com.as.autoshoot.nxs/files/NXSBypass");
			Charger.cmods_exec("rm -rf /data/data/com.as.autoshoot.nxs/files/nxs.sh");
			Charger.cmods_exec("rm -rf /data/data/com.as.autoshoot.nxs/files/cmods.sh");
			Charger.cmods_exec("rm -rf /data/data/com.as.autoshoot.nxs/files/AntiCheat.sh");
	}
	public void ShellExecutor(View v){
		FileUtils.copyFromAssets(this, getFilesDir().getPath(), "cmods.sh");
		FileUtils.copyFromAssets(this, getFilesDir().getPath(), "nxs.sh");
		FileUtils.copyFromAssets(this, getFilesDir().getPath(), "AntiCheat.sh");
		File fileSH = new File(getFilesDir().getPath(), "nxs.sh");
		File fileSHx = new File(getFilesDir().getPath(), "cmods.sh");
		if (fileSH.exists())
			Charger.cmods_exec("sh /data/data/com.as.autoshoot.nxs/files/nxs.sh");
		if (fileSHx.exists())
			Charger.cmods_exec("sh /data/data/com.as.autoshoot.nxs/files/cmods.sh");
			Charger.cmods_exec("sh /data/data/com.as.autoshoot.nxs/files/AntiCheat.sh");
			Toast.makeText(this,"Shell...",Toast.LENGTH_SHORT).show();
	}
	
	public boolean haveRoot() {
        if (!TestRoot) {
            int ret = Charger.cmods_exec("echo test");
            if (ret != -1) {
                Log.i(TAG, "have root!");
                TestRoot = true;
            } else {
                Log.i(TAG, "not root!");
            }
        } else {
            Log.i(TAG, "TestRoot = true, have root!");
        }
        return TestRoot;
	}
	private void requestOverlayPermission(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!Settings.canDrawOverlays(this)){
				new AlertDialog.Builder(this)
					.setMessage("This application requires overlay permission please permission first")
					.setCancelable(false)
					.setPositiveButton("OK", new DialogInterface.OnClickListener(){
						@Override
						public void onClick(DialogInterface dialog, int i) {
							Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
							startActivityForResult(intent, REQUEST_OVERLAY);
						}
					})
					.show();
            }
        }
    }
	@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_OVERLAY) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestOverlayPermission();
            }
        }
    }
}
