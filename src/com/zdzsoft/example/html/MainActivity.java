package com.zdzsoft.example.html;

import com.zdzsoft.lib.ui.ZDZWebLauncher;
import com.zdzsoft.lib.ui.anim.ZDZAnim;
import com.zdzsoft.lib.ui.anim.AnimClearBackEvent;

import android.os.Bundle;

/**
 * 主入口
 * @author    zdzsoft
 * @link      www.zdzsoft.com
 * @Copyright BeiJing ZDZ Tech Co.LTD
 */
public class MainActivity extends ZDZWebLauncher {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setBackground(R.drawable.welcome);
		setAnim(ZDZAnim.TYPE_FADE, 1000).addEvent(new AnimClearBackEvent(this));
		loadLocal();
	}
}

