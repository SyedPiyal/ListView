package com.datasoft.ndgtest.ui.home;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.datasoft.ndgtest.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyAdapter> {
    Context c;
    List<Model> list;
    int size;


    public Adapter(Context c, List<Model> list, int size){
        this.c = c;
        this.list = list;
        this.size = size;
    }

    @NonNull
    @Override
    public Adapter.MyAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.language,parent,false);
        return new MyAdapter(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyAdapter holder, int position) {

        Model model = list.get(position);
        holder.profileImage.setImageResource(model.getProfielImage());
        holder.name.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class MyAdapter extends RecyclerView.ViewHolder{

        ImageView profileImage;
        TextView name;

        public MyAdapter(@NonNull View itemView){
            super(itemView);
            profileImage = itemView.findViewById(R.id.imageView16);
            name = itemView.findViewById(R.id.textView22);

        }

    }
}
