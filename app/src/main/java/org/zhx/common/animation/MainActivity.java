package org.zhx.common.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView animateImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animateImg = findViewById(R.id.animate_img);
        //XML 实现帧动画
//        AnimationDrawable drawable = (AnimationDrawable) animateImg.getDrawable();

       // 代码实现 帧动画
        AnimationDrawable animateDrawable = new AnimationDrawable();
        animateImg.setImageDrawable(animateDrawable);
        Drawable fram1 = getResources().getDrawable(R.drawable.ic_loading_white_01);
        animateDrawable.addFrame(fram1, 80);
        Drawable fram2 = getResources().getDrawable(R.drawable.ic_loading_white_02);
        animateDrawable.addFrame(fram2, 80);
        Drawable fram3 = getResources().getDrawable(R.drawable.ic_loading_white_03);
        animateDrawable.addFrame(fram3, 80);
        Drawable fram4 = getResources().getDrawable(R.drawable.ic_loading_white_04);
        animateDrawable.addFrame(fram4, 80);
        Drawable fram5 = getResources().getDrawable(R.drawable.ic_loading_white_05);
        animateDrawable.addFrame(fram5, 80);
        Drawable fram6 = getResources().getDrawable(R.drawable.ic_loading_white_06);
        animateDrawable.addFrame(fram6, 80);
        Drawable fram7 = getResources().getDrawable(R.drawable.ic_loading_white_07);
        animateDrawable.addFrame(fram7, 80);
        Drawable fram8 = getResources().getDrawable(R.drawable.ic_loading_white_08);
        animateDrawable.addFrame(fram8, 80);
        Drawable fram9 = getResources().getDrawable(R.drawable.ic_loading_white_09);
        animateDrawable.addFrame(fram9, 80);
        Drawable fram10 = getResources().getDrawable(R.drawable.ic_loading_white_10);
        animateDrawable.addFrame(fram10, 80);
        Drawable fram11 = getResources().getDrawable(R.drawable.ic_loading_white_11);
        animateDrawable.addFrame(fram11, 80);
        Drawable fram12 = getResources().getDrawable(R.drawable.ic_loading_white_12);
        animateDrawable.addFrame(fram12, 80);

        findViewById(R.id.start_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //开始动画
                animateDrawable.start();
            }
        });
        findViewById(R.id.end_tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //结束动画
                animateDrawable.stop();
            }
        });


    }
}