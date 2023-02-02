package com.datasoft.ndgtest.ui.dashboard;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.datasoft.ndgtest.R;
import com.datasoft.ndgtest.databinding.FragmentDashboardBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    private ExpandableListView expandableListView;
    private ExpandableListAdapter listAdapter;
    private List<Model> listDataHeader;
    private HashMap<String, List<String>> listHashMap;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
      //  expandableListView =(ExpandableListView);
        listDataHeader=new ArrayList<>();
        listHashMap=new HashMap<>();
        initData();
        listAdapter=new ExpandableListAdapter(requireActivity(),listDataHeader,listHashMap);
        binding.expandableListView.setAdapter(listAdapter);
        return root;



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void initData() {



        listDataHeader.add(new Model(R.drawable.ic_rectangle_19,"Getting started","7|item"));
        listDataHeader.add(new Model(R.drawable.ic_rectangle_20,"infotainment & multimedia", "10|Item"));
        listDataHeader.add(new Model(R.drawable.ic_rectangle_21,"driving aids","15|Item"));


        List<String> getStarted=new ArrayList<>();

        getStarted.add("this is windows 1");
        getStarted.add("this is windows 2");
        getStarted.add("this is windows 3");


        List<String>android=new ArrayList<>();

        android.add("this is android 1 ");
        android.add("this is android 2 ");
        android.add("this is android 3 ");


        List<String>iso=new ArrayList<>();

        iso.add("this is iso 1");
        iso.add("this is iso 2");
        iso.add("this is iso 3");


        listHashMap.put(listDataHeader.get(0).getName(),getStarted);
        listHashMap.put(listDataHeader.get(1).getName(),android);
        listHashMap.put(listDataHeader.get(2).getName(),iso);


    }
}