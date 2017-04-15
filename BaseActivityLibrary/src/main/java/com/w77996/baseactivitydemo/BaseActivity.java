package com.w77996.baseactivitydemo;

import android.os.Bundle;

import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;


/**
 * time:2017/4/11
 * Created by w77996
 * Github:https://github.com/w77996
 * CSDN:http://blog.csdn.net/w77996?viewmode=contents
 */
public abstract class BaseActivity extends SwipeBackActivity {
    //初始化控件
    public SwipeBackLayout mSwipeBackLayout;
  //  private int flag ;
    int edgeFlag = SwipeBackLayout.EDGE_LEFT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化butterknife
     //   ButterKnife.bind(this);
        mSwipeBackLayout = getSwipeBackLayout();

       // mSwipeBackLayout.setEdgeTrackingEnabled(flag);

    }
    public abstract  void setFlag(int flage);

}
