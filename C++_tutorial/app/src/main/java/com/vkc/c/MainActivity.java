package com.vkc.c;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.sharable) {
            Intent sharingIntent=new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            // sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "AndroidSolved");
            // sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Now Learn Android with AndroidSolved clicke here to visit https://androidsolved.wordpress.com/ ");
            startActivity(Intent.createChooser(sharingIntent, "Share via"));
            return true;
        }
        if(id==R.id.log_id)
        {
            Intent intent=new Intent(this,LoginActivity.class);
            startActivity(intent);
        }

        if(id==R.id.reg_id)
        {
             Intent intent=new Intent(this,RegisterActivity.class);
            startActivity(intent);
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.cpp) {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(i);
        }
        else if (id == R.id.programs) {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            intent.putExtra("key","programs");
            startActivity(intent);
        }
        else if (id == R.id.question) {
            Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
            intent.putExtra("key","question");
            startActivity(intent);

        }
        else if (id == R.id.interview) {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            intent.putExtra("key","interview");
            startActivity(intent);
        }

        else if (id == R.id.mcq) {
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            intent.putExtra("key","mcq");
            startActivity(intent);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

