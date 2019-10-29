package com.dodemy.android.androidfonts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val typeface = ResourcesCompat.getFont(this, R.font.my_custom_font)
        textView.typeface = typeface

        //OR
        val typeface2 = ResourcesCompat.getFont(this, R.font.myfont)
        textView.typeface = typeface2
    }
}
//Typeface typeface = ResourcesCompat.getFont(this, R.font.roboto);
//.............or........................
//Typeface typeface = getResources.getFont(R.font.roboto);
// textView.setTypeface(typeface);