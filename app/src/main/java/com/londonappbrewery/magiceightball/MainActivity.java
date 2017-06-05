package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView imageView = (ImageView) findViewById(R.id.image_ask);
        Button btn = (Button) findViewById(R.id.askButton);

        final int[] ballArray = {R.drawable.ball1
                                ,R.drawable.ball2
                                ,R.drawable.ball3
                                ,R.drawable.ball4
                                ,R.drawable.ball5
        };





btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        Random r = new Random();
        int num = r.nextInt(5);

        imageView.setImageResource(ballArray[num]);

    }
});









    }
}
