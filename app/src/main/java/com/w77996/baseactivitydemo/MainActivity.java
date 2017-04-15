package com.w77996.baseactivitydemo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.imid.swipebacklayout.lib.SwipeBackLayout;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tt)
    TextView tt;
/*    @BindView(R.id.toolbar)
    Toolbar toolbar;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // ((AppCompatActivity)getBaseContext()).setSupportActionBar(toolbar);
        ActionBar actionBar =getSupportActionBar();
      //  if (actionBar!=null)
       //setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        tt.setText("fdasf");
    }

    @Override
    public void setFlag(int flage) {

        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_ALL);
        //  flage = SwipeBackLayout.EDGE_ALL;
    }
}
