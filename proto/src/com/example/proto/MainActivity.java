package com.example.proto;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button one,two,thr,four,FIVE,six,SEVE,EI,NI,TE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(Button)findViewById(R.id.button1);
        two=(Button)findViewById(R.id.button3);
        thr=(Button)findViewById(R.id.button2);
        four=(Button)findViewById(R.id.button4);
        FIVE=(Button)findViewById(R.id.smtp);
        six=(Button)findViewById(R.id.button5);
        SEVE=(Button)findViewById(R.id.button6);
        EI=(Button)findViewById(R.id.button7);
        NI=(Button)findViewById(R.id.button8);
        TE=(Button)findViewById(R.id.button9);
NI.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,rarp.class);
				startActivity(Vintent);
				
			}
		});
TE.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,dhcp.class);
				startActivity(Vintent);
				
			}
		});
EI.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,http.class);
				startActivity(Vintent);
				
			}
		});

SEVE.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,pop.class);
				startActivity(Vintent);
				
			}
		});


six.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,ftp.class);
				startActivity(Vintent);
				
			}
		});

FIVE.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,smtp.class);
				startActivity(Vintent);
				
			}
		});
        

four.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,udp.class);
				startActivity(Vintent);
				
			}
		});
        

        thr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,iggg.class);
				startActivity(Vintent);
				
			}
		});
        two.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,igmpdef.class);
				startActivity(Vintent);
				
			}
		});
        one.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(MainActivity.this,tcpip.class);
				startActivity(Vintent);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
