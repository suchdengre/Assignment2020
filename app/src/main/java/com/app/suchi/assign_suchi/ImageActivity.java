package com.app.suchi.assign_suchi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.trncic.library.DottedProgressBar;

public class ImageActivity extends AppCompatActivity {
    DottedProgressBar bar;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        bar = (DottedProgressBar) findViewById(R.id.progress);
        bar.startProgress();
        img1=findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ImageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
