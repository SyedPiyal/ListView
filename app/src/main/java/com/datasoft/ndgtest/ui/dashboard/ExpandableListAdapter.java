package com.datasoft.ndgtest.ui.dashboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.datasoft.ndgtest.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<Model> listDataHeader;
    private HashMap<String,List<String>> listHashMap;



    public ExpandableListAdapter(Context context,List<Model> listDataHeader,HashMap<String,List<String>> listHashMap ){
        this.context = context;
        this.listDataHeader = listDataHeader;
        this.listHashMap = listHashMap;

    }
    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listHashMap.get(listDataHeader.get(groupPosition).getName()).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listHashMap.get(listDataHeader.get(groupPosition).getName()).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }



    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {

        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView==null)
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_item_group,parent,false);
        TextView textView=(TextView)convertView.findViewById(R.id.textView);
        textView.setText(listDataHeader.get(groupPosition).getName());

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        if (convertView==null)

            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_item_list,parent,false);
        TextView textView3=(TextView)convertView.findViewById(R.id.textView3);
        textView3.setText(String.valueOf(getChild(groupPosition,childPosition)));
        return convertView;
    }

}
