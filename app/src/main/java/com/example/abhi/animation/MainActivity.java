package com.example.abhi.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtMessage;
    Button btnStart;
    Animation animBlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage = (TextView)findViewById(R.id.text);
        btnStart = (Button)findViewById(R.id.btn);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);

        animBlink.setAnimationListener(this);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMessage.setVisibility(View.VISIBLE);
                txtMessage.startAnimation(animBlink);
            }
        });
    }
    @Override
    public void onAnimationEnd(Animation animation){
        if(animation==animBlink){

        }
    }
    @Override
    public void onAnimationRepeat(Animation animation){

    }

    @Override
    public void onAnimationStart(Animation animation){

    }




}
