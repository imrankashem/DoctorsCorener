package com.example.imran.doctorscorner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by imran on 6/7/2017.
 */

public class chittagongdoc2 extends Activity {
    boolean isImageFitToScreen;
    ImageView imageView;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chittagong_doc2);
        imageView = (ImageView) findViewById(R.id.docchi);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isImageFitToScreen) {
                    isImageFitToScreen=false;
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                    imageView.setAdjustViewBounds(true);
                }else{
                    isImageFitToScreen=true;
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }

            }
        });




    }
}
