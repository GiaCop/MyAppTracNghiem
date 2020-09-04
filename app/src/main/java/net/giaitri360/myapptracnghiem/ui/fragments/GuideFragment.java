package net.giaitri360.myapptracnghiem.ui.fragments;

import net.giaitri360.myapptracnghiem.R;
import net.giaitri360.myapptracnghiem.ui.adapter.GuideAdater;
import net.giaitri360.myapptracnghiem.ui.custom_view.CirclePageIndicator;
import net.giaitri360.myapptracnghiem.ui.intallize.BaseFragment;

import androidx.viewpager.widget.ViewPager;

public class GuideFragment extends BaseFragment {
    private ViewPager vpGuide;
    private CirclePageIndicator circleIn;
    private GuideAdater guideAdater;
    @Override
    protected int getLayout() {

        return R.layout.fragmentguide;
    }

    @Override
    protected void initViews() {
        vpGuide=(ViewPager)view.findViewById(R.id.vpGuide);
        circleIn=(CirclePageIndicator)view.findViewById(R.id.circleIn);




    }

    @Override
    protected void main() {
        guideAdater =new GuideAdater(getFragmentManager());
        vpGuide.setAdapter(guideAdater);
        circleIn.setViewPager(vpGuide);


    }
}
