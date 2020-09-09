package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final  int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME  = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int no_loop = 0;
    private final int priority = 0;
    private final float normal_play_rate = 1.0f;
    private SoundPool mSoundPool;
    private int csound;
    private int dsound;
    private int esound;
    private int fsound;
    private int gsound;
    private int asound;
    private int bsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);




    }

}
