package chandan.prasad.dayeightandroidanimatinapp;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class Images_Animation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images_animation);

        ImageView img = findViewById(R.id.img_aimation);


        AnimationDrawable animationDrawable = (AnimationDrawable) img.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();

    }
}
