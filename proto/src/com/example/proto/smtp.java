package com.example.proto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ZoomControls;


public class smtp  extends Activity{
    private ImageView im;
private Button iButton, gButton;

private int currentImage = 0;
int[] images = { R.drawable.smp7, R.drawable.smp1, R.drawable.smp2, R.drawable.smp3, R.drawable.smp4, R.drawable.smp5,R.drawable.smp6, R.drawable.smp7 
  }; 

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.smtp);
   // zoom = (ZoomControls) findViewById(R.id.zoomControls1);
    

    im = (ImageView)findViewById(R.id.imageView1);
    iButton = (Button) findViewById(R.id.button1);
    gButton = (Button) findViewById(R.id.button2);
    //Just set one Click listener for the image

    iButton.setOnClickListener(iButtonChangeImageListener);
    gButton.setOnClickListener(gButtonChangeImageListener);

}
View.OnClickListener iButtonChangeImageListener = new OnClickListener() {

    public void onClick(View v) {
        //Increase Counter to move to next Image
        currentImage++;
        currentImage = currentImage % images.length;

        im.setImageResource(images[currentImage]);

    }
};

View.OnClickListener gButtonChangeImageListener = new OnClickListener() {

    public void onClick(View v) {
        //Increase Counter to move to next Image
        currentImage--;
        currentImage = (currentImage + images.length) % images.length;

        im.setImageResource(images[currentImage]);

    }
};



	}
	


