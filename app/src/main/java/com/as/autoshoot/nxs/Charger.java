package com.as.autoshoot.nxs;

import android.app.Service;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import android.view.View.OnLongClickListener;
import android.view.LayoutInflater;
import android.widget.Switch;
import android.graphics.drawable.GradientDrawable;
import android.app.AlertDialog;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.text.Html;
import android.graphics.PorterDuff;
import java.io.InputStream;
import android.graphics.drawable.Drawable;
import android.content.pm.PackageInstaller;
import android.os.Messenger;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.TimeAnimator;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.drawable.AnimationDrawable;
import android.annotation.TargetApi;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.content.res.AssetManager;
import android.transition.Visibility;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Process;
import android.view.WindowManager.LayoutParams;
import android.app.ActivityManager;
import android.view.ViewGroup;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.as.autoshoot.nxs.utils.HackUtils;
import com.topjohnwu.superuser.Shell;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;
import java.io.DataOutputStream;

public class Charger extends Service {

    private  WindowManager janela_menu;
	
	private  ImageView DevTeam;

	private  FrameLayout Cmods_Frames;

	private  RelativeLayout collapseView;

	private  LinearLayout CoRingaModz_YT,Dev_cmods,BUTÃO_LAYOUT;//All Linear Layout
	
	int cm_ods;
	
	private  LinearLayout Borda_do_Titulo;
	
	private  GradientDrawable gd = new GradientDrawable();
	private  ValueAnimator animator;
	
	public static String daemonPath;
	public static String daemonNoRoot;

	private static String TAG;

	private String libdeleted;
	
    private  void TEKASHI_TEAM(){
		File path = new File(this.getFilesDir().getPath(), "NXSBypass");
        if (path.exists()){
		HackUtils.setD_PATH(path.toString());
		
		Cmods_Frames = new FrameLayout(this);
        FrameLayout.LayoutParams fraLayoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        Cmods_Frames.setLayoutParams(fraLayoutParams);

        RelativeLayout Subs_Relative = new RelativeLayout(this);
        RelativeLayout.LayoutParams relative_Sub = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        Subs_Relative.setLayoutParams(relative_Sub);
        
		collapseView = new RelativeLayout(this);
        collapseView.setLayoutParams(relative_Sub);
		
		DevTeam = new ImageView(this);
		//DevTeam.setImageDrawable(this.getResources().getDrawable(R.drawable.aim_on));
		LinearLayout.LayoutParams CMODSDEV = new LinearLayout.LayoutParams(dp(69), dp(69));
        DevTeam.setLayoutParams(CMODSDEV);
		try {InputStream open = this.getAssets().open("auto.png");
		DevTeam.setImageDrawable(Drawable.createFromStream(open, null));
		open.close();}catch(IOException ex){return;}
		collapseView.addView(DevTeam);
		
		Dev_cmods = new LinearLayout(this);
		Dev_cmods.setVisibility(View.GONE);
		Dev_cmods.setAlpha(0.8f);
		Dev_cmods.setGravity(17);
        Dev_cmods.setOrientation(LinearLayout.VERTICAL);
		Dev_cmods.setLayoutParams(new LinearLayout.LayoutParams(dp(289), dp(342)));
		//Dev_cmods.setBackgroundColor(Color.parseColor("#FF2C2C2C"));
		Dev_cmods.setBackground(gd);
		
		LinearLayout Layout_Principal = new LinearLayout(this);
        LinearLayout.LayoutParams layout_LinearLayout_Principal = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(300));
        Layout_Principal.setLayoutParams(layout_LinearLayout_Principal);
        Layout_Principal.setOrientation(LinearLayout.VERTICAL);
		//Layout_Principal.setBackgroundColor(Color.parseColor("#9C000000"));
	
		ScrollView deslizamento = new ScrollView(this);
        LinearLayout.LayoutParams scrollView_Params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);//220
        deslizamento.setLayoutParams(scrollView_Params);
		
