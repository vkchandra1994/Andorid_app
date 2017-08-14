package com.vkc.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by vishnu on 5/3/17.
 */

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        Intent i1=getIntent();
        Bundle b=i1.getExtras();
        String pro=b.getString("key");

        if(pro.equals("programs")) {
            Intent i = new Intent(this, WebView.class);
            i.putExtra("url", "Basic Input output");
            startActivity(i);
            finish();
        }
        if(pro.equals("question"))
        {
            Intent i = new Intent(this, WebView.class);
            i.putExtra("url", "Basic Input output");
            startActivity(i);
            finish();

        }
        if(pro.equals("interview"))
        {
            Intent i = new Intent(this, WebView.class);
            i.putExtra("url", "intrview");
            startActivity(i);
            finish();

        }
        if(pro.equals("mcq"))
        {
            Intent i = new Intent(this, WebView.class);
            i.putExtra("url", "mcq1");
            startActivity(i);
            finish();

        }
    }
}
