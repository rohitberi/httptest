package com.example.roberi.httptest;

//import android.os.StrictMode;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;
//import java.net.HttpURLConnection;
//import java.net.URL;

public class MainActivity extends AppCompatActivity {

//    final static String url = "http://www.google.com";
    private Animation anim;
    private Button btnAnimate;
    //= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnimate = (Button)findViewById(R.id.btnAnimate);
        btnAnimate.setOnClickListener(lOnClick);
    }

/*
    private OnClickListener btnLaunchOnClick = new OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    };
*/

    private OnClickListener lOnClick = new OnClickListener() {
        @Override
        public void onClick(View view) {

//            Toast.makeText(getApplicationContext(), "Value of TextView: " + String.valueOf(R.id.txtDisplayWorld) + "   Value of view object: " + String.valueOf(view.getId()), Toast.LENGTH_SHORT).show();

            if (view.getId() == R.id.btnAnimate){
                Toast.makeText(getBaseContext(), "Display World Clicked", Toast.LENGTH_LONG).show();
                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
//            Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                btnAnimate.setAnimation(anim);
                btnAnimate.startAnimation(anim);
            }
            else {
                Toast.makeText(getBaseContext(), "Launch Button Clicked", Toast.LENGTH_LONG).show();
                Uri address = Uri.parse("http://www.yahoo.com");
                Intent iSurf = new Intent(Intent.ACTION_VIEW,address);
                //startActivities(iSurf);
            }
        }
    };

    /*
    }

    private OnClickListener lOnClick = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getBaseContext(), "Click Message", Toast.LENGTH_LONG).show();
            //Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),);
           //txtDisplayWorld.setAnimation(anim);
        }
    };
*/


//    try{
//        HttpURLConnection con = (HttpURLConnection) ( new URL(url)).openConnection();
//        con.setRequestMethod("POST");
//        con.setDoInput(true);
//        con.setDoOutput(true);
//        con.connect();
//    }
}
