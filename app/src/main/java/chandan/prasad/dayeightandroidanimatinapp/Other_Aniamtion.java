package chandan.prasad.dayeightandroidanimatinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Other_Aniamtion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_aniamtion);

        final ImageView imageView = findViewById(R.id.img_other);
        Button fade = findViewById(R.id.fade_btn);
        Button scale = findViewById(R.id.scale_btn);


        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(Other_Aniamtion.this,R.anim.fade);
                imageView.startAnimation(animation);
            }
        });


        scale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(Other_Aniamtion.this,R.anim.scale);
                imageView.startAnimation(animation);
            }
        });
    }
}
