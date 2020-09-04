package net.giaitri360.myapptracnghiem.ui.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import net.giaitri360.myapptracnghiem.R;

public
class AnswerView extends RelativeLayout {
    public AnswerView(Context context) {
        this(context,null);
    }

    public AnswerView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public AnswerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view= LayoutInflater.from(context).inflate(R.layout.custom_answer_view,null);
        innitViews(view);
        addView(view);
    }

    private void innitViews(View view) {
    }
}
