package com.example.tipcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    
    
    
	public double tip,amount; String bName;
	int bId;
	public void calculateTip(View v) {
		final Button button10 = (Button) findViewById(R.id.button10),
        button15 = (Button) findViewById(R.id.button15),
        button20 = (Button) findViewById(R.id.button20);
		final EditText input1=(EditText) findViewById(R.id.editText1);
		final TextView output1=(TextView) findViewById(R.id.textView1);
		output1.setText("");
		Button b = (Button)v;
		bName=b.getText().toString();
		bId=b.getId();
		if(input1.getText()!=null){
			amount=Double.parseDouble(input1.getText().toString());
		}else{
			amount=0;
		}
		if(input1.getText()!=null){
			switch(v.getId())
			{
                case R.id.button10:
                    tip=0.1*amount;
                    break;
                case R.id.button15:
                    tip=0.15*amount;
                    break;
                case R.id.button20:
                    tip=0.2*amount;
                    break;
                default:
                    throw new RuntimeException("Unknown error");
			}
		}
		output1.setText("Tip is : $"+Double.toString(tip));
        
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
    
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
    
    
    
}
