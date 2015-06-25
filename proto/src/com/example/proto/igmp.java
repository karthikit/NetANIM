package com.example.proto;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class igmp extends Activity {
	 private ImageView im;
	 private Button iButton, gButton;
	 

	 private int currentImage = 0;
	 int[] images = { R.drawable.icstart, R.drawable.nncfi, R.drawable.nncseco, R.drawable.nncthir, R.drawable.icfour, R.drawable.icfive,  R.drawable.icsix, R.drawable.icseve, R.drawable.iceigh, R.drawable.icnin, R.drawable.ictent,   }; 

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
	        // Toast.makeText(igmp.this, "FILE TRANSFER USING ICMP PROTOCOL", Toast.LENGTH_LONG).show();
	         

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