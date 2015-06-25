package com.example.proto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ftp extends Activity{
    private ImageView im;
private Button iButton, gButton;

private int currentImage = 0;
int[] images = { R.drawable.ftp7, R.drawable.ftp1, R.drawable.ftp2, R.drawable.ftp3, R.drawable.ftp4, R.drawable.ftp5,R.drawable.ftp6, R.drawable.ftp7 
  }; 

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.ftp);
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
	


