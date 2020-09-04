package net.giaitri360.myapptracnghiem.ui.intallize;

import android.content.Intent;
import android.os.Bundle;

import net.giaitri360.myapptracnghiem.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    protected  static final int MO = 0;
    protected  static final int DONG = 1;
    protected abstract  int getLayout();
    protected abstract  void initViews();
    protected abstract  void main();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initViews();
        main();


    }
    protected void openActivity(Intent intent, int type){
        startActivity(intent);
        if(type == MO){
            overridePendingTransition(R.anim.anim_right_in,R.anim.anim_left_out);
        }
        else{
            overridePendingTransition(R.anim.anim_left_in,R.anim.anim_right_out);


        }

    }
    protected  void close(){
        finish();
        overridePendingTransition(R.anim.anim_left_in,R.anim.anim_right_out);

    }
}
