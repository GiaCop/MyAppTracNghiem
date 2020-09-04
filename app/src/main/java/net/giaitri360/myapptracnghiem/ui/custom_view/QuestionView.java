package net.giaitri360.myapptracnghiem.ui.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import net.giaitri360.myapptracnghiem.R;

import androidx.annotation.Nullable;

public
class QuestionView extends LinearLayout {
    public QuestionView(Context context) {
        this(context,null);
    }

    public QuestionView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs,0);
    }

    public QuestionView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view= LayoutInflater.from(context).inflate(R.layout.custom_question_view,null);
        initView(view);
        addView(view);
    }

    private void initView(View view) {
    }


}
