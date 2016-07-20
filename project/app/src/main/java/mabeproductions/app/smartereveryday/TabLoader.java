package mabeproductions.app.smartereveryday;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatCallback;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TabHost;
import android.widget.TextView;

public class TabLoader extends TabActivity implements AppCompatCallback {

    private AppCompatDelegate delegate;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        delegate.getMenuInflater().inflate(R.menu.app_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {





        delegate = AppCompatDelegate.create(this, this);

        delegate.onCreate(savedInstanceState);

        delegate.setContentView(R.layout.activity_tab_loader);

        Toolbar toolbar= (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));

        delegate.setSupportActionBar(toolbar);

        super.onCreate(savedInstanceState);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("dailyfact");
        tabSpec.setContent(new Intent(this, DailyFactActivity.class));
        tabSpec.setIndicator("Daily fact");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("allfacts");
        tabSpec.setContent(new Intent(this, AllFacts.class));
        tabSpec.setIndicator("All facts");
        tabHost.addTab(tabSpec);

        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {

            TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#ffffff"));
        }

    }


    @Override
    public void onSupportActionModeStarted(ActionMode mode) {

    }

    @Override
    public void onSupportActionModeFinished(ActionMode mode) {

    }

    @Nullable
    @Override
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    public void rateus(MenuItem item){

    }
    public void feedback(MenuItem item){

    }

}
