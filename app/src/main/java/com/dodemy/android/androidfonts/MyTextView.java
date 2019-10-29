package com.dodemy.android.androidfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyTextView extends TextView {

    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/dancingscript_bold.ttf");
        setTypeface(tf, Typeface.BOLD_ITALIC);
    }
}
//TextView tv = (TextView)findViewById(R.id.textview1);
//Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/font-name.ttf");
//tx.setTypeface(custom_font);