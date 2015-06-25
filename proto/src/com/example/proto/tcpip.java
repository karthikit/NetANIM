package com.example.proto;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class tcpip extends Activity {
	Button gg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tcpip);
		gg=(Button)findViewById(R.id.button1);
		gg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent Vintent=new Intent(tcpip.this,tt.class);
				startActivity(Vintent);
				
			}
		});
	}

}
