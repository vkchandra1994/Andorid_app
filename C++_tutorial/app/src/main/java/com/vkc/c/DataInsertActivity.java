package com.vkc.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataInsertActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_layout);
        //String name = (String) getIntent().getExtras().get("title");
        Intent intent = getIntent();
        int a = intent.getIntExtra("position", 0);
        int b = intent.getIntExtra("position1", 0);
      // Toast.makeText(this, "" + (a + 1) + " " + (b + 1), Toast.LENGTH_SHORT).show();

       // Toast.makeText(this, " " + name + " ", Toast.LENGTH_LONG).show();
       TextView textView = (TextView) findViewById(R.id.desc);
        if(a+1==1 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","sample");
            startActivity(i);
            finish();
        }
       if(a+1==1 && b+1==2)
       {
           Intent i=new Intent(this, WebView.class);
           i.putExtra("url","cplus");
           startActivity(i);
           finish();
       }
        if(a+1==1 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","BasicSyntax");
            startActivity(i);
            finish();
        }
        if(a+1==1 && b+1==4)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","comment");
            startActivity(i);
            finish();
        }
        if(a+1==2 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","datatype");
            startActivity(i);
            finish();
        }
        if(a+1==3 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","variables");
            startActivity(i);
            finish();
        }
        if(a+1==3 && b+1==2)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","types_of_variables");
            startActivity(i);
            finish();
        }
        if(a+1==3 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","static in c++");
            startActivity(i);
            finish();
        }
        if(a+1==4 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","operator");
            startActivity(i);
            finish();
        }
        if(a+1==5 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","flowcontrol");
            startActivity(i);
            finish();
        }
        if(a+1==6 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","define function and types");
            startActivity(i);
            finish();
        }
        if(a+1==6 && b+1==2)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","defined_user_function");
            startActivity(i);
            finish();
        }
        if(a+1==7 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","Array basic");
            startActivity(i);
            finish();
        }
        if(a+1==7 && b+1==2)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","multidimensional_array");
            startActivity(i);
            finish();
        }
        if(a+1==7 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","array to function");
            startActivity(i);
            finish();
        }
        if(a+1==8 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","pointer_basics");
            startActivity(i);
            finish();
        }
        if(a+1==8 && b+1==2)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","pointers and array");
            startActivity(i);
            finish();
        }
        if(a+1==8 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","pointers and function");
            startActivity(i);
            finish();
        }

        if(a+1==9 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","oops principle");
            startActivity(i);
            finish();
        }
        if(a+1==9 && b+1==2)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","acess members");
            startActivity(i);
            finish();
        }
        if(a+1==9 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","inline function");
            startActivity(i);
            finish();
        }
        if(a+1==9 && b+1==4)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","function overloading");
            startActivity(i);
            finish();
        }
        if(a+1==9 && b+1==5)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","refrnce");
            startActivity(i);
            finish();
        }
        if(a+1==9 && b+1==6)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","constructor and destructor");
            startActivity(i);
            finish();
        }
        if(a+1==10 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","encapsulation");
            startActivity(i);
            finish();
        }
        if(a+1==11 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","abstraction");
            startActivity(i);
            finish();
        }
        if(a+1==12 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","Introduction and types of inheritance");
            startActivity(i);
            finish();
        }
        if(a+1==12 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","order of constructor");
            startActivity(i);
            finish();
        }

        if(a+1==12 && b+1==4)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","upcasting");
            startActivity(i);
            finish();
        }

        if(a+1==13 && b+1==1)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","function Overriding");
            startActivity(i);
            finish();
        }
        if(a+1==13 && b+1==2)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","virtual function");
            startActivity(i);
            finish();
        }
        if(a+1==13 && b+1==3)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","Abstract");
            startActivity(i);
            finish();
        }
        if(a+1==13 && b+1==4)
        {
            Intent i=new Intent(this, WebView.class);
            i.putExtra("url","virtual destructor");
            startActivity(i);
            finish();
        }
    }
}






