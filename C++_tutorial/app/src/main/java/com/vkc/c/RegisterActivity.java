package com.vkc.c;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    int ids[]={R.id.et1,R.id.et2,R.id.et3,R.id.et4,R.id.et5,R.id.et6};
    EditText et[]=new EditText[6];
    String values[]=new String[et.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        for(int i=0;i<et.length;i++)
        {
            et[i]=(EditText)findViewById(ids[i]);
        }
    }
    public void RegisterPage(View view)
    {
        int i;
        for(i=0;i<et.length;i++) {
            values[i] = et[i].getText().toString().trim();
            if (values[i].isEmpty()) {
                et[i].requestFocus();
                et[i].setError("empty");
                break;
            }
        }
        if(i==et.length)
        {
            if(values[4].equals(values[5]))
            {
                int age=Integer.parseInt(values[1]);
                long cno=Long.parseLong(values[2]);

                DataBaseActivity da=new DataBaseActivity(this);
                SQLiteDatabase db= da.getWritableDatabase();
                String qry= "insert into User_Details values('"+values[0]+"',"+age+","+cno+",'"+values[3]+"','"+values[4]+"')";
                db.execSQL(qry);
                Toast.makeText(this,"user inserted",Toast.LENGTH_LONG).show();
                finish();
            }
            else
            {
                et[5].requestFocus();
                et[5].setError("password not matching");
            }
        }
        else
        {
            Toast.makeText(this,"First Enter Data",Toast.LENGTH_SHORT).show();
        }
    }

}


