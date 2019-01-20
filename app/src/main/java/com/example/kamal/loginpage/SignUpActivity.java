package com.example.kamal.loginpage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysignup);

        //adding animation to logo
        fade();
    }

    public void fade(){
        ImageView image = (ImageView)findViewById(R.id.logo_img);
        TextView init_text = (TextView)findViewById(R.id.init_text);

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        Animation animation2 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fadetext);
        image.startAnimation(animation1);
        init_text.startAnimation(animation2);
    }
}
