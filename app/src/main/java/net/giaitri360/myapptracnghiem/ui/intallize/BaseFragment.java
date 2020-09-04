package net.giaitri360.myapptracnghiem.ui.intallize;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {
    protected View view;
    protected abstract  int getLayout();
    protected abstract  void initViews();
    protected abstract  void main();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view =inflater.inflate(getLayout(),container,false);
        initViews();
        main();
        return  view;
    }
}
