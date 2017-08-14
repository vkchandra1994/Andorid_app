package com.vkc.c;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class SecondActivity extends AppCompatActivity
{
    HashMap<Integer,Pair<String,List<String>>>Topic_category;
    List<Integer>Topic_List;
    public  ExpandableListView Exp_list;
    DataProvider dataProvider=new DataProvider();
    CPPAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Exp_list=(ExpandableListView)findViewById(R.id.exp_list);
        Topic_category=dataProvider.getInfo();
        Topic_List=new ArrayList<Integer>(Topic_category.keySet());
        Collections.sort(Topic_List);
        adapter=new CPPAdapter(this,Topic_category,Topic_List);
        Exp_list.setAdapter(adapter);

    }
}

