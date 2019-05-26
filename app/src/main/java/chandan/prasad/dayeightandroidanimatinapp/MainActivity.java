package chandan.prasad.dayeightandroidanimatinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button show_images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show_images = findViewById(R.id.show_img_btns);


        show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent images = new Intent(MainActivity.this,Images_Animation.class);
                startActivity(images);
            }
        });

    }


    public void Show_Color_animation(View view) {
        Intent colors = new Intent(MainActivity.this,Color_Aniamtion.class);
        startActivity(colors);
    }



    public void show_other_anamtion(View view) {
        Intent other = new Intent(MainActivity.this,Other_Aniamtion.class);
        startActivity(other);
    }

}
