package com.vkc.c;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
 EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        et1=(EditText)findViewById(R.id.name);
        et2=(EditText)findViewById(R.id.pass);
    }
    public void Validate_User(View v)
    {

        String uname = et1.getText().toString().trim();
        String password = et2.getText().toString().trim();

        DataBaseActivity da = new DataBaseActivity(this);
        SQLiteDatabase db = da.getWritableDatabase();

        // String qry = "select password from User_Details where email= '" + uname + "'";

        String qry = "select password from User_Details where password= '" + password+ "'";

        Cursor c = db.rawQuery(qry, null);
        boolean res = c.moveToFirst();

        if (res)
        {
            String dbpass = c.getString(0);
            if (dbpass.equals(password))
            {
                Toast.makeText(this, "valid user", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,MainActivity.class);
                i.putExtra("k1",uname);
                startActivity(i);
            } else {
                Toast.makeText(this, "Invalid user", Toast.LENGTH_SHORT).show();
            }
        }

        else
        {
            Toast.makeText(getApplicationContext(), "Data not found", Toast.LENGTH_SHORT).show();
        }

    }
}
