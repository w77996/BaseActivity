package com.w77996.baseactivitydemo;

import android.os.Bundle;

import me.imid.swipebacklayout.lib.SwipeBackLayout;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setFlag(int flage) {

        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_ALL);
      //  flage = SwipeBackLayout.EDGE_ALL;
    }
}
