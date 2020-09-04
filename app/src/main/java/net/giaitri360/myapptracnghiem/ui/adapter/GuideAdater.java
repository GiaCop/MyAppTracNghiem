package net.giaitri360.myapptracnghiem.ui.adapter;

import net.giaitri360.myapptracnghiem.ui.fragments.GuideLevel;
import net.giaitri360.myapptracnghiem.ui.fragments.GuideOverview;
import net.giaitri360.myapptracnghiem.ui.fragments.GuidePauseAndExit;
import net.giaitri360.myapptracnghiem.ui.fragments.GuideScore;
import net.giaitri360.myapptracnghiem.ui.fragments.GuideScoreandTime;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class GuideAdater extends FragmentPagerAdapter {
    public GuideAdater( FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if(position==0) {
            fragment = new GuideOverview();
        }
//        } else if(position==1){
//            fragment=new GuideLevel();
//
//        }else if(position==2){
//            fragment=new GuideScoreandTime();
//
//        }
//        else if(position==3){
//            fragment=new GuideScore();
//        }
//        else if(position==4){
//            fragment=new GuidePauseAndExit();
//
//        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
