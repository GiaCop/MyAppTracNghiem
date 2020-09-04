package net.giaitri360.myapptracnghiem.ui.fragments;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import net.giaitri360.myapptracnghiem.R;
import net.giaitri360.myapptracnghiem.common.objects.SharePreference;
import net.giaitri360.myapptracnghiem.ui.intallize.BaseFragment;

public class ScoreFragment extends BaseFragment {
    private TextView mtvEmptyData;
     private TextView mtvBestScore;
     private ListView lnNearScore;

    private View lnData;

    @Override
    protected int getLayout() {
        return R.layout.frament_score;
    }

    @Override
    protected void initViews() {
        mtvEmptyData =(TextView)view.findViewById(R.id.tvEmptyData);
        mtvBestScore =(TextView)view.findViewById(R.id.tvBestScore);
        lnNearScore =(ListView)view.findViewById(R.id.lvNearScore);
        lnData=view.findViewById(R.id.lnData);



    }

    @Override
    protected void main() {
        if(!SharePreference.getInstance(getActivity()).isPlayed()) {
            mtvEmptyData.setVisibility(View.VISIBLE);
            lnData.setVisibility(View.GONE);
        }
        else {
            mtvEmptyData.setVisibility(View.VISIBLE);
            lnData.setVisibility(View.GONE);
        }

    }
}
