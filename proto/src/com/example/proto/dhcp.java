package com.example.proto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class dhcp extends Activity{

    private ImageView im;
private Button iButton, gButton;

private int currentImage = 0;
int[] images = {  R.drawable.d6, R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6  }; 

public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.tt);

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
	


