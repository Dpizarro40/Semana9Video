package com.example.semana9video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView mivideo=findViewById(R.id.viVisor);
        String videop = "android.resource://" + getPackageName() + "/" + R.raw.joji_foie_dump;
        Uri uri = Uri.parse(videop);
        //Establece la fuente del video del VideoView (mivideo) utilizando el Uri que acabamos de crear.
        //Esto le dice al VideoView qué video debe mostrar.
        mivideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        mivideo.setMediaController(mediaController);
        mediaController.setAnchorView(mivideo);
    }
}