package com.datasoft.ndgtest.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.datasoft.ndgtest.R;
import com.datasoft.ndgtest.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView recyclerView;
    List<Model> list = new ArrayList<>();
    Adapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        addData();
        recyclerView = binding.recyclerView2;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(),list,list.size());
        recyclerView.setAdapter(adapter);
        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void addData(){
        list.add(new Model(R.drawable.ic_dansk,"Dansk"));
        list.add(new Model(R.drawable.ic_deutsch,"Deutsch"));
        list.add(new Model(R.drawable.ic_espanol,"Eesti keel"));
        list.add(new Model(R.drawable.ic_esti_keel,"Français"));
        list.add(new Model(R.drawable.ic_francais,"Italiano"));
        list.add(new Model(R.drawable.ic_italiano,"Español"));
        list.add(new Model(R.drawable.ic_latviski,"Latviski"));
        list.add(new Model(R.drawable.ic_lietuviu,"Lietuvių"));

    }
}