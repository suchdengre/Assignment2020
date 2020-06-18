package com.app.suchi.assign_suchi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private static final String TAG="MainActivity";
    ImageView img2;
    YouTubePlayerView mYouTubePlayerView;
    Button btn;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Log.d(TAG, "onCreate: Starting");
        mYouTubePlayerView=(YouTubePlayerView) findViewById(R.id.video);
       mYouTubePlayerView.initialize(YoutubeConfig.getApiKey(), this);
              //  btn=(Button) findViewById(R.id.btn);
             /*   mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
                    @Override
                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                        Log.d(TAG, "onClick: Done Initializing");
                        youTubePlayer.loadVideo("_oEA18Y8gM0");
                        youTubePlayer.play();
                    }

                    @Override
                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                        Log.d(TAG, "onClick: Fail to Initializing");
                    }
                };*/
              /*  btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d(TAG, "onClick: Youtube Player");
                        mYouTubePlayerView.initialize(YoutubeConfig.getApiKey(),mOnInitializedListener);
                        Log.d(TAG, "onClick: Done Initializing");
                    }
                });*/
        img2=findViewById(R.id.img2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VideoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        Log.d(TAG, "onClick: Done Initializing");
        youTubePlayer.loadVideo("CJN1n3fId_A");
        youTubePlayer.play();
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Log.d(TAG, "onClick: Fail to Initializing");
    }

}
