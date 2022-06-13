package com.androidprojects.animation

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Homepage : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var blinkBTN: Button
    lateinit var rotateBTN: Button
    lateinit var fadeBTN:Button
    lateinit var moveBTN:Button
    lateinit var slideBTN:Button
    lateinit var zoomBTN:Button
    lateinit var stopBTN:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        imageView = findViewById(R.id.imageview);
        blinkBTN = findViewById(R.id.BTNblink)
        rotateBTN = findViewById(R.id.BTNrotate)
        fadeBTN = findViewById(R.id.BTNfade)
        moveBTN = findViewById(R.id.BTNmove)
        slideBTN = findViewById(R.id.BTNslide)
        zoomBTN = findViewById(R.id.BTNzoom)
        stopBTN = findViewById(R.id.BTNstop)

        blinkBTN.setOnClickListener {
            val animation : Animation = AnimationUtils.loadAnimation(this, R.anim.activity_blink)
            imageView.startAnimation(animation)
        }

        rotateBTN.setOnClickListener {
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.activity_rotate)
            imageView.startAnimation(animation)
        }

        fadeBTN.setOnClickListener {
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.activity_fade)
            imageView.startAnimation(animation)
        }

        moveBTN.setOnClickListener {
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.activity_move)
            imageView.startAnimation(animation)
        }

        slideBTN.setOnClickListener {
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.activity_slide)
            imageView.startAnimation(animation)
        }

        zoomBTN.setOnClickListener{
            var animation : Animation = AnimationUtils.loadAnimation(this, R.anim.activity_zoom)
            imageView.startAnimation(animation)
        }

        stopBTN.setOnClickListener {

            imageView.clearAnimation()
        }
    }
}