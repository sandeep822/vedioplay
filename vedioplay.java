package com.example.vedio;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button b;
    VideoView vi;
    MediaController mediac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        vi=(VideoView)findViewById(R.id.videoView);
        mediac=new MediaController(this);
    }
    public void videoplayer(View v)
    {
        String videopath="android.resource://com.example.vedio/"+R.raw.saaho;
        Uri uri=Uri.parse(videopath);
        vi.setVideoURI(uri);
        vi.setMediaController(mediac);
        mediac.setAnchorView(vi);
        vi.start();
    }
}
