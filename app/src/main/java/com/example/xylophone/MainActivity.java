package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

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

        csound = mSoundPool.load(getApplicationContext(),R.raw.c,1);
        dsound = mSoundPool.load(getApplicationContext(),R.raw.d,1);
        esound = mSoundPool.load(getApplicationContext(),R.raw.e,1);
        fsound = mSoundPool.load(getApplicationContext(),R.raw.f,1);
        gsound = mSoundPool.load(getApplicationContext(),R.raw.g,1);
        asound = mSoundPool.load(getApplicationContext(),R.raw.a,1);
        bsound = mSoundPool.load(getApplicationContext(),R.raw.b,1);


    }
    public void playc(View v){
        mSoundPool.play(csound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }
    public void playd(View v){
        mSoundPool.play(dsound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }
    public void playe(View v){
        mSoundPool.play(esound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }
    public void playf(View v){
        mSoundPool.play(fsound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }
    public void playg(View v){
        mSoundPool.play(gsound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }
    public void playa(View v){
        mSoundPool.play(asound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }
    public void playb(View v){
        mSoundPool.play(bsound,LEFT_VOLUME,RIGHT_VOLUME,priority,no_loop,normal_play_rate);
    }



}