		Borda_do_Titulo = new LinearLayout(this);
        Borda_do_Titulo.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(54)));
		Borda_do_Titulo.setGravity(1);
		///Borda_do_Titulo.setBackground(gd);
	
		final TextView Titulo_do_Menu = new TextView(this);
		LinearLayout.LayoutParams layoutParamsxx = new LinearLayout.LayoutParams(-2, dp(300));
		Titulo_do_Menu.setLayoutParams(layoutParamsxx);
        Titulo_do_Menu.setText("R 3 G 3 D I T  G A M E R");
        Titulo_do_Menu.setTextColor(Color.parseColor("WHITE"));
        Titulo_do_Menu.setTypeface(Typeface.DEFAULT_BOLD);
        Titulo_do_Menu.setTextSize(22.0f);
		Titulo_do_Menu.setPadding(10, 10, 10, 15);
		Typeface typeface = Typeface.createFromAsset(this.getAssets(), "font.ttf");
		Titulo_do_Menu.setTypeface(typeface, Typeface.BOLD);
		Borda_do_Titulo.addView(Titulo_do_Menu);
		Titulo_do_Menu.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
					collapseView.setVisibility(View.VISIBLE);
					Dev_cmods.setVisibility(View.GONE);
                }
            });
		
		CoRingaModz_YT = new LinearLayout(this);
		CoRingaModz_YT.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, -1));
        CoRingaModz_YT.setOrientation(LinearLayout.VERTICAL);
        
		BUTÃO_LAYOUT = new LinearLayout(this);
        BUTÃO_LAYOUT.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, -1));
        BUTÃO_LAYOUT.setOrientation(LinearLayout.VERTICAL);
		
		CoRingaModz_YT.addView(BUTÃO_LAYOUT);
		
		Dev_cmods.addView(Borda_do_Titulo);
		
		deslizamento.addView(CoRingaModz_YT);
		
		Layout_Principal.addView(deslizamento);
		
		Dev_cmods.addView(Layout_Principal);
		
		Subs_Relative.addView(collapseView);
		
		///Dev_cmods.addView(relativeLayout);
		
		Subs_Relative.addView(Dev_cmods);
        Cmods_Frames.addView(Subs_Relative);
		MrEzCheatsYT();
		cmC_Start();
		int flag;
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1){
            flag = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        }else {
            flag = WindowManager.LayoutParams.TYPE_PHONE;
        }
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT,flag, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,PixelFormat.TRANSLUCENT);
        params.gravity = Gravity.TOP | Gravity.LEFT;
        params.x = 0;
        params.y = 100;
        janela_menu = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        janela_menu.addView(Cmods_Frames, params);
		Cmods_Frames.setOnTouchListener(new View.OnTouchListener() {
				private int initialX;
				private int initialY;
				private float initialTouchX;
				private float initialTouchY;
				boolean isLongClick = false;
				Handler handler_longClick = new Handler();
				Runnable runnable_longClick = new Runnable() {
					@Override public void run() {
						isLongClick = true;
						Close_segurar();
					}
				};
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()) {
						case MotionEvent.ACTION_DOWN:
							initialX = params.x;
							initialY = params.y;
							initialTouchX = event.getRawX();
							initialTouchY = event.getRawY();
							handler_longClick.postDelayed(runnable_longClick, 2000);
							return true;
						case MotionEvent.ACTION_UP:
							int Xdiff = (int) (event.getRawX() - initialTouchX);
							int Ydiff = (int) (event.getRawY() - initialTouchY);
							handler_longClick.removeCallbacks(runnable_longClick);
							if (Xdiff < 10 && Ydiff < 10) {
								if (VerColapso()) {
									collapseView.setVisibility(View.GONE);
									Dev_cmods.setVisibility(View.VISIBLE);
								}
							}
							return true;
						case MotionEvent.ACTION_MOVE:
							params.x = initialX + (int) (event.getRawX() - initialTouchX);
							params.y = initialY + (int) (event.getRawY() - initialTouchY);
							janela_menu.updateViewLayout(Cmods_Frames, params);
							return true;
					}
					return false;
				}
		});
		}
	}
	///WORK ANIMATION
	public  void cmC_Start() {
        final int start = Color.parseColor("#FFA8F328");
        final int end = Color.parseColor("#FF660E0E");
        final ArgbEvaluator evaluator = new ArgbEvaluator();
        /*
        gd.setCornerRadius(0f);
		gd.setCornerRadii(new float[] { 9, 9, 9, 9, 0, 0, 0, 0 });
		*/
		//android.graphics.drawable.GradientDrawable ICEIDHH = new android.graphics.drawable.GradientDrawable();
		
		//gd.setColor(Color.argb(255,15,15,15));
		gd.setStroke(3, Color.argb(255,255,255,255));
		//ggggg.setBackground(ICEIDHH);
		
		
		
		gd.setCornerRadius(4);
        gd.setOrientation(GradientDrawable.Orientation.TL_BR);
        final GradientDrawable gradient = gd;
        animator = TimeAnimator.ofFloat(0.0f, 1.0f);
        animator.setDuration(3000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				@Override
				public void onAnimationUpdate(ValueAnimator valueAnimator) {
					Float fraction = valueAnimator.getAnimatedFraction();
					int newStrat = (int) evaluator.evaluate(fraction, start, end);
					int newEnd = (int) evaluator.evaluate(fraction, end, start);
					int[] newArray = {newStrat, newEnd};
					gradient.setColors(newArray);
				}
			});
        animator.start();
    }
	
	
	private  void MrEzCheatsYT(){
		addSwitch("Headshoot", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.HEAD, isChecked);
                }
            });
           addSwitch("Neckshoot", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.NECK, isChecked);
                }
            });
        addSwitch("Wall Stone", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.WALLSTONE, isChecked);
                }
            });
		addSwitch("Night Modo", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.NIGHTMODO, isChecked);
                }
            });
        addSwitch("Wall Kill", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.WALLKILL, isChecked);
                }
            });
		addSwitch("Bala Magica", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.BALAMAGICA, isChecked);
                }
            });
		addSwitch("GHOST (TEST)", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.GHOSTHACK, isChecked);
                }
            });
            addSwitch("GameSafe", new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    HackUtils.syncHack(HackUtils.SAFE, isChecked);
                }
            });
    }
	private void addSwitch(String text, CompoundButton.OnCheckedChangeListener listener) {
        LinearLayout SwitchLayout = new LinearLayout(this);
        LinearLayout.LayoutParams switchLayout = new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
        SwitchLayout.setLayoutParams(switchLayout);
        SwitchLayout.setOrientation(LinearLayout.HORIZONTAL);

        final GradientDrawable SwitchDrawable = new GradientDrawable();
        SwitchDrawable.setShape(GradientDrawable.OVAL);
        SwitchDrawable.setColor(Color.BLACK);
        SwitchDrawable.setStroke(dp(1), Color.WHITE);
        SwitchDrawable.setSize(dp(20), dp(20));

        final CheckBox FuncSwitch = new CheckBox(this);
        LinearLayout.LayoutParams funcSwitch = new LinearLayout.LayoutParams(MATCH_PARENT, dp(35));
        funcSwitch.leftMargin = dp(5);
        funcSwitch.rightMargin = dp(5);
        FuncSwitch.setLayoutParams(funcSwitch);
        FuncSwitch.setText(text);
        FuncSwitch.setTextColor(Color.WHITE);
        FuncSwitch.setTextSize(TypedValue.COMPLEX_UNIT_SP, 13f);
        FuncSwitch.setOnClickListener(new View.OnClickListener() {
				@Override public void onClick(View view) {
					if (FuncSwitch.isChecked()) {
						SwitchDrawable.setColor(Color.parseColor("#22AC22"));
					} else {
						SwitchDrawable.setColor(Color.BLACK);
					}
				}
			});
		FuncSwitch.setOnCheckedChangeListener(listener);
        BUTÃO_LAYOUT.addView(SwitchLayout);
        SwitchLayout.addView(FuncSwitch);
    }
	
	@Override
    public void onTaskRemoved(Intent rootIntent) {
        stopSelf();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onTaskRemoved(rootIntent);
    }
    private boolean isNotInGame() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance != 100;
    }
    private void Thread() {
        if (this.Cmods_Frames == null) {
            return;
        }/*
        if (isNotInGame()) {
            this.Cmods_Frames.setVisibility(View.INVISIBLE);
        } else {
            this.Cmods_Frames.setVisibility(View.VISIBLE);
        }*/
    }
	private  boolean VerColapso() {
		return Cmods_Frames == null || Cmods_Frames.getVisibility() == View.VISIBLE;
    }
	public void Destroy() {
        super.onDestroy();
        if (Cmods_Frames != null) {
            janela_menu.removeView(Cmods_Frames);
            Cmods_Frames = null;
		}
    }
	private  void Close_segurar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            cm_ods = 2038;
        } else {
            cm_ods = 2002;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, 5);
		builder.setTitle("CMODs Developer");
		builder.setMessage("Tem certeza de que deseja interromper o Hack?\nVocê não poderá acessar o Hack novamente até reabrir o Jogo!");
		builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					DevTeam.setVisibility(View.GONE);
					Dev_cmods.setVisibility(View.GONE);
					collapseView.setVisibility(View.GONE);
					showMessage("Closing...");
				}
			});
		builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
				}
			});

		AlertDialog dialog = builder.create();
		dialog.getWindow().setType(cm_ods);
		dialog.show();
	}
	void Inject(){
        daemonPath = this.getFilesDir().toString() + "/NXSBypass";
        if (Shell.rootAccess()) {
            Shell.su("chmod 777 " + daemonPath).exec();
            Shell.su(daemonPath).submit();
            Toast.makeText(this, "Sucess Lib [INJECT] ao iniciar", Toast.LENGTH_SHORT).show();
        }
    }
	@Override
    public void onCreate() {
        super.onCreate();
		Inject();
		NoRoot();
        TEKASHI_TEAM();
		final Handler handler = new Handler();
        handler.post(new Runnable() {
                public void run() {
                    Charger.this.Thread();
                    handler.postDelayed(this, 1000);
                }
            });
		}
		
		
		public void NoRoot(){
			daemonNoRoot = getFilesDir().toString() + "/NXSBypass";
			try {
				Runtime.getRuntime().exec("chmod 777 " + daemonNoRoot);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	public void StartSelectLib(){
		libdeleted = getFilesDir().toString() + "/NXSBypass";
		DeletedCMODs(libdeleted);
	}
	public void DeletedCMODs(String remv) {
        cmods_exec("rm -rf " + remv);
    }	
	public static int cmods_exec(String cmd) {
        int result = -1;
        DataOutputStream dos = null;
        try {
            java.lang.Process p = Runtime.getRuntime().exec("su");
            dos = new DataOutputStream(p.getOutputStream());
            Log.i(TAG, cmd);
            dos.writeBytes(cmd + "\n");
            dos.flush();
            dos.writeBytes("exit\n");
            dos.flush();
            p.waitFor();
            result = p.exitValue();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
	public  void showMessage(String txt){
		Toast.makeText(this, txt, Toast.LENGTH_LONG).show();
	}
	@Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    private  interface InterfaceBool {
        public void OnWrite(boolean var1);
    }
    private  interface InterfaceBtn {
        public void OnWrite();
    }
    private  interface InterfaceInt {
        public void OnWrite(int var1);
    }
	private  interface SW {
        void OnWrite(boolean z);
    }
    private  interface InterfaceStr {
        public void OnWrite(String var1);
    }
    private  int dp(int value){
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, this.getResources().getDisplayMetrics());
    }
}
