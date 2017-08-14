package com.vkc.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CPPAdapter extends BaseExpandableListAdapter {
    private Context ctx;
    private HashMap<Integer, Pair<String,List<String>>> Topic_category;
    private List<Integer> Topic_List;

    public CPPAdapter(Context ctx, HashMap<Integer, Pair<String,List<String>>> Topic_category, List<Integer> Topic_List)
    {
        this.ctx = ctx;
        this.Topic_category=Topic_category;
        this.Topic_List = Topic_List;
    }

    @Override
    public int getGroupCount()
    {
        return this.Topic_List.size();
    }

    @Override
    public int getChildrenCount(int arg0) {
        return this.Topic_category.get(this.Topic_List.get(arg0)).second.size();
    }

    @Override
    public int getChildType(int groupPosition, int childPosition) {
        return super.getChildType(groupPosition, childPosition);
    }

    @Override
    public Object getGroup(int groupPosition) {

        return this.Topic_List.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.Topic_category.get(this.Topic_List.get(groupPosition)).second.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition)
    {
        return childPosition;

    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpand, View convertView, ViewGroup parent)
    {

     Integer group_title = Integer.parseInt(getGroup(groupPosition).toString());
       if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView = inflater.inflate(R.layout.parent_layout,null);

        }
        TextView parent_txt_view = (TextView) convertView.findViewById(R.id.parent_txt);
        parent_txt_view.setTypeface(null, Typeface.BOLD);
        //parent_txt_view.setTextColor(Color.WHITE);
        Log.v("number",group_title.toString());

        switch (group_title){
            case 1: parent_txt_view.setText("1.Introduction");
                break;
            case 2: parent_txt_view.setText("2.DataType");
                break;
            case 3:parent_txt_view.setText("3.Variables");
                break;
            case 4:parent_txt_view.setText("4.Operator");
                break;
            case 5:parent_txt_view.setText("5.Flow Control");
                break;
            case 6:parent_txt_view.setText("6.Function");
                break;
            case 7:parent_txt_view.setText("7.Array");
                break;
            case 8:parent_txt_view.setText("8.Pointer");
                break;
            case 9:parent_txt_view.setText("9.OOPS Concept");
                break;
            case 10:parent_txt_view.setText("10.Encapsulation");
                break;
            case 11:parent_txt_view.setText("11.Abstaction");
                break;
            case 12:parent_txt_view.setText("12.Inheritance");
                break;
            case 13:parent_txt_view.setText("13.Polymorphism");
                break;
            case 14:parent_txt_view.setText("14.Advance concept");
                break;
            default: parent_txt_view.setText("No Topic Available");
                break;
        }
        parent_txt_view.setTextColor(Color.WHITE);

        return convertView;
    }

    @Override
    public long getGroupId(int groupPosition)
    {
        return groupPosition;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, final boolean isLastChild, View convertView, ViewGroup parent) {
        final String child_title = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
           LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_layout,null);
        }

        final TextView child_txt_view = (TextView) convertView.findViewById(R.id.child_text);
        child_txt_view.setText(child_title);
        child_txt_view.setTextColor(Color.WHITE);
         convertView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i =new Intent(view.getContext(),DataInsertActivity.class);

                i.putExtra("title",child_title);
                i.putExtra("position",groupPosition);
                i.putExtra("position1",childPosition);
                view.getContext().startActivity(i);

               // Toast.makeText(CPPAdapter.this,"GroupItem Clicked", +Toast.LENGTH_SHORT).show();
            }
        });

    return convertView;
}

    @Override
    public boolean hasStableIds() {

        return true;
    }

    @Override
    public int getGroupType(int groupPosition) {
        return super.getGroupType(groupPosition);
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {

        return true;
    }
}
