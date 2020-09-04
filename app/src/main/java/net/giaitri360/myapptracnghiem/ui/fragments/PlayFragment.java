package net.giaitri360.myapptracnghiem.ui.fragments;

import android.view.View;
import android.widget.Button;

import net.giaitri360.myapptracnghiem.R;
import net.giaitri360.myapptracnghiem.common.interfaces.LevelListening;
import net.giaitri360.myapptracnghiem.common.objects.Level;
import net.giaitri360.myapptracnghiem.ui.intallize.BaseFragment;

public class PlayFragment extends BaseFragment implements View.OnClickListener {
    private Button btnE;
    private Button btnH;
    private Button btnD;

    @Override
    protected int getLayout() {
        return R.layout.frament_play;
    }

    @Override
    protected void initViews() {
        btnE = (Button) view.findViewById(R.id.btnTB);
        btnH = (Button) view.findViewById(R.id.btnDe);
        btnD = (Button) view.findViewById(R.id.btnKho);


    }

    @Override
    protected void main() {
        btnE.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnD.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Level level;
        if (view == btnE) {
            level = Level.easy;

        } else if (view == btnH) {
            level = Level.medium;


        } else {
            level = Level.dificult;



        }
        if(getActivity()instanceof LevelListening){
            ((LevelListening)getActivity()).onChoiceLevel(level);
        }


    }
}
