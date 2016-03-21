package com.example.testsetsystemuivisibility;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

@SuppressLint("NewApi")
public class MainActivity extends Activity implements OnClickListener
{

	private RelativeLayout mRLayout;
	private Button mBtn1, mBtn2, mBtn3, mBtn4, mBtn5, mBtn6, mBtn7, mBtn8, mBtn9, mBtn10, mBtn11, mBtn12;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mRLayout = (RelativeLayout)findViewById(R.id.content);
		mBtn1 = (Button)findViewById(R.id.btn1);
		mBtn2 = (Button)findViewById(R.id.btn2);
		mBtn3 = (Button)findViewById(R.id.btn3);
		mBtn4 = (Button)findViewById(R.id.btn4);
		mBtn5 = (Button)findViewById(R.id.btn5);
		mBtn6 = (Button)findViewById(R.id.btn6);
		mBtn7 = (Button)findViewById(R.id.btn7);
		mBtn8 = (Button)findViewById(R.id.btn8);
		mBtn9 = (Button)findViewById(R.id.btn9);
		mBtn10 = (Button)findViewById(R.id.btn10);
		mBtn11 = (Button)findViewById(R.id.btn11);
		mBtn12 = (Button)findViewById(R.id.btn12);
		
		mBtn1.setOnClickListener(this);
		mBtn2.setOnClickListener(this);
		mBtn3.setOnClickListener(this);
		mBtn4.setOnClickListener(this);
		mBtn5.setOnClickListener(this);
		mBtn6.setOnClickListener(this);
		mBtn7.setOnClickListener(this);
		mBtn8.setOnClickListener(this);		
		mBtn9.setOnClickListener(this);		
		mBtn10.setOnClickListener(this);		
		mBtn11.setOnClickListener(this);		
		mBtn12.setOnClickListener(this);		
	}
	
	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
		case R.id.btn1:
			//显示状态栏和导航栏，Activity不全屏显示(恢复到有状态的正常情况)
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);	
			break;
		case R.id.btn2:
			//只隐藏状态栏，同时Activity会伸展显示,占用状态栏的位置，滑出状态栏时，不操作状态栏不会隐藏
			mRLayout.setSystemUiVisibility(View.INVISIBLE);
			break;
		case R.id.btn3:
			//只隐藏状态栏，同时Activity会伸展显示,占用状态栏的位置，滑出状态栏时，不操作状态栏不会隐藏，同INVISIBLE
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
			break;		
		case R.id.btn4:
			//沉浸式，布局显示在状态栏下面，导航栏不变
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
			break;
        case R.id.btn5:
        	//沉浸式，布局显示在状态栏和导航栏下面
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
			break;
        case R.id.btn6:
        	//沉浸式，显示在状态栏和导航栏下面，同SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_LAYOUT_FLAGS);
			break;
        case R.id.btn7:
        	//隐藏导航栏，当点击屏幕时，导航栏显示
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
			break;
        case R.id.btn8:
        	//状态栏显示处于低能显示状态(low profile模式)，隐藏导航栏里面的back和home键图标，位置不发送改变
			mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE);
			
			break;
        case R.id.btn9:
        	//只隐藏状态栏，同时Activity会伸展显示,占用状态栏的位置，滑出状态栏时，状态栏会覆盖应用显示，不操作时，状态栏会隐藏
        	mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|View.SYSTEM_UI_FLAG_FULLSCREEN);
        	break;
        case R.id.btn10:
        	//只隐藏导航栏。触摸屏幕时，导航栏不显示。滑不出导航栏
        	mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        	break;
        case R.id.btn11:
        	//只隐藏导航栏。触摸屏幕时，导航栏不显示。滑得出导航栏
        	mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        	break;
        case R.id.btn12:
        	//只隐藏导航栏，此时应用的布局不会扩张。触摸屏幕时，导航栏显示。滑得出导航栏。
        	mRLayout.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        	break;
		}
	}

}