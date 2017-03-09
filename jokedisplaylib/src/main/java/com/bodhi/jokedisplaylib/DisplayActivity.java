package com.bodhi.jokedisplaylib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    public static final String JOKR_Extra = "jkr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent i = getIntent();
        String s = i.getStringExtra(JOKR_Extra);
        if(s==null){
            s = getString(R.string.error_message);
        }
        TextView tv = (TextView)findViewById(R.id.txt);
        tv.setText(s);
    }
}
