package net.giaitri360.myapptracnghiem.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import net.giaitri360.myapptracnghiem.R;
import net.giaitri360.myapptracnghiem.common.interfaces.LevelListening;
import net.giaitri360.myapptracnghiem.common.objects.Level;
import net.giaitri360.myapptracnghiem.ui.fragments.GuideFragment;
import net.giaitri360.myapptracnghiem.ui.fragments.PlayFragment;
import net.giaitri360.myapptracnghiem.ui.fragments.ScoreFragment;
import net.giaitri360.myapptracnghiem.ui.intallize.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeActivity extends BaseActivity implements View.OnClickListener, LevelListening {
    private static final String TAG = HomeActivity.class.getSimpleName();
    private Button btnPlay;
    private Button btnScore;
    private Button btnGuide;
    private Button btnExit;
    private FrameLayout frHome;


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        btnPlay=(Button)findViewById(R.id.btnPlay);
        btnScore=(Button)findViewById(R.id.btnDiem);
        btnGuide=(Button)findViewById(R.id.btnGuide);
        btnExit=(Button)findViewById(R.id.btnExit);
        frHome=(FrameLayout) findViewById(R.id.frHome);
        setVisibleAllButton(false);
        frHome.setVisibility(View.GONE);
        btnPlay.setOnClickListener(this);
        btnScore.setOnClickListener(this);
        btnGuide.setOnClickListener(this);
        btnExit.setOnClickListener((View.OnClickListener) this);



    }



    @Override
    protected void main() {
        showAnimationButton();
        showFragmentHome();
        replayFr(new PlayFragment());


    }
    private void showFragmentHome(){
        int timeStart=10;
        TranslateAnimation animaShowinLeft= (TranslateAnimation) AnimationUtils.loadAnimation(this, R.anim.anim_right_in);
        animaShowinLeft.setStartOffset(timeStart);
        frHome.setVisibility(View.VISIBLE);
        frHome.startAnimation(animaShowinLeft);


    }

    private void showAnimationButton() {
        List<Button> buttons=new ArrayList<>();
        buttons.add(btnPlay);
        buttons.add(btnScore);
        buttons.add(btnGuide);
        buttons.add(btnExit);
        int timeBetween  =500;
        int timeStart=10;
        for(Button button:buttons){


            TranslateAnimation animaShowinLeft= (TranslateAnimation) AnimationUtils.loadAnimation(this, R.anim.anim_left_in);
            animaShowinLeft.setStartOffset(timeStart);
            button.setVisibility(View.VISIBLE);
            button.startAnimation(animaShowinLeft);

            timeStart +=timeBetween;


        }

    }
    private  void setVisibleAllButton(boolean isvisible){
        btnPlay.setVisibility(isvisible? View.VISIBLE: View.GONE);
        btnScore.setVisibility(isvisible? View.VISIBLE: View.GONE);
        btnGuide.setVisibility(isvisible? View.VISIBLE: View.GONE);
        btnExit.setVisibility(isvisible? View.VISIBLE: View.GONE);


    }

    @Override
    public void onClick(View view) {
        if(view==btnPlay){
            replayFr(new PlayFragment());
        }
       else if(view==btnScore){
           replayFr(new ScoreFragment());
        }
        else if(view==btnGuide){
          //  Toast.makeText(this,"Helo",Toast.LENGTH_SHORT).show();
           replayFr(new GuideFragment());
        }
        else if(view==btnExit){
            close();
        }

    }
    private void replayFr(Fragment fragment){
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(frHome.getId(),fragment,fragment.toString());
        transaction.addToBackStack(fragment.toString());
        transaction.commit();


    }

    @Override
    public void onChoiceLevel(Level level) {
        Log.d(TAG, "choice level= "+level.getValue());
        openActivity(new Intent(this, PlayActivity.class),MO);

    }
}