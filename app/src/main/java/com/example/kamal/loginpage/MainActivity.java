package com.example.kamal.loginpage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button toSignUp;
    private EditText email;
    private EditText passwrd;
    private TextView txtEmail;
    private TextView txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //adding animations to logo on the top
        rotate();


        //setting up onClick functionality for signup
        toSignUp = (Button)findViewById(R.id.signup);
        toSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent,ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());

            }
        });


        //adding references to the editText and Password
        email = (EditText)findViewById(R.id.email);
        txtEmail = (TextView)findViewById(R.id.emailtxt);

        passwrd=(EditText)findViewById(R.id.password);
        txtPass = (TextView)findViewById(R.id.passtxt);


        //changing color when user clicks on the editText field
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEmail.setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        passwrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPass.setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });
    }



    public void rotate(){
        ImageView image = (ImageView)findViewById(R.id.logo_img);
        TextView init_text = (TextView)findViewById(R.id.init_text);

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.rotate);
        Animation animation2 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fadetext);
        image.startAnimation(animation1);
        init_text.startAnimation(animation2);
    }


}
