package net.giaitri360.myapptracnghiem.ui.activities;

import android.content.Intent;
import android.os.Handler;

import net.giaitri360.myapptracnghiem.R;
import net.giaitri360.myapptracnghiem.ui.intallize.BaseActivity;

public class Splash extends BaseActivity {
    private static final long DELAY_TIME = 3000;
    @Override
    protected int getLayout() {
        return R.layout.activity_plash;
    }

    @Override
    protected void initViews() {
    }

    @Override
    protected void main() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openActivity(new Intent(Splash.this, HomeActivity.class),MO);
                finish();
            }
        },DELAY_TIME);

    }
}